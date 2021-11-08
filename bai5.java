import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {

        final int time = 40;
        int hours;
        float rate;
        float bonnus;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số giờ làm : ");
        hours = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào số tiền theo giò : ");
        rate = Float.parseFloat(sc.nextLine());
        if (hours > time) {
            bonnus = hours * rate + 1.5f * rate * (hours - time);
        } else {
            bonnus = hours * rate;
        }
        System.out.println("so tien phai tra la " + bonnus);
        sc.close();
    }
}