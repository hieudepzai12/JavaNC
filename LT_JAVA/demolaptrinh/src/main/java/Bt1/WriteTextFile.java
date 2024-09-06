/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bt1;

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author levan
 */
public class WriteTextFile {
    public static void main (String[] args) throws IOException{
        ArrayList<SanPham> ds=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<3; i++){
            System.out.println(" Nhap ma so san pham: ");
            String maso=sc.nextLine();
            System.out.println(" Nhap ten san phamL: ");
            String ten=sc.nextLine();
            System.out.println(" Nhap gia san pham: ");
            Float gia=Float.parseFloat(sc.nextLine());
        }
        
        ds.add(new SanPham("SP01", "Gao", 30000));
        ds.add(new SanPham("SP02", "Dau", 40000));
        ds.add(new SanPham("SP03", "Nuoc mam", 50000));
        
        try{
                FileWriter fw= new FileWriter("sanpham.txt");
           for(SanPham x:ds){
           fw.write(x.getMaso()+";"+ x.getTen()+";"+x.getGia()+"\n");
           }  
           fw.close();
           System.out.println("Da ghi xong");
        }
        catch (Exception ex){
        System.out.println(ex.toString());
        System.out.println("Thao tac ghi file that bai");
        }
    }
}
