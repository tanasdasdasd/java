import java.util.Scanner;

public class bai23 {
    final static int min = -100;
    final static int max = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = nhapN(sc);
        int a[] = nhapMang(n, sc);
        xuatMang(a);
        lietKeChiSo(a);
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

    public static int timChiSoAmDauTien(int a[]) {
        int index = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void lietKeChiSo(int a[]) {
        int index = timChiSoAmDauTien(a);
        if (index == -1) {
            System.out.println(" mang ko co so am dau tien");
        } else {
            System.out.println(" chi so tai do  la " + a[index]);
            for (int i = index +1 ; i < a.length; i++) {
                if (a[i] == a[index]) {
                    System.out.println(i);
                
            }
        }

    }
    
}
}
