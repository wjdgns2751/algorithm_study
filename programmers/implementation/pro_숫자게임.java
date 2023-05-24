package programmers.implementation;

import java.util.Arrays;

/**
 * pro4_1_숫자게임
 */
public class pro_숫자게임 {

    // 두 배열을 비교하여 B팀이 승리할때 최다승하는 방법
    static int solution(int[] a, int[] b) {
        int answer = 0;
        Arrays.sort(a);
        Arrays.sort(b);

        int aI = 0;
        int bI = 0;
        while (aI != a.length && bI != b.length) {
            if (a[aI] < b[bI]) {
                answer++;
                aI++;
            }
            bI++;
        }

        return answer;

    }

    public static void main(String[] args) {
        int[] a = { 5, 1, 3, 7 };
        int[] b = { 2, 2, 6, 8 };
        System.out.println(solution(a, b));

    }

}