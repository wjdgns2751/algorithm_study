package baek.loof;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class baek_25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int val = num / 4;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < val; i++) {
            sb.append("long ");
        }
        sb.append("int");

        System.out.println(sb.toString());
    }
}
