package baek.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collections;

public class baek_25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        if (!st.hasMoreTokens())
            st = new StringTokenizer(br.readLine(), " ");

        Integer[] n = new Integer[N];

        for (int i = 0; i < N; i++)
            n[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(n, Collections.reverseOrder());

        System.out.println(n[K - 1]);
    }
}
