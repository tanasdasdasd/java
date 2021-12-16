import java.util.Scanner;

public class bai0{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao n ");
        int n = Integer.parseInt(sc.nextLine());
        int tong =0;
        sc.close();
        for (int i = 1; i < n; i++) {
            if(n%i ==0 ){
                tong +=i;
            }
            
        }
        if(tong ==n){
            System.out.println(n + " la so hoan hao");
        }else{
            System.out.println(n+ " ko phai la so hoan hao");
        }
    }
}
