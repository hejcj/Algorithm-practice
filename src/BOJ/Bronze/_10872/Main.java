package bronze._10872;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;
        for (int i = 2; i <= n; i++) {
                sum *= i;
        }
        System.out.println(sum);
    }
}
