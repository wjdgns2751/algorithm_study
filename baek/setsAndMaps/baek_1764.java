package baek.setsAndMaps;

import java.io.*;
import java.util.*;

public class baek_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();
        List<String> nameList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (map.containsKey(name))
                nameList.add(name);
        }

        StringBuilder sb = new StringBuilder();

        Collections.sort(nameList);

        sb.append(nameList.size() + "\n");

        for (String name : nameList)
            sb.append(name + "\n");

        System.out.println(sb);
    }
}
