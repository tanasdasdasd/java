import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số nguyên thứ nhất : ");

        double num1 = Double.parseDouble(sc.nextLine());
        System.out.println("so nguyen thu nhat la : " + num1);
        sc.close();
        
        int n = 678;
        int hundred = n / 100;
        System.out.println(hundred);
        int ten = n % 100 / 10;

        System.out.println(ten);

        int unit = n % 10;
        System.out.println(unit);
        System.out.println(hundred + ten + unit);

    }
}