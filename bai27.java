import java.util.Scanner;

public class bai27 {
    final static int MIN = -10;
    final static int MAX = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = nhapN(sc);
        int a[] = taoMang(n);
        xuatMang(a);
        a = themPhanTu(a, sc);
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

    public static int[] themPhanTu(int a[], Scanner sc) {
        int k;
        do {
            System.out.println("hay nhap vao k : tu 0 den " + a.length);
            k = Integer.parseInt(sc.nextLine());
            if (k < 0 || k > a.length) {
                System.out.println("ban da nhap sai moi nhap lai ! ");
            }
        } while ((k < 0 || k > a.length));
        System.out.println("hay nhap vao x ");
        int x = Integer.parseInt(sc.nextLine());
        int b[] = new int[a.length + 1];
        for (int i = 0; i < b.length; i++) {
            if (i < k) {
                b[i] = a[i];
            } else if (i == k) {
                b[i] = x;
            } else if (i>k) {
                b[i] = a[i - 1];
            }
        }
        a=b;
        return a;
    }
}
