/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt2;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author levan
 */
public class DemoCalculator2 extends JFrame {
    private JLabel lbNum1, lbNum2, lbOp,lbResult;
    private JTextField txtNum1, txtNum2, txtResult;
    private JButton btTinh, btNhapLai;
    private JComboBox<String> cboPhepTinh;
    
    public DemoCalculator2(String tittle){
     super(tittle);
     
     createGui();
         
     pack();
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setLocationRelativeTo(null);
    }
    public static void main (String[] args){
    DemoCalculator2 frm=new DemoCalculator2("Simple Calculator");
    frm.setVisible(true);
    }

    private void createGui() {
         JPanel p=new JPanel();

         p.setLayout(new GridLayout(5, 2, 10, 10));
         p.add(lbNum1=new JLabel("Num 1"));
         p.add(txtNum1=new JTextField(10));
         p.add(lbNum2=new JLabel("Num2"));
         p.add(txtNum2=new JTextField(10));
         
         
          
         p.add (lbOp= new JLabel("Phép tính"));
         p.add(cboPhepTinh=new JComboBox());
         
         
          
         p.add(lbResult=new JLabel("Result"));
         p.add(txtResult=new JTextField(10));
         txtResult.setEditable(false);
         
         p.add(btTinh=new JButton("Tính"));
         p.add(btNhapLai=new JButton("Nhập lại"));
         
         add(p);
         
         //add các item cho JCOmboBox
          cboPhepTinh.addItem("Cộng");
          cboPhepTinh.addItem("Trừ");
          cboPhepTinh.addItem("Nhân");
          cboPhepTinh.addItem("Chia");
          btTinh.addActionListener((ActionEvent e) -> {
             try {
                 double x1 = Double.parseDouble(txtNum1.getText());
                 double y1 = Double.parseDouble(txtNum2.getText());
                 double kq=0;
                 
//                 int selectedIndex=cboPhepTinh.getSelectedIndex();
//                 
//                 if (selectedIndex==0) {
//                     kq = x1 + y1;
//                 } else if (selectedIndex==1) {
//                     kq = x1 - y1;
//                 } else if (selectedIndex==2) {
//                     kq = x1 * y1;
//                 } else {
//                     kq = x1 / y1;
//                     if(y1==0){
//                 JOptionPane.showMessageDialog(null, "Không thể chia cho 0!");
//             }
//                 }
String op =(String)cboPhepTinh.getSelectedItem();
if (op.equals("Cộng")) {
                     kq = x1 + y1;
                 } else if (op.equals("Trừ")) {
                     kq = x1 - y1;
                 } else if (op.equals("Nhân")) {
                     kq = x1 * y1;
                 } else {
                     kq = x1 / y1;
                     if(y1==0){
                 JOptionPane.showMessageDialog(null, "Không thể chia cho 0!");
             }}
                 txtResult.setText(String.valueOf(kq));
             }catch(Exception ex)
             {
                 JOptionPane.showMessageDialog(null, "Giá trị không hợp lệ!", "Thông báo", JOptionPane.ERROR_MESSAGE);
             }});
          btNhapLai.addActionListener((ActionEvent e) -> {
             txtNum1.setText("");
             txtNum2.setText("");
             txtResult.setText("");
             cboPhepTinh.setSelectedIndex(0);
//             rdCong.setEnabled(true);
             txtNum1.requestFocus();
          });
         
    }
}
