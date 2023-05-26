package baek.gmath;

import java.io.*;

public class baek_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int crossNum = 1, prevSum = 0;

        while (true) {
            if (N <= prevSum + crossNum) {
                if (crossNum % 2 == 1) {
                    // 분자가 큰 수부터
                    // 분자 : 대각선 갯수 - (N - prevSum - 1)
                    // 분모 : N - prevSum
                    System.out.println((crossNum - (N - prevSum - 1)) + "/" + (N - prevSum));
                    break;
                } else {
                    System.out.println((N - prevSum) + "/" + (crossNum - (N - prevSum - 1)));
                    break;
                }
            } else {
                prevSum += crossNum;
                crossNum++;
            }
        }

    }
}
