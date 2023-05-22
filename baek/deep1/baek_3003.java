package baek.deep1;

import java.io.*;
import java.util.*;

public class baek_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        StringBuilder sb = new StringBuilder();

        int[] chessPieces = { 1, 1, 2, 2, 2, 8 }; // 각 체스 말의 필요한 개수

        for (int i = 0; i < chessPieces.length; i++) {
            int piece = Integer.parseInt(st.nextToken());
            int diff = chessPieces[i] - piece;
            System.out.print(diff + " ");
        }

        System.out.println(sb.toString());
    }
}
