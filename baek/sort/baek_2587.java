package baek.sort;

import java.util.Scanner;
import java.util.Arrays;

public class baek_2587 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Nl = new int[5];
        int count = 0;
        for (int i = 0; i < 5; i++) {
            int N = sc.nextInt();
            count += N;
            Nl[i] = N;
        }

        Arrays.sort(Nl);
        StringBuilder sb = new StringBuilder();
        sb.append(count / 5 + "\n");
        sb.append(Nl[2]);
        System.out.println(sb.toString());
        sc.close();
    }
}
