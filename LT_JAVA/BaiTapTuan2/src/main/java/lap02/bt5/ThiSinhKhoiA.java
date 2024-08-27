/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap02.bt5;

/**
 *
 * @author levan
 */
public class ThiSinhKhoiA extends ThiSinh{
    private double toan;
    private double ly;
    private double hoa;
    
    public ThiSinhKhoiA(String soBaoDanh, String hoTen, String diaChi, String mucUuTien,double toan,double ly,double hoa) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
        this.toan=toan;
        this.ly=ly;
        this.hoa=hoa;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getLy() {
        return ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }

    @Override
    public String toString() {
        return "ThiSinhKhoiB{" +super.toString()+ "toan=" + toan + ", ly=" + ly + ", hoa=" + hoa + '}';
    }   
}
