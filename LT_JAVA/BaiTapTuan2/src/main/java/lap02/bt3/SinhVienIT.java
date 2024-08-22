/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap02.bt3;

/**
 *
 * @author levan
 */
public class SinhVienIT extends SinhVien{
    public double diemJava;
    public double diemCss;
    public double diemHTML;

    public SinhVienIT(String hoTen, double diemJava, double diemCss, double diemHTML) {
        super(hoTen, "IT");
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHTML = diemHTML;
    }

   
    @Override
    public double getDiem() {
        return(diemJava *2 + diemCss+diemHTML)/4;
    }
}
