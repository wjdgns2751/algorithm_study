package baek.setsAndMaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baek_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < M; j++) {
            int value = Integer.parseInt(st.nextToken());
            sb.append(upperBound(arr, value) - lowerBound(arr, value) + " ");
        }

        System.out.println(sb);
    }

    private static int lowerBound(int[] arr, int value) {
        int valueMin = 0;
        int valueMax = arr.length;

        while (valueMin < valueMax) {
            int valueMid = (valueMin + valueMax) / 2; // 중앙값

            if (value <= arr[valueMid])
                valueMax = valueMid;
            else
                valueMin = valueMid + 1;
        }

        return valueMin;
    }

    private static int upperBound(int[] arr, int value) {

        int valueMin = 0;
        int valueMax = arr.length;

        while (valueMin < valueMax) {
            int valueMid = (valueMin + valueMax) / 2; // 중앙값

            if (value < arr[valueMid])
                valueMax = valueMid;
            else
                valueMin = valueMid + 1;
        }

        return valueMin;
    }
}
