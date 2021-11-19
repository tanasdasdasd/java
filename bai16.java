import java.util.Scanner;

public class bai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap vao 1 so a ");
        float a = Float.parseFloat(sc.nextLine());
        System.out.println(" nhap vao 1 so b ");
        float b = Float.parseFloat(sc.nextLine());
        xuLiMenu(a, b);

    }

    public static void inMemu() {
        System.out.println(" 1.Tinh tong cua 2 so a va b ");
        System.out.println(" 2.Tinh hieu cua 2 so a va b ");
        System.out.println(" 3.Tinh tich cua 2 so a va b ");
        System.out.println(" 4.Tinh thuong cua 2 so a va b ");
        System.out.println(" 5.Thoat chuong trinh ");

    }

    public static void xuLiMenu(float a, float b) {
        int chon;
        do {
            inMemu();
            Scanner sc = new Scanner(System.in);
            System.out.println(" moi ban chon ");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
            case 1:
                float tong = a + b;
                System.out.println(" tong cua 2 so la\t" + tong);
                break;
            case 2:
                float hieu = a - b;
                System.out.println(" hieu cua 2 so la\t" + hieu);
                break;
            case 3:
                float tich = a * b;
                System.out.println(" tich cua 2 so la\t" + tich);
                break;
            case 4:
                float thuong;
                if (b < 0) {
                    thuong = a / (-b * -1);
                    System.out.println(" thuong cua 2 so la\t" + thuong);
                    // break;

                } else {
                    thuong = a / b;
                    System.out.println(" thuong cua 2 so la\t" + thuong);
                    // break;
                }
                break;
            case 5:
                break;
            default:
                System.out.println(" ban da chon sai moi ban chon lai ");
            }
        } while (chon == 0 || chon > 5);

    }
}
