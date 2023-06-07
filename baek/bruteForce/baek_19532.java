package baek.bruteForce;

import java.io.*;
import java.util.StringTokenizer;

public class baek_19532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int x = 0, y = 0;
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        int det = a * e - b * d;

        if (det != 0) {
            x = (e * c - b * f) / det;
            y = (a * f - d * c) / det;

        }
        System.out.println(x + " " + y);
    }
}
