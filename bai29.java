import java.util.Scanner;

public class bai29 {
    static int MIN = -100;
    static int MAX = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = nhapN(sc);
        int a[] = taoMang(n);
        xuatMang(a);
        a = xoaPhanTuInDex(a, sc);
        xuatMang(a);
    }

    public static int nhapN(Scanner sc) {
        int n;
        do {
            System.out.println("hay nhap vao n");
            n = Integer.parseInt(sc.nextLine());
            if (n < 1) {
                System.out.println(" ban da nhap sai moi ban nhap lai ");
            }
        } while (n < 1);
        return n;
    }

    public static int[] taoMang(int n) {
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
        }
        return a;
    }

    public static void xuatMang(int a[]) {
        System.out.println(" xuat mang ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println("\n");
    }

    public static int[] xoaPhanTuInDex(int a[], Scanner sc) {
        int index;
        int b[] = new int[a.length - 1];
        do {
            System.out.println("Hay nhap vao vi tri index muon xoa tu 0 den " + a.length);
            index = Integer.parseInt(sc.nextLine());
            if (index < 0 || index >= a.length) {
                System.out.println("ban da nhap sai moi ban nhap lai ");
            }
        } while (index < 0 || index >= a.length);
        
        // int j = 0;
        // for (int i = 0; i < a.length - 1; i++) {
        //     if (i == index) {
        //         j++;
        //     }
        //     b[i] = a[j++];
        // }

        int i = 0;
        for (int j = 0; j < a.length - 1; j++) {
            if (j== index) {
                i++;
            }
            b[j] = a[i++];
        }
        a = b;
        return a;
    }

}
