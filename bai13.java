import java.util.Scanner;

public class bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = nhap(sc);
        if (check(n)) {
            System.out.println(n + " la so nguyen to ");
        } else {
            System.out.println(n + " ko la so nguyen to");
        }

    }

    public static int nhap(Scanner sc) {
        System.out.println("hay nhap vao 1 so ");
        int n = Integer.parseInt(sc.nextLine());
        return n;

    }

    public static boolean check(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
