package baek.doubleArray;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baek_2563 {
    public static void main(String[] args) throws IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        boolean[][] checkNum = new boolean[101][101];
        for (boolean[] checkX : checkNum)
            Arrays.fill(checkX, false);

        for (int i = 0; i < num; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    checkNum[j][k] = true;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < checkNum.length; i++) {
            for (int j = 0; j < checkNum[i].length; j++) {

                if (checkNum[i][j] != false)
                    count++;
            }
        }

        System.out.println(count);
    }
}