//Quiz 5-3 prob 4
package quiz0503;

//import javafx.scene.paint.Color;
import java.util.Random;

public class Prob4 {

    public static void main(String[] args) {
        Random rand = new Random();

        // 0~255 범위의 랜덤 RGB 성분 생성
        int r = rand.nextInt(256);
        int g = rand.nextInt(256);
        int b = rand.nextInt(256);

        // 0~1 범위로 변환하여 Color 객체 생성
        ///Color color = Color.rgb(r, g, b);

        // 성분 출력
        System.out.println("랜덤 색상 생성:");
        //System.out.println("Red: " + color.getRed());
        //System.out.println("Green: " + color.getGreen());
        //System.out.println("Blue: " + color.getBlue());
    }
}