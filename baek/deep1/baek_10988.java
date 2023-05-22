package baek.deep1;

import java.io.*;

public class baek_10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        if (checkDrom(str)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }

    static boolean checkDrom(String str) {
        int length = str.length();

        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}
