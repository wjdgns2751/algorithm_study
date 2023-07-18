package baek.dmp;

import java.io.*;
import java.util.*;

public class baek_2485 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 가로수의 개수

        ArrayList<Integer> trees = new ArrayList<>();

        for (int i = 0; i < N; i++)
            trees.add(Integer.parseInt(br.readLine())); // 가로수의 위치를 입력받아 리스트에 저장

        ArrayList<Integer> distances = new ArrayList<>();
        for (int i = 1; i < N; i++)
            distances.add(trees.get(i) - trees.get(i - 1)); // 각 가로수 사이의 간격을 계산하여 리스트에 저장

        int gcd = distances.get(0); // 최대공약수를 구하기 위해 초기값으로 첫 번째 간격 설정
        for (int i = 1; i < distances.size(); i++)
            gcd = getGCD(gcd, distances.get(i)); // 최대공약수 계산

        int answer = 0;
        for (int distance : distances)
            answer += (distance / gcd) - 1; // 각 가로수 사이의 간격을 최대공약수로 나눈 몫을 계산하여 추가로 심어야 하는 가로수의 개수 누적

        System.out.println(answer); // 결과 출력

        br.close();
    }

    public static int getGCD(int a, int b) {
        if (b == 0)
            return a;
        else
            return getGCD(b, a % b); // 최대공약수 계산을 위해 유클리드 호제법 사용 dd

    }
}
