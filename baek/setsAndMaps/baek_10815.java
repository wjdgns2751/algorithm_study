package baek.setsAndMaps;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baek_10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        // 숫자 카드 오름차순 정렬
        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            // 이분 탐색을 해서 해당 숫자가 있는 경우
            if (binarySearch(arr, num, n))
                sb.append(1 + " ");
            // 이분 탐색을 해서 해당 숫자가 없는 경우
            else
                sb.append(0 + " ");
        }
        System.out.println(sb.toString());
        br.close();
    }

    private static boolean binarySearch(int[] arr, int num, int n) {
        int startIndex = 0;
        int lastIndex = n - 1;

        while (startIndex <= lastIndex) {
            int midIndex = (startIndex + lastIndex) / 2;
            int mid = arr[midIndex];

            if (num < mid)
                lastIndex = midIndex - 1;
            else if (num > mid)
                startIndex = midIndex + 1;
            else
                return true;
        }
        return false;
    }
}
