//quiz 3-10 SimpleAnimationStarter
package quiz0310;

import java.awt.*;
import javax.swing.*;

public class SimpleAnimationStarter extends JPanel implements Runnable {
    private int frameNumber = 0;
    private final int FPS = 60;
    private final int[] cycleSpeeds = {120, 180, 240}; 
    private final int[] oscSpeeds = {120, 180, 240}; 
    private final Color[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.CYAN, Color.MAGENTA, Color.YELLOW};
    private final int rectWidth = 40, rectHeight = 40;
    private final int margin = 20;
    private final int lineHeight = 50;
    private final int numRects = 6;

    public SimpleAnimationStarter() {
        setPreferredSize(new Dimension(500, 6 * lineHeight + margin));
        setBackground(Color.WHITE);
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();

        g.setColor(Color.BLACK);
        for (int i = 1; i < numRects; i++) {
            g.drawLine(0, i * lineHeight, width, i * lineHeight);
        }

        for (int i = 0; i < 3; i++) {
            int N = cycleSpeeds[i];
            int cyclicFrame = frameNumber % N;
            int x = margin + (width - rectWidth - 2 * margin) * cyclicFrame / (N - 1);
            int y = i * lineHeight + (lineHeight - rectHeight) / 2;
            g.setColor(colors[i]);
            g.fillRect(x, y, rectWidth, rectHeight);
        }

        for (int i = 0; i < 3; i++) {
            int N = oscSpeeds[i];
            int oscFrame = frameNumber % (2 * N);
            if (oscFrame >= N) {
                oscFrame = 2 * N - oscFrame;
            }
            int x = margin + (width - rectWidth - 2 * margin) * oscFrame / (N - 1);
            int y = (i + 3) * lineHeight + (lineHeight - rectHeight) / 2;
            g.setColor(colors[i + 3]);
            g.fillRect(x, y, rectWidth, rectHeight);
        }
    }

    @Override
    public void run() {
        while (true) {
            frameNumber++;
            repaint();
            try {
                Thread.sleep(1000 / FPS);
            } catch (InterruptedException e) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Animation Starter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new SimpleAnimationStarter());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
} 