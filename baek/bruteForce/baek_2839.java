package baek.bruteForce;

import java.util.Scanner;

public class baek_2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        // 3 , 5
        int a = 3;
        int b = 5;
        int value = 0;

        if (N == 4 || N == 7) {
            value = -1; // 3 , 5로 나누어 떨어지지 않는 수
        } else {
            int remainder = N % b;
            if (remainder == 0) {
                value = N / b;
            } else if (remainder == 1 || remainder == a) {
                value = N / b + 1;
            } else if (remainder == 2 || remainder == 4) {
                value = N / b + 2;
            } else {
                value = 0;
            }
        }

        System.out.println(value);
    }
}
