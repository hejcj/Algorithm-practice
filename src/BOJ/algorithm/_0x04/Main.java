package algorithm._0x04;

import java.util.Arrays;

public class Main {
    static final int MX = 10000005;
    static int[] dat = new int[MX];
    static int[] pre = new int[MX];
    static int[] nxt = new int[MX];
    static int unused = 1;
    static void insert(int addr, int num) {
        dat[unused] = num;
        nxt[unused] = nxt[addr];
        pre[unused] = addr;


        if(nxt[addr] != -1 ) pre[nxt[addr]] = unused;
        nxt[addr] = unused;
        unused++;
    }

    static void erase(int addr) {
        nxt[pre[addr]] = nxt[addr];
        if(nxt[addr] != -1) pre[nxt[addr]] = pre[addr];

    }

    static void traverse() {
        int cur = nxt[0];
        while (cur != -1) {
            System.out.printf("%d ", dat[cur]);
            cur = nxt[cur];
        }
        System.out.println("\n");
    }

    static void insert_test() {
        System.out.println("****** insert_test******* \n");
        insert(0, 10);
        traverse();
        insert(0, 30);
        traverse();
        insert(2, 40);
        traverse();
        insert(1, 20);
        traverse();
        insert(4, 70);
        traverse();

    }

    static void erase_test(){
        System.out.println("****** erase_test******* \n");
        erase(1);
        traverse();
        erase(2);
        traverse();
        erase(4);
        traverse();
        erase(5);
        traverse();
    }


    public static void main(String[] args) {

        Arrays.fill(pre , -1);
        Arrays.fill(nxt , -1);
        insert_test();
        erase_test();
    }
}
