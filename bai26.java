import java.util.Scanner;

public class bai26 {
    final static int MIN = -10;
    final static int MAX = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = nhapN(sc);
        int a[] = taoMang(n,sc);
        xuatMang(a);
        int tong = tinhTongLienKe(a);
        System.out.println(tong);
        
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

    public static int[] taoMang(int n,Scanner sc) {
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("a ["+i+"]");
            a[i]=Integer.parseInt(sc.nextLine());
        }
        return a;
    }

    public static void xuatMang(int a[]) {
        System.out.println(" xuat mang ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"\t");
        }
        System.out.println("\n");
    }

    public static int tinhTongLienKe(int a[]) {
        int tong = 0;
        //int kq=0;
        for (int i = 1; i < a.length; i++) {
             if (a[i] > a[i - 1]) {
                tong += a[i];
            }
        }
        return tong;
    }
    

}
