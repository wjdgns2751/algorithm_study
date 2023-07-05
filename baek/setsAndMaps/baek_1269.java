package baek.setsAndMaps;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class baek_1269 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        HashMap<Integer, Integer> map = new HashMap<>();

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < A; i++) {
            int number = Integer.parseInt(st.nextToken());
            map.put(number, 1);
        }

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < B; i++) {
            int number = Integer.parseInt(st.nextToken());
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        System.out.println(map.values().stream().filter(num -> num == 1).count());

    }
}
