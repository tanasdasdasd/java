import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        int n;
        int unit;
        int ten;
        int hundred;
        int sum;
        System.out.print("Nhap vao n ");
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt((sc.nextLine()));
        hundred = n / 100;
        ten = n % 100 / 10;
        unit = n % 10;
        sum = hundred + ten + unit;
        System.out.println("Tổng của 3 ky số n là " + n + "\t là " + sum);
        sc.close();
    }
}
