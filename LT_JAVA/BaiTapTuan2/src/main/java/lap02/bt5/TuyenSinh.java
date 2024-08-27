/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap02.bt5;

/**
 *
 * @author levan
 */
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class TuyenSinh {
    private List<ThiSinh> ds;

    public TuyenSinh() {
        ds = new ArrayList<>();
    }

    public void themThiSinh(ThiSinh ts) {
        
        ds.add(ts);
        System.out.println("Da them thi sinh thanh cong.");
    }

    public void hienThiThongTin() {
        if (ds.isEmpty()) {
            System.out.println("Danh sach thi sinh trong.");
            return;
        }
        for (ThiSinh thiSinh : ds) {
            System.out.println(thiSinh);
        }
    }

    public ThiSinh timKiemTheoSoBaoDanh(String soBaoDanh) {
        for (ThiSinh thiSinh : ds) {
            if (thiSinh.getSoBaoDanh().equals(soBaoDanh)) {
                return thiSinh;
            }
        }
        return null;
    }  

    
}
