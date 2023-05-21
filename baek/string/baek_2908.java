package baek.string;

import java.io.*;
import java.util.StringTokenizer;

public class baek_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());
        System.out.println(reverseNum(first, second));

    }

    public static int reverseNum(int first, int second) {
        int reverseNum = 0;
        int reverseNum2 = 0;
        while (first != 0) {
            reverseNum = reverseNum * 10 + first % 10;
            first /= 10;
        }

        while (second != 0) {
            reverseNum2 = reverseNum2 * 10 + second % 10;
            second /= 10;
        }

        return Math.max(reverseNum, reverseNum2);
    }
}
