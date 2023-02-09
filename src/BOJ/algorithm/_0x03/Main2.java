package algorithm._0x03;

public class Main2 {
    public static boolean func2(int arr[], int N){
        int[] arr2 = new int[101];
        for (int i : arr) {
            arr2[i] = 1;
            if(i != 100- i &&arr2[100-i] == 1) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // 주어진 길이 n 의 배열 arr에서 합이 서로 다른 100인 서로 다른 위치의 두 원소가 존재
        System.out.println(func2(new int[]{1, 52, 48},3 ));
        System.out.println(func2(new int[]{50,42},2 ));
        System.out.println(func2(new int[]{4,13,63,87},4 ));
    }
}
