package baek.bruteForce;

import java.util.Scanner;

public class baek_1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int num = 666;
        int cnt = 1;

        while (cnt != N) {
            num++;
            if (String.valueOf(num).contains("666"))
                cnt++;
        }

        System.out.println(num);
    }
}
