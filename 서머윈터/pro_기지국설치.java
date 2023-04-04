package 내일배움코스;

import java.util.*;

public class pro_기지국설치 {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        /*
         * 큐를 활용한 풀이
         * Queue<Integer> sq = new LinkedList<>();
         * for(int s : stations) sq.offer(s);
         * 
         * 
         * 효율성 높이기
         * 1. LOOP 문 개선
         * 2. 적절한 데이터 구조 사용
         * 3. 불필요한 오브젝트 제거
         */

        int si = 0;

        int position = 1;
        while (position <= n) {
            if (si < stations.length && stations[si] - w <= position) {
                position = stations[si] + w + 1;
                si++;
            } else {
                answer += 1;
                position += w * 2 + 1;
            }
        }

        return answer;
    }
}
