package baek.divisor_multiple_prime;

import java.io.*;
import java.util.StringTokenizer;

public class baek_5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        String f = "factor\n";
        String m = "multiple\n";
        String n = "neither\n";
        StringBuilder sb = new StringBuilder();

        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());

            if (first == 0 && second == 0)
                break;

            if (second % first == 0) {
                sb.append(f);
            } else if (first % second == 0) {
                sb.append(m);
            } else {
                sb.append(n);
            }
        }
        System.out.println(sb);
    }
}