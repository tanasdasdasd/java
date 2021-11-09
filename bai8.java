import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        int m;
        int y;
        int d;
        int top;
        boolean flat =true;
        int dayofweek;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào ngày : ");
        d = Integer.parseInt(sc.nextLine());
        System.out.println("nhập vào tháng : ");
        m = Integer.parseInt(sc.nextLine());
        System.out.println("nhập vào năm : ");
        y = Integer.parseInt(sc.nextLine());

        if (y < 1582) {
            flat = false;
        }
        if (m < 0 || m > 12) {
            flat = false;
        }

        switch (m) {
        case 4:
        case 6:
        case 9:
        case 11:
            top = 30;
            break;

        case 2:
            if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {// day la nam nhuan
                top = 29;
            } else {
                top = 28;
            }
            break;
        default:
            top = 31;

        }
        if (d < 1 || d > top) {
            flat = false;
        }
        if (!flat) {
            System.out.println(" khong hop le");
        } else {
            int a = (14 - m) / 12;
            y -= a;
            m += 12 * a - 2;
            dayofweek = (d + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
            if (dayofweek == 0) {
                System.out.println("la ngay chu nhat");
            } else {
                int thu = dayofweek + 1;
                System.out.println("hôm nay là thứ " + thu);
            }

        }
        sc.close();

    }

}
