package baek.setsAndMaps;

import java.io.*;

public class baek_10815 {
    static class Reader {
        private final int BUFFER_SIZE = 1 << 16;
        /*
         * 1 << 16는 비트 이동 연산자인 <<를 사용하여 1을 16만큼 왼쪽으로 이동시킨 결과를 나타냅니다.
         * 이 연산은 2의 거듭제곱을 계산하는데 사용됩니다. 따라서 1 << 16은 2^16, 즉 65536를 의미합니다.
         * 
         * 즉, BUFFER_SIZE는 65536, 즉 64KB의 크기를 가지는 버퍼를 나타냅니다. 이 버퍼는 데이터를 임시로 저장하는 용도로
         * 사용되며, 입력 속도를 향상시키기 위해 사용될 수 있습니다.
         * 
         */
        private DataInputStream din; // 입력을 받기 위한 DataInputStream 객체입니다.
        private byte[] buffer; // 입력을 임시로 저장하는 바이트 배열입니다.
        private int bufferPointer, bytesRead; // 현재 버퍼의 위치와 읽은 바이트 수를 나타내는 변수입니다.

        public Reader() {
            din = new DataInputStream(System.in); // DataInputStream을 초기화하여 입력을 받을 준비를 합니다.
            buffer = new byte[BUFFER_SIZE]; // 버퍼 배열을 초기화합니다.
            bufferPointer = bytesRead = 0; // 버퍼 포인터와 읽은 바이트 수를 0으로 초기화합니다.
        }

        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read(); // 다음 바이트를 읽어옵니다.

            while (c <= ' ') // 공백 문자를 건너뜁니다.
                c = read();

            boolean neg = (c == '-'); // 음수인지 여부를 나타내는 플래그입니다.
            if (neg)
                c = read(); // 음수 부호를 건너뜁니다.

            do {
                ret = ret * 10 + c - '0'; // 숫자를 읽어서 정수로 변환합니다.
            } while ((c = read()) >= '0' && c <= '9'); // 숫자인 동안 반복합니다.

            if (neg)
                return -ret; // 음수인 경우 음수로 반환합니다.
            return ret; // 양수인 경우 양수로 반환합니다.
        }

        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); // 입력을 버퍼에 채웁니다.

            if (bytesRead == -1)
                buffer[0] = -1; // 읽은 바이트 수가 -1인 경우, 입력의 끝을 나타내므로 버퍼의 첫 번째 요소를 -1로 설정합니다.
        }

        private byte read() throws IOException {
            if (bufferPointer == bytesRead)
                fillBuffer(); // 버퍼 포인터가 읽은 바이트 수와 같은 경우, 버퍼를 채웁니다.

            return buffer[bufferPointer++]; // 다음 바이트를 반환하고 버퍼 포인터를 증가시킵니다.
        }
    }

    public static void main(String[] args) throws IOException {
        Reader r = new Reader(); // Reader 객체를 생성하여 입력을 처리하기 위해 준비합니다.

        boolean[] card = new boolean[20_000_001]; // 카드 배열을 생성합니다. 인덱스 0부터 20,000,000까지의 숫자를 표현합니다.
        int N = r.nextInt(); // 카드의 개수를 입력 받습니다.

        int a = 0;
        while (a < N) { // N개의 카드를 입력 받아서 해당하는 위치의 카드 배열 값을 true로 설정합니다.
            card[r.nextInt() + 10_000_000] = true; // 입력된 숫자에 10,000,000을 더한 값을 인덱스로 사용하여 해당 위치의 카드를 true로 표시합니다.
            a++;
        }

        int M = r.nextInt(); // 검사할 카드의 개수를 입력 받습니다.
        a = 0;
        StringBuilder sb = new StringBuilder(); // 결과를 저장할 StringBuilder 객체를 생성합니다.

        while (a < M) { // M개의 카드를 입력 받아서 해당하는 위치의 카드 배열 값을 검사하여 결과를 StringBuilder에 추가합니다.
            if (card[r.nextInt() + 10_000_000]) {
                sb.append("1").append(" "); // 해당하는 카드가 존재하면 "1"을 StringBuilder에 추가합니다.
            } else {
                sb.append("0").append(" "); // 해당하는 카드가 존재하지 않으면 "0"을 StringBuilder에 추가합니다.
            }
            a++;
        }

        System.out.println(sb); // StringBuilder에 저장된 결과를 출력합니다.
    }
}
