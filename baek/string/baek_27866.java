package baek.string;

import java.io.*;

public class baek_27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = Integer.parseInt(br.readLine());
        System.out.println(str.charAt(num - 1));
    }
}
