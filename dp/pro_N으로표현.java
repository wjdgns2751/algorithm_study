package dp;

import java.util.*;

public class pro_N으로표현 {
    public static int solution(int N, int number) {
        // N을 사용한 숫자의 집합을 담을 Set 배열을 생성합니다.
        // 최대 8번까지 N을 사용하여 만들 수 있는 숫자들을 담습니다.
        Set<Integer>[] setArr = new Set[9];
        int t = N;
        for (int i = 1; i < 9; i++) {
            // Set 인스턴스를 생성하고, 현재 N을 사용하여 만들 수 있는 숫자를 추가합니다.
            setArr[i] = new HashSet<>();
            setArr[i].add(t);
            // 다음에 추가될 숫자를 계산합니다.
            t = t * 10 + N;
        }
        // 동적 프로그래밍을 활용하여 문제를 해결합니다.
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < i; j++) {
                for (Integer a : setArr[j]) {
                    for (Integer b : setArr[i - j]) {
                        // 작은 개수의 숫자를 이용하여 큰 개수의 숫자를 만들어가며 연산을 수행합니다.
                        setArr[i].add(a + b);
                        setArr[i].add(a - b);
                        setArr[i].add(b - a);
                        setArr[i].add(a * b);
                        // 0으로 나누는 경우 예외 처리를 합니다.
                        if (b != 0) {
                            setArr[i].add(a / b);
                        }
                        if (a != 0) {
                            setArr[i].add(b / a);
                        }
                    }
                }
            }
        }
        // 목표 숫자가 생성된 집합에 속해 있는지 확인하고 결과를 반환합니다.
        for (int i = 1; i < 9; i++) {
            if (setArr[i].contains(number)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(5, 12));
    }
}
