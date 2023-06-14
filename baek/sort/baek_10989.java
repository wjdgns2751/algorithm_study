package baek.sort;

import java.io.*;
import java.util.*;

public class baek_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] Nl = new int[N];

        for (int i = 0; i < N; i++)
            Nl[i] = Integer.parseInt(br.readLine());

        Arrays.sort(Nl);

        StringBuilder sb = new StringBuilder();

        for (int n : Nl)
            sb.append(n).append("\n");

        System.out.println(sb.toString());

    }
}
