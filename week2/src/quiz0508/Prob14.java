//Quiz 5-8 prob 14
package quiz0508;

class Utility {
    static class Converter {
        public double celsiusToFahrenheit(double celsius) {
            return celsius * 9 / 5 + 32;
        }
    }
}


public class Prob14 {
    public static void main(String[] args) {
        Utility.Converter converter = new Utility.Converter();
        System.out.println(converter.celsiusToFahrenheit(0));
    }
} 