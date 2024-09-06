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
public class ReadObject {
    public static void main(String[] args) {
        ArrayList<SanPham> listSP;
        try {
            FileInputStream fis = new FileInputStream("sanpham.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            listSP = (ArrayList<SanPham>)ois.readObject();
            System.out.println("Doc file thanh cong\nKet qua doc duoc: ");
            for(SanPham sp : listSP){
                System.out.println(sp);
            }
            ois.close();

        } catch (Exception ex) {
            System.out.println("Loi: " + ex.toString());
            System.out.println("Doc file that bai");
        }
    }
}
