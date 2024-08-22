/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap02.bt3;

/**
 *
 * @author levan
 */
public class SinhVienBiz extends SinhVien{
    public double diemMarketing;
    public double diemSales;

    public SinhVienBiz(String hoTen,double diemMarketing, double diemSales) {
        super(hoTen, "Biz");
        this.diemMarketing=diemMarketing;
        this.diemSales=diemSales;
    }

    public double getDiemMarketing() {
        return diemMarketing;
    }

    // Setter cho điểm Java
    public void setDiemMarketing(double diemMarketing) {
        this.diemMarketing = diemMarketing;
    }

    // Getter cho điểm HTML
    public double getDiemSales() {
        return diemSales;
    }

    // Setter cho điểm HTML
    public void setDiemSales(double diemSales) {
        this.diemSales = diemSales;
    }
    
    @Override
    public double getDiem() {
        return (2 * diemMarketing + diemSales) / 3;
    }  
}
