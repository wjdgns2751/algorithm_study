package programmers.binarySearch;

/**
 * pro3_1_예산
 */
public class pro_예산 {

    static int solution(int[] budgets, int M) {
        int answer = 0;
        int max = 0;
        int sum = 0;
        int min = 0;

        // 예산 중 최댓값 산정
        for (int budget : budgets) {
            max = Math.max(max, budget);
            sum += budget;
        }

        // 총 요청예산이 허용 예산보다 작을 경우 예산 중 최댓값 반환
        if (M >= sum)
            return max;

        // 이분탐색
        while (min <= max) {
            int mid = (min + max) / 2;
            System.out.println("mid : " + mid);
            int sum2 = 0;

            for (int budget : budgets) {
                if (budget > mid) { // 지자체별 요청한 예산이 예산중 최댓값의 반절보다 큰 경우 중간값 추가
                    sum2 += mid;
                    System.out.println("sum2 에 mid값 추가 : " + mid);
                }

                else {// 작은 경우는 예산추가
                    sum2 += budget;
                    System.out.println("sum2 에 budget값 추가 : " + budget);
                }
            }

            if (sum2 < M)
                min = mid + 1;
            else if (sum2 > M)
                max = mid - 1;
            else {
                answer = mid;
            }

            // System.out.println("sum2 값 : " + sum2);
            // System.out.println("max 값 : " + max);
            // System.out.println("min 값 : " + min);

        }

        answer = max;

        return answer;
    }

    public static void main(String[] args) {
        int arr[] = { 120, 110, 140, 150 };
        int a = 485;
        System.out.println(solution(arr, a));

        /*
         * mid max min
         * 75 150 76
         * 113
         * 
         */
    }

}