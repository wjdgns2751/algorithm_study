package baek.gmath;

import java.io.*;
import java.util.StringTokenizer;

public class baek_2869 {
    // A : 상승 높이 (낮)
    // B : 미끄러지는 높이 (밤)
    // V : 나무 높이

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int day = (V - B) / (A - B);
        if ((V - B) % (A - B) != 0) {
            day++;
        }
        System.out.println(day);
    }
}
