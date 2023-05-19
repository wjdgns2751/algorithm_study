package baek.array;

import java.io.*;
import java.util.StringTokenizer;

public class baek_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String arr = br.readLine();
        StringTokenizer st = new StringTokenizer(arr, " ");

        int target = Integer.parseInt(br.readLine());

        int count = 0;

        for (int i = 0; i < n; i++)
            if (target == Integer.parseInt(st.nextToken()))
                count++;

        System.out.println(count);
    }
}
