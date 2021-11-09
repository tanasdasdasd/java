import java.util.Scanner;

public class bai10 {
    public static void chanLe(int a){
        
        if(a%2==0){
            System.out.println("a la so chan ");
        }else{
            System.out.println("a la so le ");
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
