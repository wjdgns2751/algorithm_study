package sort;

import java.util.Arrays;

public class pro_가장큰수 {
    public String solution(int[] numbers) {
        String[] arr = new String[numbers.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        // {3, 30, 34, 5, 9} 인 경우
        // o1 = 3, o2 = 30: "303"과 "330"을 비교
        // o1 = 30, o2 = 34: "3430"과 "3034"를 비교
        // 위와 같이 비교 하여 내림차순으로 정렬
        // 순회 완료 시 {9, 5, 34, 3, 30} 로 정렬

        if (arr[0].equals("0")) {
            return "0";
        }

        StringBuilder answer = new StringBuilder();
        // String 은 불변클래스 이므로 가변클래스인 StringBuilder를 생성하여 효율성을 증대
        for (int i = 0; i < arr.length; i++) {
            answer.append(arr[i]);
        }

        return answer.toString();
    }
}
