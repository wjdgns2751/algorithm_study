package 완전탐색;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class pro_1_minSquare {

    public int[] solution(int[] answers) {

        // 수포자들의 정답패턴
        int[][] patterns = { { 1, 2, 3, 4, 5 }, { 2, 1, 2, 3, 2, 4, 2, 5 }, { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 } };
        int[] score = { 0, 0, 0 };

        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < 3; j++) {
                int index = i % patterns[j].length;
                if (answers[i] == patterns[j][index]) {
                    score[j]++;
                }
            }
        }

        List<Integer> answer = new ArrayList<>();
        for (int s = 0; s < 3; s++) {
            if (score[s] == Arrays.stream(score).max().getAsInt()) {
                answer.add(s + 1);
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }

}
