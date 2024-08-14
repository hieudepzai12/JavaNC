/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btmang;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author ADMIN
 */
public class Baitap19 {

    public static void main(String[] args) {
        int[] a; // Khai báo mảng 1 chiều
        int n;  // Khai biến n (số phần tử sử dụng)

        Scanner sc = new Scanner(System.in);

        n = docSoPhanTu(sc); // Nhập số lượng phần tử của mảng
        a = new int[n]; // Cấp phát mảng

        phatSinhMang(a); // Nhập các giá trị cho mảng

        System.out.print("Mang duoc phat sinh:");
        xuatMang(a); // Xuất mảng ra màn hình

        sapXepTang(a);
        System.out.print("\nMang sau khi sap xep tang:");
        xuatMang(a);

        // Câu b:
        System.out.print("\nCho biet gia tri x:");
        int x = sc.nextInt();
        System.out.print("Cac phan tu la uoc so cua x: ");
        lietKeUocSo(a, x);
    }

    // Định nghĩa phương thức nhập mảng
    public static int docSoPhanTu(Scanner sc) {
        int n;
        do {
            System.out.print("\nNhap so luong phan tu cua mang (1 <= n <= 20): ");
            n = sc.nextInt();
        } while (n < 1 || n > 20);
        return n;
    }

    // Phương thức phát sinh mảng ngẫu nhiên
    public static void phatSinhMang(int[] a) {
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(100); // Phát sinh số ngẫu nhiên trong khoảng 0-99
        }
    }

    // Phương thức sắp xếp mảng tăng dần
    public static void sapXepTang(int[] a) {
        Arrays.sort(a);
    }

    // Phương thức in mảng ra màn hình
    public static void xuatMang(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    // Phương thức liệt kê các phần tử là ước số của x
    public static void lietKeUocSo(int[] a, int x) {
        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            if (x % a[i] == 0) {
                System.out.print(a[i] + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("\nKhong co phan tu nao la uoc so cua " + x);
        }
        System.out.println();
    }
}
