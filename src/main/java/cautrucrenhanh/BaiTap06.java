/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cautrucrenhanh;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BaiTap06 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Nhập vào 2 số nguyên
        System.out.print("\nNhap so thu nhat: ");
        int a = sc.nextInt();
        
        System.out.print("\nNhap so thu hai: ");
        int b = sc.nextInt();
        
        // Nhập vào phép toán
        System.out.print("\nNhap phep toan (+, -, *, /): ");
        char phepToan = sc.next().charAt(0);
        
        // Thực hiện phép toán và in kết quả
        thucHienPhepToan(a, b, phepToan);
        
        sc.close();
    }
      public static void thucHienPhepToan(int a, int b, char phepToan) {
        switch (phepToan) {
            case '+':
                System.out.println("\nKet qua: " + (a + b));
                break;
            case '-':
                System.out.println("\nKet qua: " + (a - b));
                break;
            case '*':
                System.out.println("\nKet qua: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("\nKet qua: " + (a / (double)b));  // Sử dụng phép chia thực để có kết quả chính xác
                } else {
                    System.out.println("\nKhong the chia chi 0!!");
                }
                break;
            default:
                System.out.println("\nPhep toan khong hop le!");
        }
      }
}
