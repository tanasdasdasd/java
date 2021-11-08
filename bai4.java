import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        float soDuTaiKhoan;
        float tienThanhToanTrongThang;
        float tienPhat =0 ;
        final float lai = 1.5f;
        float soTienChuaThanhToan;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số dư tài khoản : ");
        soDuTaiKhoan = Float.parseFloat(sc.nextLine());
        System.out.print("Nhập vào số tiền thanh toán trong tháng : ");
        tienThanhToanTrongThang = Float.parseFloat(sc.nextLine());
        soTienChuaThanhToan = soDuTaiKhoan - tienThanhToanTrongThang;

        if (soTienChuaThanhToan > 0) {
            tienPhat = soTienChuaThanhToan * lai / 100;
            
        }else{
            System.out.println("ko co tien phat");
        }
       System.out.println("tien phat la"+tienPhat);
        
       //aaaaaaa
        sc.close();
    }
}
