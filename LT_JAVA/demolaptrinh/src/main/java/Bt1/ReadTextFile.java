/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bt1;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author levan
 */
public class ReadTextFile {
     public static void main (String[] args) {
        ArrayList<SanPham> ds=new ArrayList<>();
        
        try{
                FileReader fr= new FileReader("sanpham.txt");
                BufferedReader br = new BufferedReader(fr);
                String line;
                while ((line=br.readLine()) != null){
                   String [] arr = line.split(";");
                   SanPham p = new SanPham(arr[0], arr[1], Float.parseFloat(arr[2]));
                   ds.add(p);}                   
        }
        catch (Exception ex){
        System.out.println("Loi xay ra"+ex.toString());
        }
        for (SanPham x:ds){
            System.out.println(x);
        }
    }
}
