/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap02.bt2;

/**
 *
 * @author levan
 */
public class HinhTru extends HinhTron {

    private double chieucao;

    public HinhTru() {
        super();
        this.chieucao = 0;
    }

    public HinhTru(double chieucao, double bankinh) {
        super(bankinh);
        this.chieucao = chieucao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieucao = chieucao;
    }

    public double getChieuCao() {
        return chieucao;
    }

    public double getTheTich() {
        return getDienTich() * chieucao;
    }

    @Override
    public double getDienTich() {
        return 2 * 3.14 * getBanKinh() * (getBanKinh() + chieucao);
    }
    @Override
    public void Xuat()
    {
        System.out.println("HTron[chieucao:"+chieucao+", bankinh:" + getBanKinh() + ", dientich:" + getDienTich()+", thetich:"+ getTheTich());
    }
}
