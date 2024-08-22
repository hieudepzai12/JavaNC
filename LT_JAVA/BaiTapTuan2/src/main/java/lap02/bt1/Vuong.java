/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap02.bt1;

/**
 *
 * @author levan
 */
public class Vuong extends ChuNhat{

      public Vuong(double canh)
      {
      super(canh,canh);
      }
      @Override
      public void Xuat()
      {
              System.out.println("HV[canh:"+ chieudai+ ", chuvi:"+ super.getChuVi()+", dientich:" + super.getDienTich());

      }
}
