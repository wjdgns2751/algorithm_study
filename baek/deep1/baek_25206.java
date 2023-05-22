package baek.deep1;

import java.io.*;
import java.util.*;

public class baek_25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Double> gradeMap = new HashMap<>();
        gradeMap.put("A+", 4.5);
        gradeMap.put("A0", 4.0);
        gradeMap.put("B+", 3.5);
        gradeMap.put("B0", 3.0);
        gradeMap.put("C+", 2.5);
        gradeMap.put("C0", 2.0);
        gradeMap.put("D+", 1.5);
        gradeMap.put("D0", 1.0);
        gradeMap.put("F", 0.0);

        double value = 0.0;
        double pointM = 0.0;
        for (int i = 0; i < 20; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            String name = st.nextToken();
            double point = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            if (!grade.equals("P")) {
                pointM += point;
                value += point * gradeMap.get(grade);
            }

        }
        String format = String.format("%.6f", value / pointM);
        System.out.println(format);
    };
}
