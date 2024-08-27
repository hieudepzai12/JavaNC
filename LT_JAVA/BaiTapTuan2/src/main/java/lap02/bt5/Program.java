/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap02.bt5;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Program {

    public static void main(String[] args) {
        TuyenSinh ts = new TuyenSinh();
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("========MENU========");
            System.out.println("1. Them moi thi sinh");
            System.out.println("2. Thong tin thi sinh");
            System.out.println("3. Tim kiem theo so bao danh");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    themThiSinh(ts, sc);
                    break;

                case 2:
                    hienThiThongTin(ts);
                    break;

                case 3:
                    timKiemTheoSoBaoDanh(ts, sc);
                    break;

                case 0:
                    System.out.println("GoodBye.");
                    break;

                default:
                    System.out.println("Lua chon khong hop le.");
                    break;
            }
        } while (chon != 0);

    }

    private static void themThiSinh(TuyenSinh ts, Scanner sc) {
        String chonKhoi = "a";
        String chon = "";
        double toan, ly, van, hoa, su, dia, sinh;
         
        do {
            System.out.print("Chon khoi thi (a,b,c): ");
            chonKhoi = sc.nextLine();

            System.out.print("Nhao so bao danh: ");
            String soBaoDanh = sc.nextLine();
            System.out.print("Nhap ho ten: ");
            String hoTen = sc.nextLine();
            System.out.print("Nhap dia chi: ");
            String diaChi = sc.nextLine();
            System.out.print("Nhap muc uu tien: ");
            String mucUuTien = sc.nextLine();
            if (chonKhoi.equalsIgnoreCase("a")) {
                System.out.print("Diem toan: ");
                toan = sc.nextDouble();
                System.out.print("Diem ly: ");
                ly = sc.nextDouble();
                System.out.print("Diem hoa: ");
                hoa = sc.nextDouble();
                ts.themThiSinh(new ThiSinhKhoiA(soBaoDanh, hoTen, diaChi,mucUuTien, toan, ly, hoa));
            } else if (chonKhoi.equalsIgnoreCase("b")) {
                System.out.print("Diem toan: ");
                toan = sc.nextDouble();
                System.out.print("Diem sinh: ");
                sinh = sc.nextDouble();
                System.out.print("Diem hoa: ");
                hoa = sc.nextDouble();
                ts.themThiSinh(new ThiSinhKhoiB(soBaoDanh, hoTen, diaChi, mucUuTien, toan, sinh, hoa));

            } else if (chonKhoi.equalsIgnoreCase("c")) {
                System.out.print("Diem van: ");
                van = sc.nextDouble();
                System.out.print("Diem su: ");
                su = sc.nextDouble();
                System.out.print("Diem dia: ");
                dia = sc.nextDouble();
                ts.themThiSinh(new ThiSinhKhoiC(van, su, dia, soBaoDanh, hoTen, diaChi, mucUuTien));
            }
            
            System.out.print("Tiep tuc(Y/N): ");
            chon = sc.nextLine();
        } while (chon.equalsIgnoreCase("y"));
    }

    private static void hienThiThongTin(TuyenSinh tuyenSinh) {
        tuyenSinh.hienThiThongTin();
    }

    private static void timKiemTheoSoBaoDanh(TuyenSinh tuyenSinh, Scanner scanner) {
        System.out.print("Nhap so bao danh de tim kiem thi sinh: ");
        String soBaoDanhTimKiem = scanner.nextLine();
        ThiSinh thiSinhTimKiem = tuyenSinh.timKiemTheoSoBaoDanh(soBaoDanhTimKiem);
        if (thiSinhTimKiem != null) {
            System.out.println(thiSinhTimKiem);
        } else {
            System.out.println("So bao danh khong tim thay thi sinh nao.");
        }
    }
}
