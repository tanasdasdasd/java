import java.util.Scanner;

public class bai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao n");
        int n = Integer.parseInt(sc.nextLine());
        int tong = 0;
        int i = 1;
        // for (int i = 0; i <= n; i += 2) {
        // if (i % 2 == 0) {
        // System.out.println("cac so chan la "+i);
        // tong += i;

        // }

        // }
        // System.out.println("tong la " + tong);

        // }
        while (i <= n) {
            if (i % 2 == 0) {
                System.out.println("cac so chan "+i);
                tong += i;
            }
            i++;
        }
        System.out.println(tong);
        sc.close();
    }
}