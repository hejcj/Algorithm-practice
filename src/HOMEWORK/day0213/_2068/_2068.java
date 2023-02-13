package HOMEWORK.day0213._2068;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2068 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int max = 0;
            for (int j = 0; j < 10; j++) {
                int num = Integer.parseInt(st.nextToken());
                max = Math.max(num, max);
            }
            sb.append("#").append(i + 1).append(" ").append(max).append("\n");
        }

        System.out.println(sb);
    }
}
