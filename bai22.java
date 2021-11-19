import java.util.Scanner;

public class bai22 {
    final static int min = -100;
    final static int max = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = nhapN(sc);
        int b[] = taoMang(n);
        xuatMang(b);
        lietKe(sc, b);
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

    public static int[] taoMang(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = min + (int) (Math.random() * ((max - min) + 1));
        }
        return a;
    }

    public static void xuatMang(int[] a) {
        System.out.println(" xuat mang ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println("\n");
    }

    public static void lietKe(Scanner sc,int[]a){
        System.out.println(" hay nhap gia tri x duoi ");
        int x = Integer.parseInt(sc.nextLine());

        System.out.println(" hay nhap gia tri y tren ");
        int y = Integer.parseInt(sc.nextLine());
        
        for( int pt : a){
            if(pt >= x && pt <=y ){
                System.out.print(pt+"\t");
            }
        }
    }
}
