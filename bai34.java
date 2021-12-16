import java.util.Scanner;

public class bai34 {
    static final char MIN = 'A';
    static final char MAX = 'D';

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= nhapN(sc);
        int a[]=nhapMang(n, sc);
        xuatMang(a);
        lietKePhanTuXaGiaTri(a, sc);
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

    public static int[] nhapMang(int n, Scanner sc) {
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = Integer.parseInt(sc.nextLine());
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

    public static void lietKePhanTuXaGiaTri(int a[], Scanner sc) {
        System.out.println("Nhap vao gia tri x ");
        int x = Integer.parseInt(sc.nextLine());
        int b[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = Math.abs(a[i] - x);
        }

        int indexMax = 0;
        for (int i = 1; i < b.length; i++) {
            if (b[i] > b[indexMax]) {
                indexMax = i;
            }
        }

        System.out.println("cac phan tu cach xa phan tu x " + x + " la : ");
        for (int i = 0; i < b.length; i++) {
            if (b[i] == b[indexMax]) {
                System.out.print(" ( " + i + "," + a[i] + " ) "+" \t ");
            }
        }

    }

}
