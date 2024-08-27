/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap02.bt5;

/**
 *
 * @author levan
 */
public class ThiSinhKhoiC extends ThiSinh {
    
    private double van;
    private double su;
    private double dia;

    public ThiSinhKhoiC(double van, double su, double dia, String soBaoDanh, String hoTen, String diaChi, String mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
        this.van = van;
        this.su = su;
        this.dia = dia;
    }

    public double getVan() {
        return van;
    }

    public void setVan(double van) {
        this.van = van;
    }

    public double getSu() {
        return su;
    }

    public void setSu(double su) {
        this.su = su;
    }

    public double getDia() {
        return dia;
    }

    public void setDia(double dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return "ThiSinhKhoiC{" +super.toString()+ "van=" + van + ", su=" + su + ", dia=" + dia + '}';
    }  
}
