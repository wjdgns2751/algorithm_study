package programmers.dfsBfs;

public class pro_타켓넘버 {
    int[] numbers;
    int target;
    int answer;

    // 트리가 깊고 좁은 경우 사용
    // DFS (깊이 우선 탐색) 사용
    // 스택 자료구조 이용

    void dfs(int index, int sum) {
        // 1. 탈출 조건
        if (index == numbers.length) {
            if (sum == target)
                answer++;
            return;
        }

        // 2. 수행 동작
        dfs(index + 1, sum + numbers[index]);
        dfs(index + 1, sum - numbers[index]);
    }

    public int solution(int[] numbers, int target) {
        answer = 0;
        this.numbers = numbers;
        this.target = target;

        dfs(0, 0);
        return answer;
    }

    public static void main(String[] args) {

    }
}
