package baek.setsAndMaps;

import java.io.*;
import java.util.HashSet;
import java.util.stream.IntStream;

public class baek_11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        HashSet<String> substrings = new HashSet<>();

        IntStream.range(0, s.length())
                .forEach(i -> IntStream.rangeClosed(i + 1, s.length())
                        .mapToObj(j -> s.substring(i, j))
                        .forEach(substrings::add));

        // ababc
        // a ab aba abab ababc
        // b ba bab babc
        // a ab abc
        // b bc
        // c

        // a, ab, aba, abab, ababc, b, ba, bab, babc, abc, bc, c
        System.out.println(substrings.size());
    }
}
