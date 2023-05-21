package baek.string;

import java.io.*;
import java.util.StringTokenizer;

public class baek_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            int repeatNum = Integer.parseInt(st.nextToken());
            String repeatStr = st.nextToken();
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < repeatStr.length(); j++) {
                char c = repeatStr.charAt(j);
                for (int k = 0; k < repeatNum; k++)
                    sb.append(c);
            }
            System.out.println(sb.toString());
        }
    }
}
