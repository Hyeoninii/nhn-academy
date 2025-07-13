package quiz0206;

import my.packages.Person;
import java.util.Scanner;

public class Prob6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;

        name = sc.nextLine();
        age = sc.nextInt();

        Person p = new Person(name, age);
        p.printInfo();

        sc.close();
    }
}