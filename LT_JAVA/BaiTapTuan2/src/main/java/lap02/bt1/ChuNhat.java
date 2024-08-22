/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap02.bt1;

/**
 *
 * @author levan
 */
public class ChuNhat {
    public double chieudai;
    public double chieurong;
   
    public ChuNhat(double chieudai, double chieurong)
    {
        this.chieudai=chieudai;
        this.chieurong=chieurong;
    }
    
    public double getChuVi()
    {
        return (chieudai+chieurong)*2;
        
    }
    public double getDienTich()
    {
        return chieudai*chieurong;
    }
    public void Xuat()
    {
        System.out.println("HCN[dai:" + chieudai + ", rong:" + chieurong + ", dientich:" + getDienTich()+", chuvi:"+ getChuVi());
    }
}
