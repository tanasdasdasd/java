import java.util.Scanner;

public class bai32 {
    static int MIN = -100;
    static int MAX = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hay nhap vao n ");
        int n = Integer.parseInt(sc.nextLine());
        int a[] = nhapMang(n, sc);
        xuatMang(a);
        inSLPTTN(a);

    }

    public static int nhapN(Scanner sc) {
        int n;
        do {
            System.out.println("hay nhap vao n");
            n = Integer.parseInt(sc.nextLine());
            if (n < 2 || n % 2 != 0) {
                System.out.println(" ban da nhap sai moi ban nhap lai ");
            }
        } while (n < 2 || n % 2 != 0);
        return n;
    }

    public static int[] nhapMang(int n, Scanner sc) {
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]=");
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

    public static int[] demSoPhanTuTrung(int a[]) {
        int b[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    if (j < i) {
                        break;
                    } else {
                        b[i]++;
                    }
                }
            }

        }
        return b;
    }

    public static void inSLPTTN(int a[]) {
        int b[] = demSoPhanTuTrung(a);
        for (int i = 0; i < b.length; i++) {
            if (b[i] != 0) {
                System.out.println(a[i] + "[" + b[i] + "]");
            }
        }
    }

}
