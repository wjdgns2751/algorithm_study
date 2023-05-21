package baek.string;

import java.io.*;

public class baek_10809 {
    public static void main(String[] args) throws IOException {
        int[] isCount = new int[26];
        for (int i = 0; i < isCount.length; i++)
            isCount[i] = -1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int index = ch - 'a';
            if (isCount[index] == -1)
                isCount[index] = i;

        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < isCount.length; i++)
            sb.append(isCount[i] + " ");

        System.out.println(sb.toString());
    }

}
