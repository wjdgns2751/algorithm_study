package baek.gmath;

import java.util.Scanner;

public class baek_11005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        StringBuilder sb = new StringBuilder();

        while (N > 0) {
            int remainer = N % B;
            if (remainer < 10) {
                sb.append((char) (remainer + '0'));

            } else {
                sb.append((char) (remainer - 10 + 'A'));
            }
            N /= B;

        }

        System.out.println(sb.reverse());

    }
}
