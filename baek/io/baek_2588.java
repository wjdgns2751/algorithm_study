package baek.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class baek_2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int first = Integer.parseInt(br.readLine());
        String second = br.readLine();

        for (int i = second.length() - 1; i >= 0; i--) {
            Character a = second.charAt(i);
            System.out.println(first * Integer.parseInt(a.toString()));
        }
        System.out.println(first * Integer.parseInt(second));
    }
}
