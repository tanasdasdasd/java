import java.util.Scanner;

public class bai17 {
    public static void main(String[] args) {
        doanSo();
    }
    public static void doanSo(){
        Scanner sc = new Scanner(System.in);
        float nhap ;
        int soBiMat = (int) (Math.random()*99+1);
        do{
            System.out.println(" hay nhap vao 1 so");
            nhap = Float.parseFloat(sc.nextLine());
            if(nhap >soBiMat){
                System.out.println(" vui long nhap so nho hon ");
            }else if (nhap < soBiMat){
                System.out.println(" vui long nhap so lon hon ");
            }
        }while(nhap != soBiMat);
        System.out.println(" ban da chien thang !!!!");
        sc.close();
    }
}
