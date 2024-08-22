/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap02.bt2;

/**
 *
 * @author levan
 */
public class HinhTron {
    private double bankinh;
     public HinhTron() {
        this.bankinh = 0;
    }
   
    public HinhTron(double bankinh)
    {
        this.bankinh=bankinh;
    }
    
    public double getBanKinh() {
        return bankinh;
    }

    public void setBanKinh(double bankinh) {
        this.bankinh = bankinh;
    }


    public double getChuVi()
    {
        return bankinh*2*3.14;
        
    }
    public double getDienTich()
    {
        return bankinh*bankinh*3.14;
    }
    public void Xuat()
    {
        System.out.println("HTron[bankinh:" + bankinh + ", dientich:" + getDienTich()+", chuvi:"+ getChuVi());
    }
}
