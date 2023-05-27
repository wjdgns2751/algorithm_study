package baek.divisor_multiple_prime;

import java.io.*;

public class baek_2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);

        int cnt = 0;
        int result = 0;
        for (int i = 1; i <= N; i++) {

            if (N % i == 0) {
                cnt++;
            }

            if (cnt == K) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}