/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vonglap;

import java.util.Scanner;

public class BaiTap12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Nhập vào một số nguyên dương n
        System.out.print("\nNhap so nguyen duong n (n > 0): ");
        int n = sc.nextInt();
        
        // Kiểm tra nếu n <= 0 thì yêu cầu nhập lại
        while (n <= 0) {
            System.out.print("\nSo n phai lon hon 0. Nhap lai: ");
            n = sc.nextInt();
        }
        
        // Gọi phương thức để tìm và in ra chữ số lớn nhất, nhỏ nhất
        timChuSoLonNhatVaNhoNhat(n);
        sc.close();
    }
    
    // Phương thức tìm chữ số lớn nhất và nhỏ nhất
    public static void timChuSoLonNhatVaNhoNhat(int n) {
        int max = 0; 
        int min = 9; 
        
        while (n > 0) {
            int a = n % 10; // Lấy chữ số cuối cùng của n
            
            // Kiểm tra chữ số lớn nhất
            if (a > max) {
                max = a;
            }
            
            // Kiểm tra chữ số nhỏ nhất
            if (a < min) {
                min = a;
            }
            
            n /= 10; // Bỏ chữ số cuối cùng của n
        }
        
        // In ra kết quả
        System.out.println("\nChu so lon nhat: " + max);
        System.out.println("\nChu so nho nhat: " + min);
    }
}