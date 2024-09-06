/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bt2;

import Bt1.SanPham;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author levan
 */
public class WriteObject {
    public static void main(String[] args) {
        ArrayList<SanPham> listSP = new ArrayList<>();
        listSP.add(new SanPham("sp01", "Gạo", 30000));
        listSP.add(new SanPham("sp02", "Đường", 20000));
        listSP.add(new SanPham("sp03", "Muối", 15000));
        try{
            FileOutputStream fos = new FileOutputStream("sanpham.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listSP);
            System.out.println("Ghi file thanh cong");
            oos.close();
        }
        catch(Exception ex){
            System.out.println("Loi: " + ex.toString());
            System.out.println("Ghi file that bai");
        }
    }
}
