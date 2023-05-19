package baek.loof;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class baek_25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long x = Long.parseLong(br.readLine());
        int n = Integer.parseInt(br.readLine());

        long temp = 0;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            long value = Long.parseLong(st.nextToken());
            int per = Integer.parseInt(st.nextToken());
            temp += value * per;
        }

        if (temp == x)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
