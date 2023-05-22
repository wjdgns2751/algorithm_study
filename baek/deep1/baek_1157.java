package baek.deep1;

import java.util.Scanner;

public class baek_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();
        int[] alphabet = new int[26];

        for (int i = 0; i < str.length(); i++) {
            alphabet[str.charAt(i) - 'A']++;
        }

        int max = 0;
        char maxC = '?';

        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] > max) {
                max = alphabet[i];
                maxC = (char) (i + 'A');
            } else if (alphabet[i] == max) {
                maxC = '?';
            }
        }
        sc.close();
        System.out.println(maxC);
    }
}
