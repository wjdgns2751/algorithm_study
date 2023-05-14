package hash;

import java.util.*;

public class pro_방울 {
    public static int solution(int[] bell) {
        for (int i = 0; i < bell.length; i++) {
            if (bell[i] == 2) {
                bell[i] = -1;
            }
        }

        int total = bell[0];
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        map.put(total, 0);

        for (int i = 1; i < bell.length; i++) {
            total += bell[i];
            if (!map.containsKey(total)) {
                map.put(total, i);
            } else {
                answer = Math.max(answer, i - map.get(total));
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] bell = { 1, 2, 1, 1, 1, 2, 2, 1 };
        System.out.println(solution(bell));
    }
}
