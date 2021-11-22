import java.util.Scanner;

public class bai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = nhapN(sc);
        int a[] = nhapMang(n, sc);
        xuatMang(a);
        lietKe(a);
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

    public static void xuatMang(int[] a) {
        System.out.println(" xuat mang ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println("\n");
    }

    public static int timSoDuongDauTien(int[] a) {
        int index = -1;// ko co so duong
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static int soDuongNhoNhat(int[] a) {
        int indexduong = timSoDuongDauTien(a);
        int indexMin = -1;// ko co so duong nho nhat
        if (indexduong == -1) {
            System.out.println("mang ko co so duong");
        } else {
            indexMin = indexduong;
            for (int i = indexduong + 1; i < a.length; i++) {
                if (a[i] > 0 && a[i] < a[indexMin]) {
                    indexMin = i;
                }
            }
        }
        return indexMin;
    }

    public static void lietKe(int[] a) {
        int indexMin = soDuongNhoNhat(a);
        if (indexMin == -1) {
            System.out.println("mang ko co so duong");
        } else {
            System.out.println("so nho nhat dau tien la " + a[indexMin]);
            for (int i = indexMin + 1; i < a.length; i++) {
                if (a[i] == a[indexMin]) {
                    System.out.println(i);
                }
            }
        }

    }
}
