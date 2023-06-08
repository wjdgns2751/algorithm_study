package baek.bruteForce;

import java.io.*;
import java.util.*;

public class baek_1018 {
    public static void main(String[] args) throws IOException {
        boolean[][] arr;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 체스판의 크기를 입력에서 읽어와 N과 M에 저장
        arr = new boolean[N][M];

        // 최대 변경 횟수
        int min = 64;

        // 배열의 각 요소는 입력의 해당하는 사각형이 'W' (흰색)인 경우 true로 설정되고, 그렇지 않은 경우 false로 설정
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == 'W')
                    arr[i][j] = true;
                else
                    arr[i][j] = false;
            }
        }

        // 모든 board 를 순회
        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                // 변경 횟수를 추적하기 위한 count 변수가 초기화
                int count = 0;
                // 첫 번째 사각형의 예상 색상을 저장하는 데 사용
                boolean board = arr[i][j];

                // 각 사각형의 색상을 예상 색상인 board와 비교. 만약 다르다면,count 변수가 증가
                for (int k = i; k < i + 8; k++) {
                    for (int l = j; l < j + 8; l++) {
                        if (arr[k][l] != board)
                            count++;
                        // 예상 색상을 번갈아가며 수정
                        board = !board;
                    }
                    board = !board;
                }

                count = Math.min(count, 64 - count);
                min = Math.min(min, count);
            }
        }

        System.out.println(min);

    }
}
