package programmers.greedy;

class pro_유니폼 {
    // 프로그래머스
    // 체육복 문제 (greddy)
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        // 학생 배열 생성
        int[] students = new int[n];

        // 상태 : 여분 : 1 , 도난 : -1 , 통과 : 0
        for (int i : reserve)
            students[i]++;

        for (int i : lost)
            students[i]--;

        for (int i = 1; i < n; i++) {
            if (students[i] == 1) {
                if (students[i - 1] == -1) {
                    students[i - 1]++;
                    students[i]++;
                } else if (students[i + 1] == -1) {
                    students[i + 1]++;
                    students[i]--;
                }
            }
        }

        for (int i = 1; i < n; i++) {
            if (students[i] >= 0) {
                answer++;
            }
        }
        return answer;
    }

}
