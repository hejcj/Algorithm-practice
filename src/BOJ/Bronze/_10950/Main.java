package BOJ.Bronze._10950;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            String[] tokens = s.split(" ");
            bw.write( Integer.parseInt(tokens[0]) + Integer.parseInt(tokens[1]) +"\n");
        }
        bw.flush();
        bw.close();
    }
}