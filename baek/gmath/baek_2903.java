package baek.gmath;

import java.util.Scanner;

public class baek_2903 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int point = 3;
        int[] NList = new int[16];

        for (int i = 0; i < NList.length; i++) {
            NList[i] = point * point;
            point = point + (point - 1);
        }
        System.out.println(NList[N - 1]);
        sc.close();
    }
}
