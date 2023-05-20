package baek.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class baek_10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());

        int[] arr = new int[n + 1];

        for (int i = 0; i <= n; i++)
            arr[i] = i;

        for (int i = 0; i < n2; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int first = Integer.parseInt(st2.nextToken());
            int second = Integer.parseInt(st2.nextToken());

            reverse(arr, first, second);
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
