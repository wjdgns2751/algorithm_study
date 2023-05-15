package dfsBfs;

import java.beans.Visibility;
import java.util.*;

public class pro_게임맵최단거리2 {

    static class Position {
        int x, y;

        Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        boolean isValid(int width, int height) {
            if (x < 0 || x >= width)
                return false;
            if (y < 0 || y >= height)
                return false;
            return true;

        }
    }

    public static int solution(int[][] maps) {
        // BFS
        Queue<Position> queue = new LinkedList<>();
        int mapHeight = maps.length;
        int mapWidth = maps[0].length;
        int[][] count = new int[mapHeight][mapWidth];
        boolean[][] visited = new boolean[mapHeight][mapWidth];

        queue.offer(new Position(0, 0)); // 초깃값
        count[0][0] = 1;
        visited[0][0] = true;
        while (!queue.isEmpty()) {
            Position curr = queue.poll();

            int currCount = count[curr.y][curr.x];

            final int[][] moving = { { 0, -1 }, { 0, 1 }, { -1, 0 }, { 1, 0 } };
            for (int i = 0; i < moving.length; i++) {
                Position move = new Position(curr.x + moving[i][0], curr.y + moving[i][1]);
                if (!move.isValid(mapWidth, mapHeight))
                    continue;
                if (visited[move.y][move.x])
                    continue;
                if (maps[move.y][move.x] == 0)
                    continue;

                count[move.y][move.x] = currCount + 1;
                visited[move.y][move.x] = true;
                queue.offer(move);
            }

        }
        int answer = count[mapHeight - 1][mapWidth - 1];
        if (answer == 0)
            return -1;
        return answer;
    }

    public static void main(String[] args) {
        int[][] map = { { 1, 0, 1, 1, 1 }, { 1, 0, 1, 0, 1 }, { 1, 0, 1, 1, 1 }, { 1, 1, 1, 0, 1 }, { 0, 0, 0, 0, 1 } };
        System.out.println(solution(map));
    }
}
