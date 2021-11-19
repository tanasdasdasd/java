import java.util.Scanner;

public class bai21 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("nhap vao phan tu n");
      int n = Integer.parseInt(sc.nextLine());
      int[] a = nhapMang(n, sc);
      xuatMang(a);
      float tong = tinhTongCacSoChan(a);
      System.out.println("tong cac so chan la " + tong);
      int soKhongAm = demCacSoAm(a);
      System.out.println(" co " + soKhongAm + "so  am");
      float tongAm=tongCacSoAm(a);
      System.out.println(" tong cac so am la "+tongAm);
   }

   public static int[] nhapMang(int n, Scanner sc) {
      System.out.println("hay nhap vao 1 mang ");
      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
         System.out.print("a[" + i + "] = ");
         a[i] = Integer.parseInt(sc.nextLine());
      }
      return a;
   }

   public static void xuatMang(int[] a) {
      System.out.println("xuat mang");
      for (int i = 0; i < a.length; i++) {
         System.out.println(a[i]);
      }
   }

   public static float tinhTongCacSoChan(int[] a) {
      float tong = 0;
      for (int i = 0; i < a.length; i++) {
         if (a[i] % 2 == 0) {
            tong += a[i];
         }
      }
      return tong;
   }

   public static int demCacSoAm(int[] a) {
      int dem = 0;
      for (int i = 0; i < a.length; i++) {
         if (a[i] < 0) {
            dem++;
         }

      }
      return dem;
   }
   public static float tongCacSoAm(int a[]){
      float tong =0;
      for (int i : a) {
         if(i<0)
         tong+=i;
      }
      return tong;
   }
}
