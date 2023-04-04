package 내일배움코스;

public class pro_마법의엘리베이터 {
    public static int solution(int storey) {
        int answer = 0;

        String stVal = String.valueOf(storey);
        char[] charArr = stVal.toCharArray();
        int[] intArr = new int[charArr.length];
        for (int i = 0; i < charArr.length; i++) {

            intArr[i] = charArr[i] - '0';
        }

        for (int i = intArr.length - 1; i >= 0; i--) {
            int anInt = intArr[i];

            if (anInt == 10) {
                if (i - 1 < 0) {
                    answer += 1;
                    continue;
                }

                intArr[i - 1]++;
                continue;
            }

            if (anInt >= 6) {
                answer += (10 - anInt);
                if (i - 1 < 0) {
                    answer += 1;
                    continue;
                }
                intArr[i - 1]++;
            } else if (anInt <= 4) {
                answer += anInt;
            } else if (anInt == 5) {
                if (i - 1 < 0) {
                    answer += 5;
                    continue;
                } else {
                    if (intArr[i - 1] < 5) {
                        answer += anInt;
                    } else {
                        answer += 5;
                        intArr[i - 1]++;
                    }
                }
            }
        }

        return answer;
        // return elevator(storey);
    }

    private static int elevator(int floor) {
        if (floor <= 1)
            return floor; // 0보다 낮아질 경우

        int remainder = floor % 10; // 10으로 나눈 나머지 값
        int divide = floor / 10; // 10으로 나눈 몫

        int count1 = remainder + elevator(divide); //
        int count2 = (10 - remainder) + elevator(divide + 1);

        /**
         * ex) 16 +
         * 
         * reminder divide count1 count2
         * 6 1 7
         * 2 0 2 9
         * 6
         * -----------------------------
         * 6 1 | 7 > 6 == 6
         */
        return Math.min(count1, count2);
    }

    public static void main(String[] args) {
        int result = solution(16);
        System.out.println("result : " + result);
    }
}
