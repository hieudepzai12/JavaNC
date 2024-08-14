/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vonglap;

/**
 *
 * @author ADMIN
 */
public class BaiTap13 {
    public static void main(String[] args) {
        // Gọi phương thức để tìm và in ra các số thỏa mãn điều kiện
        timVaInCacSoThoaMan();
    }

    
    public static void timVaInCacSoThoaMan() {
        System.out.println("\nCac so thoa man dieu kien la: ");

        // Duyệt qua tất cả các số từ 10 đến 99
        for (int i = 10; i <= 99; i++) {
            int chuc = i / 10;   // Lấy chữ số hàng chục
            int donVi = i % 10;  // Lấy chữ số hàng đơn vị

            int tich = chuc * donVi;    // Tính tích của 2 chữ số
            int tong = chuc + donVi;    // Tính tổng của 2 chữ số

            // Kiểm tra điều kiện: tích của 2 chữ số bằng 2 lần tổng của 2 chữ số
            if (tich == 2 * tong) {
                System.out.println(i); // In ra số thỏa mãn điều kiện
            }
        }
    }
}
