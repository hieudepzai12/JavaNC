/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap02.bt5;

/**
 *
 * @author levan
 */
public class ThiSinhKhoiB extends ThiSinh{
    private double toan;
    private double hoa;
    private double sinh;
    public ThiSinhKhoiB(String soBaoDanh, String hoTen, String diaChi, String mucUuTien,double toan,double sinh,double hoa) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
        this.toan=toan;
        this.sinh=sinh;
        this.hoa=hoa;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getLy() {
        return sinh;
    }

    public void setLy(double sinh) {
        this.sinh = sinh;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }

    @Override
    public String toString() {
        return "ThiSinhKhoiB{" +super.toString()+ "toan=" + toan + ", sinh=" + sinh + ", hoa=" + hoa + '}';
    }   
}
