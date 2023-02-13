package HOMEWORK.day0213._0000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // t, n , m , max , gravity[]

        // testcase
        int t = Integer.parseInt(br.readLine());

        // testcase 만큼 반복문
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            // 가로 길이
            int n = Integer.parseInt(st.nextToken());
            // 세로 길이
            int m = Integer.parseInt((st.nextToken()));
            // 낙차 가 가장 큰 값 (출력값)
            int max = 0;

            // x축의 길이만큼 배열
            int[] gravity = new int[n];
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                // 배열에 블락의 높이 삽입
                gravity[j] = Integer.parseInt(st2.nextToken());
            }

            for (int j = 0; j < n; j++) {
                
                // x축과 가로 길이 n의 차이 기본 낙차
                int h = n - j - 1;
                for (int k = j+1; k < n; k++) {
                    // 오른쪽에 자신 보다 크거나 같은 블락이 있다면
                    if (gravity[k] >= gravity[j]) {
                        // 낙차를 하나 줄임
                        h--;
                    }
                }
                // 가장 높은 낙차 찾기
                max = Math.max(h, max);
            }
            // 낙차 출력
            System.out.println(max);
        }
    }
}
