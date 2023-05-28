package baek.rectangle_triangle;

import java.io.*;
import java.util.*;

public class baek_9063 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        int[] x = new int[n], y = new int[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(x);
        Arrays.sort(y);

        System.out.print((x[n - 1] - x[0]) * (y[n - 1] - y[0]));
    }
}
