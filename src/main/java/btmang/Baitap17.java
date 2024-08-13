/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btmang;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Baitap17 {

    public static void main(String[] args) {
//khai bao mang luu so nguyen
        double[] a;
        int n;
        Scanner sc = new Scanner(System.in);
//Đọc số phần tử từ bàn phím
        
        n = docSoPhanTu(sc);
        a= new double[n];
        nhapMang(a, sc);
        System.out.print("\nMang so thuc: ");
        xuatMang(a);
        
        double tb=tinhTB(a);
        System.out.print("\nGia tri trung binh: " + tb);
        
        double min=timMin(a);
        System.out.print("\nGia tri nho nhat: " + min);
        
         
    }
//dinh nghia phuong thuc nhap mang

    public static void nhapMang(double[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhap a[" + i + "]:");
            a[i] = sc.nextDouble();
        }
    }
//dinh nghia phuong thuc xuat mang

    public static void xuatMang(double[] a) {
        for (double item : a) {
            System.out.print(item + " ");
        }
    }

    public static int docSoPhanTu(Scanner sc){
        int n;
        do {
            System.out.print("Cho biet so phan tu mang( 1 <= n <=20): ");
            n=sc.nextInt();
        }while (n< 1|| n>20);
        return n;
    }
//dinh nghia phuong thuc dem phan duong le
    public static double tinhTB(double[] a) {
        double sum = 0;
        for (double item : a) {
            sum += item; //s=s+x;
        }
        return sum / a.length;
    }
//phuong thuc tim phan tu lon nhat mang

    public static double timMin(double[] a) {
//d.Tim phan tu lon nhat cua mang
        double min = a[0];
        for (double item : a) {
            if (item < min) {
                min = item;
            }
        }
        return min;
    }

}
