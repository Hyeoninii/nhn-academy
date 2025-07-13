package quiz0507;

public class Calculator implements Calculable{
    @Override
    public int add(int a, int b) {
        return a + b;
    }
    //multiply는 default로 구현되어 필요 없음!
}
