/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap02.bt3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author levan
 */
public class Program {

    static ArrayList<SinhVien> ds = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int chon = 5;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("=======Chuong trinh quan ly sinh vien=======");
            System.out.println("1. Nhap danh sach sinh vien");
            System.out.println("2. Xuat danh sach sinh vien");
            System.out.println("3. Xuat danh sach sinh vien hoc luc Gioi");
            System.out.println("4. Sap xep danh sach sinh vien theo diem");
            System.out.println("5. Ket thuc");
            System.out.println("---------------------------------------------");
            System.out.println("Ban chon tu 1 -> 5");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    nhapDS();
                    break;
                case 2:
                    xuatDS();
                    break;
                case 3:
                    xuatDSGioi();
                    break;
                case 4:
                    Sapxep();
                    break;
                case 5:
                    System.out.println("Goodbye. See you again!!!");
                    break;
            }
        } while (chon != 5);
    }

    private static void nhapDS() {
        String tieptuc = "y";
        do {
            SinhVien sv = null;
            Scanner sc1 = new Scanner(System.in);
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Thuc hien nhap danh sach sinh vien");
            int chon = 0;
            System.out.print("Cho biet loai sinh vien(IT:1, Biz:2): ");
            chon = sc1.nextInt();
            if (chon == 1) {
                System.out.print("Ho ten: ");
                String hoTen = sc2.nextLine();
                System.out.print("Diem Java: ");
                double diemJava = sc1.nextDouble();
                System.out.print("Diem CSS: ");
                double diemCss = sc1.nextDouble();
                System.out.print("Diem HTML: ");
                double diemHTML = sc1.nextDouble();
                sv = new SinhVienIT(hoTen, diemJava, diemCss, diemHTML);
            } else if (chon == 2) {
                System.out.print("Ho ten: ");
                String hoTen = sc2.nextLine();
                System.out.print("Diem Marketing: ");
                double diemMarketing = sc1.nextDouble();
                System.out.print("Diem Sales: ");
                double diemSales = sc1.nextDouble();
                sv = new SinhVienBiz(hoTen, diemMarketing, diemSales);
            }
            if (sv != null) {
                ds.add(sv);
            }
            System.out.print("Co tiep tuc? (yes/no):");
            tieptuc = sc2.nextLine();
        } while (tieptuc.equalsIgnoreCase("y"));
    }

    private static void xuatDS() {
        System.out.println("Thuc hien xuat danh sach");
        for (SinhVien sv : ds) {
            sv.Xuat();
        }
    }

    private static void xuatDSGioi() {
        for (SinhVien sv : ds) {
            if (sv.getDiem() < 9 && sv.getDiem() >= 7.5) {
                sv.Xuat();
            }
        }
    }

    private static void Sapxep() {
        Comparator<SinhVien> cmp = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                return Double.valueOf(sv1.getDiem()).compareTo(sv2.getDiem());
            }

        };
        Collections.sort(ds, cmp);
        xuatDS();
    }
}
