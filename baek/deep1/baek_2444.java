package baek.deep1;

import java.util.Scanner;

public class baek_2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        for (int i = 1; i <= s; i++) {
            for (int j = 1; j <= s - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = s - 1; i >= 1; i--) {
            for (int j = 1; j <= s - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
