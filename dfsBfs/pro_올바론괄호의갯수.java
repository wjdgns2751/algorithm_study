package dfsBfs;

public class pro_올바론괄호의갯수 {
    int count = 0;

    public int solution(int n) {
        count = 0;
        dfs(0, 0, n);
        return count;
    }

    public void dfs(int left, int right, int n) {
        if (left < right)
            return; // 닫는 태그가 많을 경우
        if (left == n && right == n) {
            // 동일한 경우
            count++;
            return;
        }

        if (left > n || right > n)
            return;
        // 어느한쪽이 더 큰 경우

        dfs(left + 1, right, n);
        dfs(left, right + 1, n);

    }
}
