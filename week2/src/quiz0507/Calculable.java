package quiz0507;

public interface Calculable{
    int add(int a, int b);
    default int multiply(int a, int b){
        return a*b;
    }
}
