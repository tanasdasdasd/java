import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        String ten;
        int soLuong;
        float donGia;
        float thanhTien;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao ten mat hang ");
        ten = sc.nextLine();
        System.out.println("nhap vao so luong mat hang");
        soLuong = Integer.parseInt(sc.nextLine());
        System.out.println("nhap vao don gia ");
        donGia = Float.parseFloat(sc.nextLine());
        if (soLuong >= 100) {
            thanhTien = 100 * donGia + (soLuong - 100) * 0.88f;
        } else if (soLuong >= 50 && soLuong <= 100) {
            thanhTien = 50 * donGia + (soLuong - 50) * 0.92f;
        } else {
            thanhTien = soLuong * donGia;
        }
        System.out.println("ten mat hang la " + ten);
        System.out.println("so tien can thanh toan la : " + thanhTien);
        sc.close();
    }
}
