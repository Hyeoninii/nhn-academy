//Quiz 3-10 Prob 5
package quiz0310;

import textio.TextIO;
import java.io.*;

public class Prob5 {
    public static void main(String[] args) {

        double sum = 0;
        int noDataCount = 0;


            try (BufferedReader br = new BufferedReader(new FileReader("sales.dat"))) {
                String line;

                while ((line = br.readLine()) != null) {
                    int colonIndex = line.indexOf(':');
                    if (colonIndex == -1) continue;

                    String data = line.substring(colonIndex + 1).trim();
                    try {
                        double value = Double.parseDouble(data);
                        sum += value;
                    } catch (NumberFormatException e) {
                        noDataCount++;
                    }
                }

                TextIO.putln("모든 도시의 판매 총액: " + sum);
                TextIO.putln("데이터가 없는 도시의 개수: " + noDataCount);

            } catch (IOException e) {
                TextIO.putln("파일을 읽는 중 오류 발생: " + e.getMessage());
            }


        System.out.println("모든 도시의 판매 총액: " + sum);
        System.out.println("데이터가 없는 도시의 개수: " + noDataCount);
    }
}
