import java.util.Scanner;

public class bai25 {
    final static int min = -1000;
    final static int max = 1000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=nhapN(sc);
        int []a=taoMang(n);
        xuatMang(a);
        lietKe(a);
    }
    
    public static int nhapN(Scanner sc) {
        int n;
        do {
            System.out.println("hay nhap vao n");
            n = Integer.parseInt(sc.nextLine());
            if (n < 1 || n % 2 != 0) {
                System.out.println(" ban da nhap sai moi ban nhap lai ");
            }
        } while (n < 1 || n % 2 != 0);
        return n;
    }

    public static int[] taoMang(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = min + (int) (Math.random() * ((max - min) + 1));
        }
        return a;
    }

    public static void xuatMang(int[] a) {
        System.out.println(" xuat mang ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println("\n");
    }

    public static boolean ktLaSoLe(int n){
        n= Math.abs(n);
        boolean flag;
        while(n>=10){
            n/=10;
        }
        if(n%2 == 0){
            flag=false;
        }else{
            flag = true;
        }
        return flag;
    }

    public static void lietKe(int []a){
       for(int i=0;i<a.length;i++){
           if(ktLaSoLe(i)){
               System.out.println("cac so le co chu so  dau tien la\n"+"\t");
           }
       }
        
    }
}
