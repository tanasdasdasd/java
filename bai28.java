import java.util.Scanner;

public class bai28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = nhapN(sc);
        int[] a = nhapMang(n, sc);
        xuatMang(a);
        System.out.println(" hay nhap vao phan tu x ");
        int x = Integer.parseInt(sc.nextLine());
        a = xoaPhanTu(a, x);
        xuatMang(a);

    }

    public static int nhapN(Scanner sc) {
        int n;
        do {
            System.out.println("hay nhap vao n");
            n = Integer.parseInt(sc.nextLine());
            if (n < 1 || n % 2 != 0) {
                System.out.println(" ban da nhap sai moi ban nhap lai ");
            }
        } while (n < 1 || n % 2 != 0);
        return n;
    }

    public static int[] nhapMang(int n, Scanner sc) {
        System.out.println("hay nhap vao 1 mang ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = Integer.parseInt(sc.nextLine());
        }
        return a;
    }

    public static void xuatMang(int[] a) {
        System.out.println("xuat mang");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static int demPhanTu(int a[],int x) {
        int dem = 0;
        for (int pt : a) {
            if (pt == x) {
                dem++;
            }
        }
        return dem;
    }

    public static int[] xoaPhanTu(int a[], int x) {
        int dem = demPhanTu(a, x);
        if (dem > 0) {
            int b[] = new int[a.length - dem];
            int j = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] != x) {
                    b[j++] = a[i];
                }
            }
            a = b;
        } else {
            System.out.println("khong co phan tu " + x + " trong mang");
        }
        return a;
    }

}
