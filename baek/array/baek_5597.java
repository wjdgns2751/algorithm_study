package baek.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class baek_5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] attendance = new boolean[31]; // 출석 체크 배열

        // 두 번의 출석 기록 입력받기
        for (int i = 0; i < 28; i++) {
            int studentNumber = Integer.parseInt(br.readLine());
            attendance[studentNumber] = true;
        }

        // 출석하지 않은 학생들 출력
        for (int i = 1; i <= 30; i++) {
            if (!attendance[i]) {
                System.out.println(i);
            }

        }
    }
}
