package baek.string;

import java.io.*;

public class baek_9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String str = br.readLine();
            StringBuilder sb = new StringBuilder();
            sb.append(str.charAt(0));
            sb.append(str.charAt(str.length() - 1));
            System.out.println(sb.toString());
        }

    }
}
