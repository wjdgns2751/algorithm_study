package baek.array;

import java.io.*;
import java.util.*;

public class baek_10810 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String first = br.readLine();
        StringTokenizer st = new StringTokenizer(first, " ");
        int[] arr = new int[Integer.parseInt(st.nextToken())];
        int repeatNum = Integer.parseInt(st.nextToken());

        for (int i = 0; i < repeatNum; i++) {
            String element = br.readLine();
            StringTokenizer st2 = new StringTokenizer(element, " ");

            int left = Integer.parseInt(st2.nextToken());
            int right = Integer.parseInt(st2.nextToken());
            int value = Integer.parseInt(st2.nextToken());

            for (int j = left - 1; j < right; j++) {
                arr[j] = value;
            }
        }

        System.out.println(Arrays.toString(arr).replace(",", "").replaceAll("[\\[\\]]", ""));
    }
}