import java.util.Scanner;

public class bai9 {
    public static int timMax(int a, int b) {
        // int max = a;
        // if (b > max);
        // {
        //     max = b;
        // }
        // if (c > max) {
        //     max = c;
        // }
        // return max;
        int max =0;
        if(a>b){
            max =a;
        }else{
            max =b;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hãy nhập vào a : ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("hãy nhập vào b : ");
        int b = Integer.parseInt(sc.nextLine());
        int ketQua = timMax(a, b);
        System.out.println("so lon nhat la " + ketQua);
        sc.close();
    }
}
