import java.util.Scanner;

public class bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ban da thi rot " + kiemTraDiemThi(sc) + " lan");
    }

    public static int kiemTraDiemThi(Scanner sc) {
        float diem = 0;
        int cout = 0;
        while (diem < 5) {
            System.out.println("hay nhap vao diem cua ban");
            diem = Float.parseFloat(sc.nextLine());
            if (diem < 5) {
                System.out.println("ban da thi rot ");
                cout++;
            } else {
                System.out.println("ban thi dau");
            }
        }
        return cout;
    }

}
