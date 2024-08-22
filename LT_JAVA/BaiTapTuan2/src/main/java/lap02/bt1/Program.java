/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap02.bt1;

import java.util.Scanner;

/**
 *
 * @author levan
 */
public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhap thong tin hinh chu nhat:");
        System.out.print("Cho biet chieu dai:");
        double chieudai = sc.nextDouble();
        System.out.print("Cho biet chieu rong:");
        double chieurong = sc.nextDouble();

        ChuNhat cn = new ChuNhat(chieudai, chieurong);
        System.out.print("Ket qua:");
        cn.Xuat();

        System.out.println("\nNhap thong tin hinh vuong:");
        System.out.print("Cho biet do dai canh:");
        double canh = sc.nextDouble();

        ChuNhat hv = new Vuong(canh);
        System.out.print("Ket qua:");
        hv.Xuat();
    }
}
