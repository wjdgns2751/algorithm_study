package baek.deep1;

import java.util.Scanner;

public class baek_1316 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 단어의 개수

        int count = 0; // 그룹 단어의 개수

        for (int i = 0; i < n; i++) {
            String word = scanner.next();
            boolean[] visited = new boolean[26]; // 알파벳 방문 여부 체크

            // 그룹 단어인지 확인
            boolean isGroupWord = true;
            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);

                // 이미 방문한 알파벳이고 바로 앞의 알파벳과 다르다면 그룹 단어가 아님
                if (visited[c - 'a'] && c != word.charAt(j - 1)) {
                    isGroupWord = false;
                    break;
                }

                visited[c - 'a'] = true; // 알파벳 방문 처리
            }

            if (isGroupWord) {
                count++;
            }
        }

        scanner.close();
        System.out.println(count);
    }
}
