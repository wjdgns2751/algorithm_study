package baek.bruteForce;

import java.io.*;
import java.util.*;

public class baek_2798 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int maxValue = 0;
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int tempValue = arr[i] + arr[j] + arr[k];

                    if (M == tempValue) {
                        maxValue = tempValue;
                        break;
                    }

                    if (maxValue < tempValue && tempValue < M)
                        maxValue = tempValue;
                }
            }
        }
        System.out.println(maxValue);
    }
}
