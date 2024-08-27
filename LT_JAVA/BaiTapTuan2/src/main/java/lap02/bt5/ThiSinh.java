/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap02.bt5;

/**
 *
 * @author levan
 */
public class ThiSinh {
    private String soBaoDanh;
    private String hoTen;
    private String diaChi;
    private String mucUuTien;

    public ThiSinh(String soBaoDanh, String hoTen, String diaChi, String mucUuTien) {
        this.soBaoDanh = soBaoDanh;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.mucUuTien = mucUuTien;
    }

    public String getSoBaoDanh() {
        return soBaoDanh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getMucUuTien() {
        return mucUuTien;
    }

    @Override
    public String toString() {
     return "So bao danh: " + soBaoDanh + ", Ho ten: " + hoTen + ", Dia chi: " + diaChi + ", Muc uu tien: " + mucUuTien;
    }   
}
