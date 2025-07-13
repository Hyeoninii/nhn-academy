//Quiz 5-8 prob 20
package quiz0508;

class Outer20 {
    static class Factory {
        public static Outer20 createInstance() {
            return new Outer20();
        }
    }
}


public class Prob20 {
    public static void main(String[] args) {
        Outer20 instance = Outer20.Factory.createInstance();
        System.out.println(instance != null ? "Instance created!" : "Creation failed.");

    }
} 