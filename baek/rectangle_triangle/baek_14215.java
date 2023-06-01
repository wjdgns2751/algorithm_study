package baek.rectangle_triangle;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class baek_14215 {

    /*
     * 각 막대의 길이는 양의 정수이다
     * 세 막대를 이용해서 넓이가 양수인 삼각형을 만들 수 있어야 한다.
     * 삼각형의 둘레를 최대로 해야 한다.
     */

    // 삼각형은 주어진 수 중 최댓값이 다른 나머지 수의 합보다 작어야한다.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stream<String> angle = Arrays.stream(br.readLine().split(" "));
        int[] input = angle.mapToInt(Integer::parseInt).sorted().toArray();

        if (input[0] + input[1] > input[2]) {
            System.out.println(input[0] + input[1] + input[2]);
        } else {
            System.out.println((input[0] + input[1]) * 2 - 1);
        }

    }
}
