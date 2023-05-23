package baek.doubleArray;

import java.io.*;
import java.util.StringTokenizer;

public class baek_2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] aa = new int[N][M];
        int[][] bb = new int[N][M];

        for (int i = 0; i < N; i++) {
            String element = br.readLine();
            StringTokenizer st2 = new StringTokenizer(element, " ");

            for (int j = 0; j < M; j++) {
                aa[i][j] = Integer.parseInt(st2.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            String element = br.readLine();
            StringTokenizer st2 = new StringTokenizer(element, " ");

            for (int j = 0; j < M; j++) {
                bb[i][j] = Integer.parseInt(st2.nextToken());
            }
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sb.append(aa[i][j] + bb[i][j] + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
