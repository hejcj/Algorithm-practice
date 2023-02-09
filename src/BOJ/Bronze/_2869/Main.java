package bronze._2869;

import java.io.*;

// Split이용
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //Split이용하여 출력하기 위한 StringBuilder
        StringBuilder sb = new StringBuilder();

        //반복문 순회 숫자 n
        int n = Integer.parseInt(br.readLine());

        // 반복문을 통해 덧셈할 숫자 입력 받기
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            int split = line.indexOf(" ");
            int a = Integer.parseInt(line.substring(0, split));
            int b = Integer.parseInt(line.substring(split+1));
            sb.append(a+b);
            sb.append("\n");
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();

        System.out.println();
    }
}
