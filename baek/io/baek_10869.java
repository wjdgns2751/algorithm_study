package baek.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class baek_10869 {
    // 사칙연산
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int plus = a + b;
        int minus = a - b;
        int multiplicaiton = a * b;
        int divide = a / b;
        int extr = a % b;

        System.out.println(plus);
        System.out.println(minus);
        System.out.println(multiplicaiton);
        System.out.println(divide);
        System.out.println(extr);

    }

}
