package quiz0205;

import java.io.*;

//Quiz 2-5 prob 7
public class FloatToInteger {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("실수를 입력하세요: ");
        double n = Double.parseDouble(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.append("정수로 타입 변환된 값: ").append(String.valueOf((int)n)).append("\n");
        
        bw.flush();
        
        br.close();
        bw.close();
    }
}
