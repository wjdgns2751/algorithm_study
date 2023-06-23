package baek.sort;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class baek_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] Nl = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++)
            Nl[i] = Integer.parseInt(st.nextToken());

        int[] N2 = Nl.clone();

        Arrays.sort(N2);

        HashMap<Integer, Integer> map = new HashMap<>();

        int rank = 0;
        for (int n : N2) {
            if (!map.containsKey(n)) {
                map.put(n, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < Nl.length; i++)
            sb.append(map.get(Nl[i]) + " ");

        System.out.println(sb);
    }
}