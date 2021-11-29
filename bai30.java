import java.util.Scanner;

public class bai30 {
    static int MIN = -100;
    static int MAX = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = nhapN(sc);
        int a[] = taoMang(n);
        xuatMang(a);
        int dem = demSoPhanTu(a);
        System.out.println("co " + dem + " so phan tu chia het cho 4 va tan cung la 6 ");
        a=nhanDoiPhanTuLe(a);
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

    public static int demSoPhanTu(int a[]) {
        int dem = 0;
        for (int pt : a) {
            if (pt % 4 == 0 && Math.abs(pt) % 10 == 6) {
                dem++;
            }
        }
        return dem;
    }

    public static int [] nhanDoiPhanTuLe(int a[]) {
        
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                a[i] = a[i]*2;
            }
        }
        return a;
    }

}
