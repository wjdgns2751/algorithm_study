package programmers.hash;

import java.util.*;
import java.util.Iterator.*;
import java.util.stream.*;

public class pro_위장 {
    public static int solution(String[][] clothes) {
        // 1. 옷을 종류별로 구별
        HashMap<String, Integer> map = new HashMap<>();

        for (String[] cloth : clothes) {
            String type = cloth[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        // 2. 입지 않는경우
        Iterator<Integer> iter = map.values().iterator();
        int answer = 1;

        while (iter.hasNext())
            answer *= iter.next().intValue() + 1;

        // 3. 아무것도 입지 않을 경우
        return answer - 1;
    }

    public static int solution2(String[][] clothes) {
        return Arrays.stream(clothes)
                .map(c -> c[1])
                .distinct()
                .map(type -> (int) Arrays.stream(clothes).filter(c -> c[1].equals(type)).count())
                .map(c -> c + 1)
                .reduce(1, (c, n) -> c * n) - 1;
    }

    public static void main(String[] args) {
        String[][] clothes = { { "yellow_hat", "headgear" }, { "blue_sunglasses", "eyewear" },
                { "green_turban", "headgear" } };

        System.out.println(solution(clothes));
    }
}
