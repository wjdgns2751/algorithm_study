package baek.string;

import java.io.*;

public class baek_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int time = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int dialNum = getDialNum(c);
            time += dialNum + 1;
        }

        System.out.println(time);
    }

    public static int getDialNum(char c) {
        if (c >= 'A' && c <= 'C') {
            return 2;
        } else if (c >= 'D' && c <= 'F') {
            return 3;
        } else if (c >= 'G' && c <= 'I') {
            return 4;
        } else if (c >= 'J' && c <= 'L') {
            return 5;
        } else if (c >= 'M' && c <= 'O') {
            return 6;
        } else if (c >= 'P' && c <= 'S') {
            return 7;
        } else if (c >= 'T' && c <= 'V') {
            return 8;
        } else {
            return 9;
        }
    }
}
