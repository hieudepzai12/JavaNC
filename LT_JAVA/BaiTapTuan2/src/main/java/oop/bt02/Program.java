/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.bt02;

import java.text.DecimalFormat;

/**
 *
 * @author ADMIN
 */
public class Program {

    public static void main(String[] args) {
        DecimalFormat fmt=new DecimalFormat("#,##0.00");
        Account ac1 = new Account("T454643", "Le Van Hoang Hieu", 20000000);
        Account ac2 = new Account("Dinh Thi Khanh Linh", "You", 5000000);

        System.out.println("====Thong tin 2 tai khoan ban dau====");
        System.out.println("My Account: [id:" + ac1.getId() + ", Name:" + ac1.getName() + ", Balance:" + fmt.format(ac1.getBalance()) + "]");
        System.out.println("Friend Account: [id:" + ac2.getId() + ", Name:" + ac2.getName() + ", Balance:" + fmt.format(ac2.getBalance()) + "]");
        
        System.out.println("Nap tien vao my account");
        ac1.credit(2000000);
        System.out.println("Rut tien tu friend account ");
        ac2.debit(4000000);
        System.out.println("Chuyen tien tu ac1 den friend ac2");
        ac1.tranferTo(ac2, 3000000);

        System.out.println("Sau khi thuc hien giao dich:");
        System.out.println("My Account: [id:" + ac1.getId() + ", Name:" + ac1.getName() + ", Balance:" + fmt.format(ac1.getBalance()) + "]");
        System.out.println("Friend Account: [id:" + ac2.getId() + ", Name:" + ac2.getName() + ", Balance:" + fmt.format(ac2.getBalance()) + "]");
    }

}
