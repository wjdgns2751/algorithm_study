package baek.setsAndMaps;

import java.io.*;
import java.util.*;

public class baek_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();
        String[] nameList = new String[N];

        for (int i = 0; i < N; i++) {
            String pocketmonName = br.readLine();
            map.put(pocketmonName, i + 1);
            nameList[i] = pocketmonName;
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            String element = br.readLine();
            if (isNumber(element)) {
                sb.append(nameList[Integer.parseInt(element) - 1] + "\n");
            } else {
                sb.append(map.get(element) + "\n");
            }
        }

        System.out.println(sb);
    }

    public static boolean isNumber(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
