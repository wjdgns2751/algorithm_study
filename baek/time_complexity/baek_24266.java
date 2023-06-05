package baek.time_complexity;

import java.io.*;

public class baek_24266 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        System.out.println(n * n * n);
        System.out.println(3);
        /*
         * 7
         * 1 1 2 3 4 5 6 7 1 2 3 4 5 6 7
         * 2 1 2 3 4 5 6 7 1 2 3 4 5 6 7
         */
    }
}
