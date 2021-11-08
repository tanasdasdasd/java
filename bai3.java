import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        final int NUMBER_CHARACTER = -50;
        String tenPhim;
        int giaVeLon;
        int giaVeNho;
        int soVeLon;
        int soVeNho;
        int phanTramTuThien;
        float tongThu;
        float tuThien;
        float conLai;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ten bo phim ");
        tenPhim = sc.nextLine();
        System.out.println("Nhap vao gia ve nguoi lon");
        giaVeLon = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap vao gia ve tre em ");
        giaVeNho = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap vao so ve nguoi lon da ban");
        soVeLon = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap vao so ve tre em da ban ");
        soVeNho = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap vao so phan tram tu thien ");
        phanTramTuThien = Integer.parseInt(sc.nextLine());

        tongThu = giaVeLon * soVeLon + giaVeNho * soVeNho;
        //// Chú ý chỗ này vì phan tram tu thien va 100 là số nguyên nên sẽ ra 0 vì vậy
        //// cần nhân tử hoặc mẫu cho 1.0f cho thành float
        tuThien = (1.0f) * phanTramTuThien / 100 * tongThu;
        conLai = tongThu - tuThien;

        String text ; //String.format("%-50s", "tên_phim").replace(' ', '.').replace('_', ' ');
        text = String.format("%1$"+NUMBER_CHARACTER + "s", "gia_ve_nguoi_lon").replace(' ', '.').replace('_', ' ');
        System.out.println(text + tenPhim);
        System.out.println(text + giaVeLon);
        System.out.println("Gia ve tre em la" + "\t" + giaVeNho);
        System.out.println("So ve  nguoi lon la" + "\t" + soVeLon);
        System.out.println("So ve  tre em  la" + "\t" + soVeNho);
        System.out.println("Phan tram tu thien la" + "\t" + phanTramTuThien);
        System.out.println("Tong thu la " + "\t" + tongThu);
        System.out.println("Tu thien la " + "\t" + tuThien);
        System.out.println("So tien con lai  la" + "\t" + conLai);
        sc.close();
    }
}
