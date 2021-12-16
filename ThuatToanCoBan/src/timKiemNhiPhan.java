package ThuatToanCoBan.src;

import java.util.Scanner;

public class timKiemNhiPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = nhapN(sc);
        int a[] = nhapMang(n, sc);
        xuatMang(a);
        System.out.println("\n");
        System.out.println("nhap vao x");
        int x = Integer.parseInt(sc.nextLine());
        int index= timKiemInDex(a, x);
        if(index!=-1){
            System.out.println("tim thay "+ x + " o vi tri " + index );
        }else{
            System.out.println("khong co " + x + " trong mang");
        }

    }

    public static int nhapN(Scanner sc) {
        int n;
        do {
            System.out.println("hay nhap vao n");
            n = Integer.parseInt(sc.nextLine());
            if (n < 0) {
                System.out.println("nhap sai vui nhap lai !!!");
            }
        } while (n < 0);
        return n;
    }

    public static int[] nhapMang(int n, Scanner sc) {
        int a[] = new int[n];
        System.out.println("hay nhap vao mang");
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "]" + "=");
            a[i]= Integer.parseInt(sc.nextLine());
        }
        return a;
    }

    public static void xuatMang(int a[]) {
        System.out.println("xuat mang");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] +"\t");
        }
    }

    public static  int timKiemInDex(int a[],int x){
        int left =0;
        int right = a.length-1;
        int mid ;
        for (int i = 0; i < a.length; i++) {
            mid = (left+right)/2;
            if(x==a[mid]){
                return mid;
            }else if(a[mid]>x){
                right = mid -1;
            }else{
                left= mid+1;
            }
        }
        return -1;
    }
}
