package baek.time_complexity;

import java.io.*;

public class baek_24267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        br.close();
        System.out.println((n * (n - 1) * (n - 2) / 6));
        System.out.println(3);

        // 7
        /*
         * i j k
         * 1 [2,3,4,5,6] [3,4,5,6,7]
         * 2 [3,4,5,6] [4,5,6,7]
         * 3 [4,5,6] [5,6,7]
         * 4 [5,6] [6,7]
         * 5 [6] [7]
         * nCr
         * 
         */
    }
}
