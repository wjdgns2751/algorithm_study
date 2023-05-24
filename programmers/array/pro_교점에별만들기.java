package programmers.array;

import java.util.*;

public class pro_교점에별만들기 {
    public static void main(String[] args) {
        int line[][] = { { 2, -1, 4 }, { -2, -1, 4 }, { 0, -1, 1 }, { 5, -8, -12 }, { 5, 8, 12 } };
        String resultList[] = solution(line);

        for (String result : resultList)
            System.out.println("result : " + result);

    }

    private static class Point {
        public final long x, y;

        // 좌표
        private Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

    public static String[] solution(int[][] line) {
        List<Point> points = new ArrayList<>();

        // 1. 모든 직선에 대한 반복
        for (int i = 0; i < line.length; i++) {
            for (int j = i + 1; j < line.length; j++) {
                Point intersection = intersection(line[i][0], line[i][1], line[i][2], line[j][0], line[j][1],
                        line[j][2]);

                if (intersection != null)
                    points.add(intersection);
            }
        }

        Point minPoint = getMinPoint(points);
        Point maxPoint = getMaxPoint(points);

        int width = (int) (maxPoint.x - minPoint.x + 1);
        int height = (int) (maxPoint.y - minPoint.y + 1);

        char[][] arr = new char[height][width];
        for (char[] row : arr)
            Arrays.fill(row, '.');

        for (Point p : points) {
            // 2차원 배열에 별 찍기
            int x = (int) (p.x - minPoint.x);
            int y = (int) (maxPoint.y - p.y);
            arr[y][x] = '*';
        }

        String[] result = new String[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = new String(arr[i]);
        }
        return result;

    }

    private static Point intersection(long a1, long b1, long c1, long a2, long b2, long c2) {
        // 교점 구해서 반환하기
        double x = (double) (b1 * c2 - b2 * c1) / (a1 * b2 - a2 * b1);
        double y = (double) (a2 * c1 - a1 * c2) / (a1 * b2 - a2 * b1);

        // 나머지 값이 있으면 실수이므로 정수만 반환되도록 조치
        if (x % 1 != 0 || y % 1 != 0)
            return null;

        return new Point((long) x, (long) y);
    }

    private static Point getMaxPoint(List<Point> points) {
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;

        for (Point point : points) {
            if (point.x > x)
                x = point.x;
            if (point.y > y)
                y = point.y;

        }
        return new Point(x, y);
    }

    private static Point getMinPoint(List<Point> points) {
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;

        for (Point point : points) {
            if (point.x < x)
                x = point.x;
            if (point.y < y)
                y = point.y;

        }
        return new Point(x, y);
    }
}
