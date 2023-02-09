package BOJ.Silver._1406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static final int MX = 600001;
    public static char[] dat = new char[MX];
    public static int[] pre = new int[MX];
    public static int[] nxt = new int[MX];
    public static int cursor = 1;
    public static int cur = 1;

    public static void insert(char a, int cursor) {
        dat[cur] = a;
        pre[cur] = cursor-1;
        nxt[cur] = nxt[cursor-1];

        if(nxt[cursor] != -1) pre[nxt[cursor]] = cursor;
        nxt[cursor] = cur;
        cur++;
    }

    public static void delete(int cursor) {

        if(nxt[cursor-1] != 1) pre[nxt[cursor - 1]] = pre[cursor - 1];;

        if (pre[cursor - 1] != -1) {
            nxt[pre[cursor - 1]] = nxt[cursor - 1];
        }
    }

    public static void result() {
        StringBuffer sb = new StringBuffer();
        int c = nxt[0];
        while (c != -1) {
            sb.append(dat[c]);
            c = nxt[c];
        }
        System.out.println(sb);
    }

    public static void main(String[]args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        Arrays.fill(pre, -1);
        Arrays.fill(nxt, -1);

        for (int i = 0; i < s.length(); i++) {
            insert(s.charAt(i),cursor++);
            result();
        }
        int n = Integer.parseInt(br.readLine());
        int x = s.length();
        for (int i = 0; i < n; i++) {
            String s2 = br.readLine();

            if(s2.length() == 1) {
                if (s2.equals("L")) {
                    if(cursor >1) cursor--;
                } else if (s2.equals("D")) {
                    if (cursor < x + 1) cursor++;
                }else{
                    delete(cursor);
                    x--;
                }
            } else {
                insert(s2.charAt(2), cursor);
                x++;
            }

        }
        result();
    }
}
