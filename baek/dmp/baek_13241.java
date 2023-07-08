package baek.dmp;

import java.util.*;

public class baek_13241 {

    public static long gcd(long a, long b) {
        while (b != 0) {
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();

        long answer = a * b / gcd(a, b);

        System.out.println(answer);
        sc.close();

    }

}
