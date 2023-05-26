package baek.gmath;

import java.util.Scanner;

public class baek_2292 {
    /*
     * 1 : 1
     * 2 : 2,3,4,5,6,7
     * 3 : 8,9,10,11,12,13 14,15,16,17,18,19
     * 4 : 20,21,22,23,24,25 26,27,28,29,30,31 32,33,34,35,36,37
     * 
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.close();

        int count = 1;
        int range = 2;

        if (N == 1) {
            System.out.println(1);
        }

        else {
            while (range <= N) { // 범위가 N보다 커지기 직전까지 반복
                range = range + (6 * count); // 다음 범위의 최솟값으로 초기화
                count++; // count 1 증가
            }
            System.out.print(count);
        }

        // System.out.println(result);
    }
}
