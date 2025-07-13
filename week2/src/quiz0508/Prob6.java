//Quiz 5-8 prob 6
package quiz0508;

interface Button6 {
    void click();
}


public class Prob6 {
    public static void main(String[] args) {
        Button6 button = new Button6() {
            @Override
            public void click() {
                System.out.println("Button clicked");
            }
        };
        button.click();
    }
} 