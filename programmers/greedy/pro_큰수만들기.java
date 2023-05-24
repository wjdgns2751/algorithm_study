package programmers.greedy;

import java.util.Stack;

public class pro_큰수만들기 {
    public static String solution(String number, int k) {
        // 4177252841 answer
        // (41772)5841 4177[2] 52841 7
        // 417(72)5841 41772[5] 2841 77
        // 4177(25)841 417725[2] 841 775
        // 417725(84)1 4177252[8] 41 7758
        // 4177258(41) 41772528[4] 1 77584
        // 41772584(1) 417725841 775841
        String answer = "";
        char[] result = new char[number.length() - k];
        // 문자열 number의 길이에서 제거해야될 문자 갯수를 뺀 만큼의 char 타입의 result 리스트 생성
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            while (!stack.isEmpty() && stack.peek() < c && k > 0) {
                // 스택이 비어있지 않을때 스택의 첫번째 값과 첫번째 문자를
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String ab = "4177252841";
        int bb = 4;
        solution(ab, 4);

    }
}