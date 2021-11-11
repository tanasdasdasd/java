import java.util.Scanner;

public class bai10 {
    public static boolean chanLe(int a){
        
        if(a%2==0){
           return true;
        }else{
           return false;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao 1 so ");
        int b= Integer.parseInt(sc.nextLine());
        chanLe(b);
        sc.close();
    }
}
