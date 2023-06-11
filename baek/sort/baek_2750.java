package baek.sort;

import java.io.*;
import java.util.Arrays;

public class baek_2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nList = new int[N];

        for (int i = 0; i < nList.length; i++) {

            nList[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(nList);

        for (int val : nList) {
            System.out.println(val);
        }
    }
}
