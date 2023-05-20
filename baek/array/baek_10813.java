package baek.array;

import java.io.*;
import java.util.*;

public class baek_10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int first = Integer.parseInt(st.nextToken());
        int arr[] = new int[first];

        for (int i = 0; i < first; i++)
            arr[i] = i + 1;

        int second = Integer.parseInt(st.nextToken());

        for (int j = 0; j < second; j++) {
            String e = br.readLine();
            StringTokenizer st2 = new StringTokenizer(e, " ");
            int left = Integer.parseInt(st2.nextToken());
            int right = Integer.parseInt(st2.nextToken());

            int temp = arr[left - 1];
            arr[left - 1] = arr[right - 1];
            arr[right - 1] = temp;

        }

        String a = Arrays.toString(arr).replace(",", "").replaceAll("[\\[\\]]", "");
        System.out.println(a);
    }
}
