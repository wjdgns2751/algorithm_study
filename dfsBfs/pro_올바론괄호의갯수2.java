package dfsBfs;

import java.util.*;

public class pro_올바론괄호의갯수2 {
    class Point {
        int left, right;

        Point(int left, int right) {
            this.left = left;
            this.right = right;
        }
    }

    public int solution(int n) {
        int answer = 0;

        Stack<Point> stack = new Stack<>();
        stack.push(new Point(0, 0));
        while (!stack.isEmpty()) {
            Point point = stack.pop();

            if (point.left > n)
                continue;
            if (point.left < point.right)
                continue;
            if (point.left + point.right == 2 * n) {
                answer++;
                continue;
            }
            stack.push(new Point(point.left + 1, point.right));
            stack.push(new Point(point.left, point.right + 1));
        }
        return answer;
    }
}
