import java.util.Scanner;

public class bai11 {
    public static int tinhTong(int a, int b, int c) {
        int ketQua = a + b + c;
        return ketQua;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hãy nhập vào 3 số lần lượt là : ");
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());
        int ketQua =tinhTong(a, b, c);
        System.out.println("Tổng 3 số là " + ketQua);
        sc.close();
    }
}
