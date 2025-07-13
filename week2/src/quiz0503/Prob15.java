//Quiz 5-3 prob 15
package quiz0503;

import java.util.Arrays;

public class Prob15 {

    public static void main(String[] args) {
        Student15[] arr =  new Student15[2];
        arr[0] = new Student15("Alice", 90);
        arr[1] = new Student15("Bob", 80);

        for(Student15 s : arr){
            s.printInfo();
        }
    }
}

class Student15 {
    String name;
    int score;
    public Student15(String name, int score) {
        this.name = name;
        this.score = score;
    }
    void printInfo() {
        System.out.println("name: " + this.name + ", score: " + this.score);
    }
}