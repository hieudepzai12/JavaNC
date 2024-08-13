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
public class Baitap18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Đọc số phần tử của mảng
        int n = docSoPhanTu(sc);

        // Khởi tạo mảng
        int[] a = new int[n];

        // Nhập các phần tử cho mảng
        for (int i = 0; i < n; i++) {
            System.out.print("\nNhap phan tu thu " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        // Liệt kê các phần tử không phải là số nguyên tố
        System.out.print("\nCac phan tu khong phai la so nguyen to: ");
        khongPhaiSoNguyenTo(a);

        // Tính trung bình cộng các số nguyên tố trong mảng
        double tbSoNguyenTo = tinhTBSoNguyenTo(a);
        System.out.println("\nTrung binh cong cac so nguyen to co trong mang: " + tbSoNguyenTo);
    }

    // Các phương thức đã được định nghĩa trước đó
    // Đọc số phần tử của mảng
    public static int docSoPhanTu(Scanner sc) {
        int n;
        do {
            System.out.print("\nCho biết số phần tử của mảng (1 <= n <= 50): ");
            n = sc.nextInt();
        } while (n < 1 || n > 50);
        return n;
    }

    // Kiểm tra số nguyên tố
    public static boolean laSoNguyenTo(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Liệt kê các phần tử không phải là số nguyên tố
    public static void khongPhaiSoNguyenTo(int[] a) {
        for (int x : a) {
            if (!laSoNguyenTo(x)) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
    }

    // Tính trung bình cộng của các số nguyên tố trong mảng
    public static double tinhTBSoNguyenTo(int[] a) {
        double sum = 0;
        int count = 0;
        for (int x : a) {
            if (laSoNguyenTo(x)) {
                sum += x;
                count++;
            }
        }
        return (count == 0) ? 0 : sum / count;
    }
}
