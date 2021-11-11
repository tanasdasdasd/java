import java.util.Scanner;

public class bai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ketQua=tinhTong(sc);
        System.out.println("tong cac so la "+ ketQua);
    }
    public static int tinhTong(Scanner sc){
        int sum =0;
        int nhap =1;
        while(nhap>0){
            System.out.println("hay nhap vao 1 so ");
            nhap = Integer.parseInt(sc.nextLine());
            sum +=nhap;
        }
        return sum;
    }
}
