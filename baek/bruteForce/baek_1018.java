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

        arr = new boolean[N][M];

        int min = 64;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == 'W')
                    arr[i][j] = true;
                else
                    arr[i][j] = false;
            }
        }

        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                int count = 0;
                boolean board = arr[i][j];

                for (int k = i; k < i + 8; k++) {
                    for (int l = j; l < j + 8; l++) {
                        if (arr[k][l] != board)
                            count++;
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
