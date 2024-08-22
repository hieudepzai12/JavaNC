/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap02.bt3;

/**
 *
 * @author levan
 */
public abstract class SinhVien {

    public String hoTen;
    public String nganh;

    public SinhVien(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public abstract double getDiem();

    public String getHocLuc() {
        double diem = getDiem();
        String kq = "";
        if (diem < 5) {
            kq = "Yeu";
        } else if (diem < 6.5) {
            kq = "Trung binh";
        } else if (diem < 7.5) {
            kq = "Kha";
        } else if (diem < 9) {
            kq = "Gioi";
        } else {
            kq = "Xuat sac";
        }
        return kq;
    }

    public void Xuat() {
        System.out.println("SinhVien[hoten:" + hoTen + ", Nganh:" + nganh + ", diem:" + getDiem() + ", hoc luc:" + getHocLuc());
    }
}
