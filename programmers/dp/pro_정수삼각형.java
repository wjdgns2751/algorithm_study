package programmers.dp;

class pro_정수삼각형 {

    public static int solution(int[][] triangle) {
        int answer = 0;
        for (int floor = 1; floor < triangle.length; floor++) {
            for (int num = 0; num < triangle[floor].length; num++) {

                // 1층의 갑과 현재의 값을 비교
                if (num == 0) {
                    // 왼쪽끝
                    triangle[floor][num] = triangle[floor - 1][num] + triangle[floor][num];
                } else if (floor == num) {
                    // 오른쪽끝
                    triangle[floor][num] = triangle[floor - 1][num - 1] + triangle[floor][num];
                } else {
                    int left = triangle[floor - 1][num - 1] + triangle[floor][num];
                    int right = triangle[floor - 1][num] + triangle[floor][num];
                    triangle[floor][num] = Math.max(left, right);
                }

                answer = Math.max(triangle[floor][num], answer);
            }
            // System.out.println(floor + " floor : " + answer);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] triangle = { { 7 }, { 3, 8 }, { 8, 1, 0 }, { 2, 7, 4, 4 }, { 4, 5, 2, 6, 5 } };
        solution(triangle);
    }
}