package algorithm._0x00;

public class main2 {

    // 시간 복잡도 (n-1) ... (n-2) (n- n+1)
    // (n-1) * (n-(n-1)) /2

    public static boolean func2(int[] arr, int n) {
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] + arr[j] == 100) return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(func2(new int[] {1, 52, 48}, 3));
        System.out.println(func2(new int[] {50,42}, 2));
        System.out.println(func2(new int[] {4, 13, 63, 87}, 4));

        int a = 3;
        int b = 4;

    }
}
