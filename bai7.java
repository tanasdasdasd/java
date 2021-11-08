import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        String name;
        float math;
        float ly;
        float hoa;
        Scanner sc = new Scanner(System.in);

        System.out.println("hay nhap vao ten cua ban : ");
        name = sc.nextLine();
        System.out.println("hay nhap vao diem toan cua ban : ");
        math = Float.parseFloat(sc.nextLine());
        System.out.println("hay nhap vao diem ly cua ban : ");
        ly = Float.parseFloat(sc.nextLine());
        System.out.println("hay nhap vao diem hoa cua ban : ");
        hoa = Float.parseFloat(sc.nextLine());

        float average = (math + ly + hoa) / 3;
        System.out.println("diem trung binh cua ban la " + average);
        if (average >= 8.5f) {
            System.out.println(name + "ban la hoc sinh gioi");
        }

        else if (average >= 6.5f && average <= 8.5) {
            System.out.println(name + "ban la hoc sinh kha ");
        } else if (average >= 5 && average < 6.5) {
            System.out.println(name + "ban la hoc sinh trung binh ");
        } else {
            System.out.println(name + "ban la hoc sinh yeu ");
        }
        sc.close();
    }

}
