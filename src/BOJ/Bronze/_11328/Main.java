package BOJ.Bronze._11328;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static String is_Strfry(String a,int[] cnt){

        for (int i = 0; i < a.length(); i++) {
            if(--cnt[a.charAt(i)-97] < 0) return "Impossible";
        }
        return "Possible";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int[] cnt = new int[26];
            for (int j = 0; j < s.length(); j++) {
                cnt[s.charAt(j) - 97]++;
            }
            String a = st.nextToken();
            if(a.length() == s.length()) sb.append(is_Strfry(a, cnt));
            else sb.append("Impossible");
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
