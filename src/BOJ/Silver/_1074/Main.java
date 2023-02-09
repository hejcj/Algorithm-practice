package BOJ.Silver._1074;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int count = 0;
    public static int n;
    public static int r;
    public static int c;


    public static void hansu(int x, int y) {

        int[] dx = {0, 0, 1, 1};
        int[] dy = {0, 1, 0, 1};

        int[] ddx = {0, 0, 2, 2};
        int[] ddy = {0, 2, 0, 2};

    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(br.readLine());
        r = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());
        n = (int) Math.pow(2, n);

        hansu(0,0);
    }
}
