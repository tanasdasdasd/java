import java.util.Scanner;

public class bai12 {
    static final int GRAB_CAR_1KM = 8000;
    static final int GRAB_SUR_1KM = 9000;
    static final int GRAB_BLACK_1KM = 10000;

    static final int GRAB_CAR_1TO_19 = 7500;
    static final int GRAB_SUR_1TO_19 = 8500;
    static final int GRAB_BLACK_1TO_19 = 9500;

    static final int GRAB_CAR_UPPER19 = 7000;
    static final int GRAB_SUR_UPPER19 = 8000;
    static final int GRAB_BLACK_UPPER19 = 9000;

    static final int GRAB_CAR_WAIT = 2000;
    static final int GRAB_SUR_WAIT = 3000;
    static final int GRAB_BLACK_WAIT = 3500;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("chuong trinh bat dau moi ban chon loai grab");
        
        System.out.println(tinhTienTra(chonGrab(sc), nhapSoKm(sc), thoiGianCho(sc)));
    }

    public static float nhapSoKm(Scanner sc) {
        System.out.println("nhap vao so km ");
        float soKm = Float.parseFloat(sc.nextLine());
        return soKm;
    }

    public static int thoiGianCho(Scanner sc) {
        System.out.println("nhap vao thoi gian cho ");
        int thoiGianCho = Integer.parseInt(sc.nextLine());
        return thoiGianCho;
    }

    public static int chonGrab(Scanner sc) {
        int loai;
        System.out.println("1.grab car");
        System.out.println("2.grab syr");
        System.out.println("3.grab black");
        loai = Integer.parseInt(sc.nextLine());
        return loai;
    }

    public static float tinhTien1km(int loaiGrab) {
        float tien = 0;
        if (loaiGrab == 1) {
            tien = GRAB_CAR_1KM;
        } else if (loaiGrab == 2) {
            tien = GRAB_SUR_1KM;
        } else {
            tien = GRAB_BLACK_1KM;
        }
        return tien;
    }

    public static float tinhTien1kmDen19km(int loaiGrab, float soKm) {
        float tien = 0;
        if (loaiGrab == 1) {
            tien = GRAB_CAR_1KM + (soKm - 1) * GRAB_CAR_1TO_19;
        } else if (loaiGrab == 2) {
            tien = GRAB_SUR_1KM + (soKm - 1) * GRAB_CAR_1TO_19;
        } else {
            tien = GRAB_BLACK_1KM + (soKm - 1) * GRAB_CAR_1TO_19;
        }
        return tien;
    }

    public static float tinhTienTren19km(int loaiGrab, float soKm) {
        float tien = 0;
        if (loaiGrab == 1) {
            tien = GRAB_CAR_1KM + 18 * GRAB_CAR_1TO_19+ (soKm - 19) * GRAB_CAR_UPPER19;
        } else if (loaiGrab == 2) {
            tien = GRAB_CAR_1KM + 18 * GRAB_SUR_1TO_19 + (soKm - 19) * GRAB_SUR_UPPER19;
        } 
         else {
            tien = GRAB_BLACK_1KM + 18 * GRAB_BLACK_1TO_19 + (soKm - 19) * GRAB_BLACK_UPPER19;

        }
        return tien;
    }

    public static float tinhTienCho(int loaiGrab, int timeWait) {
        float tien = 0;
        if (timeWait >= 3) {
            int soLanTinh = Math.round((1.0f * timeWait) / 3);
            if (loaiGrab == 1) {
                tien = soLanTinh * GRAB_CAR_WAIT;
            } else if (loaiGrab == 2) { 
                tien = soLanTinh * GRAB_SUR_WAIT;
            } else {
                tien = soLanTinh * GRAB_BLACK_WAIT;
            }

        }
        return tien;
    }

    public static float tinhTienTra(int loaiGrab, float soKm, int timeWait) {
        float tienTra = 0;
        if (soKm <= 1) {
            tienTra = tinhTien1km(loaiGrab) + tinhTienCho(loaiGrab, timeWait);
        } else if (soKm > 1 && soKm <= 19) {
            tienTra = tinhTien1kmDen19km(loaiGrab, soKm) + tinhTienCho(loaiGrab, timeWait);
        } else {
            tienTra = tinhTienTren19km(loaiGrab, soKm) + tinhTienCho(loaiGrab, timeWait);
        }
        return tienTra;

    }

}
