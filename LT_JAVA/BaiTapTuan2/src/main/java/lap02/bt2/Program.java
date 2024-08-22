/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap02.bt2;

import java.util.Scanner;

/**
 *
 * @author levan
 */
public class Program {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("\nNhap thong tin hinh tron");
        System.out.print("Cho biet ban kinh:");
        double bankinh = sc.nextDouble();

        HinhTron htron = new HinhTron(bankinh);
        System.out.print("Ket qua:");
        htron.Xuat();

        System.out.println("\nNhap thong tin hinh tru");
        System.out.print("Nhap chieu cao hinh tru: ");
        double chieucao = sc.nextDouble();
        
        HinhTron htru = new HinhTru(chieucao, bankinh);
        System.out.print("Ket qua:");
        htru.Xuat();
}
}