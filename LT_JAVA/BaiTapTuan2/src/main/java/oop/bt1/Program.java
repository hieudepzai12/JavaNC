/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.bt1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Rectangle r1,r2;
        System.out.println("Tao thanh cong doi tuong r1...");
        r1=new Rectangle();
        System.out.println("Tao r2....");
        System.out.print("Nhap do dai: ");
        double dai=sc.nextDouble();
        System.out.print("Nhap do rong: ");
        double rong=sc.nextDouble();
        r2=new Rectangle(dai,rong);
        
        System.out.println("Thong tin ket qua");
        System.out.println("HCN R1: -dai:"+r1.getLength()+"-rong:"+r1.getWidth()+"-Dien tich:"+r1.findArea()+"-Chu vi"+r1.findPerimeter());
        System.out.println("HCN R2: -dai:"+r2.getLength()+"-rong:"+r2.getWidth()+"-Dien tich:"+r2.findArea()+"-Chu vi"+r2.findPerimeter());
    }
}
