package SWEA._1206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Solution {
    public static void main(String[] args) throws IOException {
//        조망권 확보
//        좌우로 좌표 보내서 false 면 ++;
//        10개의 테스트 케이스
//        알고리즘 : 탐색? 배열 ?
//        건물의 개수 N
//        맨왼쪽 두칸과 맨 오른쪽 두 칸에 있는 건물은 항상 높이가 0이다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 10개의 테스트 케이스
        for (int i = 0; i < 10; i++) {

            // List에 담으면서 배열 Queue로 구현할까?
            // 일반 배열 로 먼저 풀어보자
            int n = Integer.parseInt(br.readLine());

            int[] height = new int[n];
            int result = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                height[j] = Integer.parseInt(st.nextToken());
            }

            // 배열 순회 하면서 좌우 탐색

            for (int j = 2; j < n - 2; j++) {
                // j -2 j-1 j+1 j+2 과 j 차이중 가장 작은것

                int a = height[j - 2];
                int b = height[j - 1];
                int c = height[j + 1];
                int d = height[j + 2];
                int e = Math.min(height[j] - a, height[j] - b);
                int f = Math.min(height[j] - c, height[j] - d);
                if(Math.min(e, f) >0) result += Math.min(e, f);
            }
            sb.append("#").append(i+1).append(" ").append(result).append("\n");
        }
        System.out.println(sb);
    }
}
