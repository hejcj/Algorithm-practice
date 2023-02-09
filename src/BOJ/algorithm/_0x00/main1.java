package algorithm._0x00;

public class main1 {
    public static int func1(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(func1(16));
        System.out.println(func1(34567));
        System.out.println(func1(27639));

    }
}
