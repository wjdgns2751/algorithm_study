package programmers.leveltest;

import java.util.*;

public class pro_카카오숫자놀이 {

    public int solution(String s) {
        int answer = 0;
        String res = "";
        String[] num = new String[] { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        List<String> list = Arrays.asList(num);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            boolean isNum = Character.isDigit(s.charAt(i));
            if (isNum) {
                res += s.charAt(i);
            } else {
                sb.append(s.charAt(i));
                if (list.contains(sb.toString())) {
                    res += list.indexOf(sb.toString());
                    sb.setLength(0);
                }
            }
        }
        answer = Integer.parseInt(res);
        return answer;
    }

    public static void main(String[] args) {

    }
}
