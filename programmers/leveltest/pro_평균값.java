package programmers.leveltest;

public class pro_평균값 {
    public static double solution(int[] arr) {
        double answer = 0;

        for (int cnt : arr)
            answer += cnt;

        answer /= arr.length;

        return answer;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        System.out.println(solution(arr));
    }
}
