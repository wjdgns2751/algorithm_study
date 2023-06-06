package baek.bruteForce;

import java.util.Scanner;

public class baek_2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int value = 0;

        for (int i = 0; i < N; i++) {
            int num = i;
            int sum = 0;

            while (num != 0) {
                sum += num % 10; // 각 자릿수 더하기
                num /= 10;
            }

            if (sum + i == N) {
                value = i;
                break;
            }
        }
        System.out.println(value);
    }
}
