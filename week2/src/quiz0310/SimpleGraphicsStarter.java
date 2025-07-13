//Quiz 3-10 Prob 8
package quiz0310;

import java.awt.*;
import javax.swing.*;

public class SimpleGraphicsStarter extends JPanel {

    public void drawPicture(Graphics g) {
        int size = 50;
        for (int row=0; row<8; row++) {
            for (int col=0; col<8; col++) {
                if ((row%2 == col%2)) {
                    g.setColor(Color.RED);
                } else {
                    g.setColor(Color.BLACK);
                }
                g.fillRect(col*size, row*size, size, size);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawPicture(g);
    }
    public static void main(String[] args) {
        JFrame window = new JFrame("체커보드");
        SimpleGraphicsStarter panel = new SimpleGraphicsStarter();
        window.setContentPane(panel);
        window.setSize(400, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
} 