import java.util.Scanner;

public class bai31 {
    static char MIN = 'A';
    static char MAX = 'D';

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= nhapN(sc);
        int []a = taoMang(n);
        int []b=a;
        a= shuffle(a);
        xuatMang(a);
        b=shuffle(a);
        int cout = demShuffle(a, b);
        System.out.println("can hoan doi"+cout + "lan de ve ban dau");
    }

    public static int nhapN(Scanner sc) {
        int n;
        do {
            System.out.println("hay nhap vao n");
            n = Integer.parseInt(sc.nextLine());
            if (n < 2 || n % 2 != 0) {
                System.out.println(" ban da nhap sai moi ban nhap lai ");
            }
        } while (n < 2 || n % 2 != 0);
        return n;
    }

    public static int[] taoMang(int n) {
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = MIN + (char) (Math.random() * ((MAX - MIN) + 1));
        }
        return a;
    }

    public static void xuatMang(int a[]) {
        System.out.println(" xuat mang ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println("\n");
    }

    public static int[] shuffle(int a[]) {
        int[] tam = new int[a.length];
        for (int i = 0; i < a.length/2; i++) {
            tam[2*i]= a[i];
            tam[2*i +1]=a[a.length/2 +i];
            
        }
        a=tam;
        return a;
    }

    public static boolean isEqual(int a[],int []b){
        for (int i = 0; i < a.length; i++) {
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }

    public static int demShuffle(int a[],int []b){
        int dem=0;
        do{
            b=shuffle(b);
            xuatMang(b);
            dem++;
        }while(!isEqual(a, b));
        return dem;
    }
}
