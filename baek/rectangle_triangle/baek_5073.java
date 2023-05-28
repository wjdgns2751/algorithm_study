package baek.rectangle_triangle;

import java.io.*;
import java.util.*;

public class baek_5073 {
    /*
     * Equilateral : 세 변의 길이가 모두 같은 경우
     * Isosceles : 두 변의 길이만 같은 경우
     * Scalene : 세 변의 길이가 모두 다른 경우
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a + b + c == 0) {
                break;
            }

            int max = 0;
            int extra = 0;
            if (a > b && b > c) {
                max = a;
                extra = b + c;
            } else if (b > a && a > c) {
                max = b;
                extra = a + c;
            } else {
                max = c;
                extra = a + b;
            }

            if (max >= extra) {
                sb.append("Invalid \n");
                continue;
            }

            if (a == b && a == c && b == c) {
                sb.append("Equilateral \n");
            } else if (a == b || a == c || b == c) {
                sb.append("Isosceles \n");
            } else if (a != b && a != c && b != c) {
                sb.append("Scalene \n");
            }

        }
        System.out.println(sb);
    }
}
