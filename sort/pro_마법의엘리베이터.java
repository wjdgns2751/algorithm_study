package sort;

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

    public static void main(String[] args) {
        int result = solution(16);
        System.out.println("result : " + result);
    }
}
