package baek.divisor_multiple_prime;

import java.util.Scanner;

public class baek_9506 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        while (true) {
            int n = sc.nextInt();
            if (n == -1)
                break;

            int[] arr = new int[n]; // 약수 담을 배열
            int sum = 0; // 약수들의 합
            int count = 0; // 약수 갯수
            for (int i = 1; i < n; i++) {
                if (n % i == 0) { // 약수일 때
                    sum += i; // 약수 합
                    count++;
                    arr[count] = i; // 약수 저장

                }
            }

            if (sum != n) {
                // System.out.println(n + " is NOT perfect.");
                sb.append(n + " is NOT perfect.\n");
                continue;
            }

            sb.append(n + " = ");
            for (int i = 1; i <= count; i++) {
                if (i == 1)
                    // System.out.print(arr[i]);
                    sb.append(arr[i]);
                else
                    sb.append(" + " + arr[i]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
        sc.close();
    }

}
