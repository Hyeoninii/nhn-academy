package quiz0507;

public class AppleJuice implements Edible, Drinkable {
    @Override
    public void eat() {
        System.out.println("사과를 먹습니다.");
    }

    @Override
    public void drink() {
        System.out.println("주스를 마십니다.");
    }
} 