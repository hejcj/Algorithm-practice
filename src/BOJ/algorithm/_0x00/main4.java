package algorithm._0x00;

public class main4 {
    public static int func4(int n) {
        int result = 0;
        for(int i = 2; i < n; i *= 2){
            result = i;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(func4(5));
        System.out.println(func4(97615282));
        System.out.println(func4(1024));
    }
}
