//Quiz 5-8 prob 19
package quiz0508;

interface ClickListener {
    void onClick();
}

public class Prob19 {
    public static void main(String[] args) {
        ClickListener listener = new ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Button clicked!");
            }
        };

        listener.onClick();

    }
} 