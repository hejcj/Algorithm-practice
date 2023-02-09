package algorithm._0x00;

public class main3 {
    public static boolean func3(int n) {
        for(int i = 0; i* i <= n; i ++){
            if(i*i == n) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(func3(9));
        System.out.println(func3(693953651));
        System.out.println(func3(756580036));
    }
}
