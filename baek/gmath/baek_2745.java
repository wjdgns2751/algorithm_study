package baek.gmath;

import java.io.*;
import java.util.StringTokenizer;

public class baek_2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        String ele = st.nextToken();
        int base = Integer.parseInt(st.nextToken());
        int result = 0;
        int pow = 1;
        for (int i = ele.length() - 1; i >= 0; i--) {
            char c = ele.charAt(i);
            int value = Character.isDigit(c) ? c - '0' : c - 'A' + 10;
            result += value * pow;
            pow *= base;
        }

        System.out.println(result);
    }
}