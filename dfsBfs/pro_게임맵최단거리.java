package dfsBfs;

import java.util.*;

public class pro_게임맵최단거리 {

    static int[] dx = { 0, 0, 1, -1 };
    static int[] dy = { 1, -1, 0, 0 };

    public static int solution(int[][] maps) {
        int answer = 0;
        int[][] visited = new int[maps.length][maps[0].length]; // 방문체크 배열 생성 (4,5)
        // 시작점 생성
        visited[0][0] = 1;

        // 최단거리는 여러군데를 확인 후 가장 빠른 경로를 찾으므로 BFS 구현
        bfs(maps, visited);

        // 도착지 정보
        answer = visited[maps.length - 1][maps[0].length - 1];

        if (answer == 0)
            return -1;

        return answer;
    }

    static void bfs(int[][] maps, int[][] visited) {
        // 큐 구현
        Queue<int[]> queue = new LinkedList<>(); // 방문할 좌표를 저장할 큐 생성
        queue.add(new int[] { 0, 0 }); // 현재 위치 저장

        while (!queue.isEmpty()) {
            int[] now = queue.poll(); // (0,0)을 queue에서 꺼내서 사용
            int x = now[0];
            int y = now[1];

            // 상하좌우 방문
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 범위여부 + 방문여부 + 올바른 경로 여부
                if (nx >= 0 && ny >= 0 && nx < maps.length && ny < maps[0].length && visited[nx][ny] == 0
                        && maps[nx][ny] == 1) {
                    // System.out.println("(" + nx + "," + ny + ") 현재 값 : " + visited[nx][ny]);
                    visited[nx][ny] = visited[x][y] + 1;
                    // System.out.println("-------- 더한 값 : " + visited[x][y] + 1);
                    // System.out.println("(" + nx + "," + ny + ") 반영 값 : " + visited[nx][ny]);

                    queue.add(new int[] { nx, ny });
                }
            }

        }

    }

    public static void main(String[] args) {
        int[][] map = { { 1, 0, 1, 1, 1 }, { 1, 0, 1, 0, 1 }, { 1, 0, 1, 1, 1 }, { 1, 1, 1, 0, 1 }, { 0, 0, 0, 0, 1 } };
        System.out.println(solution(map));
    }
}
