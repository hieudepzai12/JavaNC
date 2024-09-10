/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt2;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author levan
 */
public class Program {
    public static void main (String[] args){
        JFrame frm=new JFrame("Symple Calculator");
        
        //tạo thùng chứa các Component
        JPanel p=new JPanel();
        p.setLayout(new FlowLayout());
//        p.setLayout(new GridLayout(3, 2, 10, 10));
//         p.setLayout(null);
        JLabel lbNum1= new JLabel("Num 1");
        JLabel lbNum2= new JLabel("Num 2");
        JLabel lbResult= new JLabel("Result");
        
        JTextField txtNum1=new JTextField(10);
        JTextField txtNum2=new JTextField(10);
        JTextField txtResult= new JTextField(10);
        
        JButton btAdd= new JButton ("Add");
        JButton btSub= new JButton ("Sub");
        JButton btMul= new JButton ("Mul");
        JButton btDiv= new JButton ("Div");
        
        p.add(lbNum1);
        p.add(txtNum1);
        p.add(lbNum2);
        p.add(txtNum2);
        p.add(lbResult);
        p.add(txtResult);
        p.add(btAdd);
        p.add(btSub);
        p.add(btMul);
        p.add(btDiv);
        
//        lbNum1.setBounds(10,10, 100, 30);
//        txtNum1.setBounds(120,10, 150,30);
//        
//        lbNum2.setBounds(10,50, 100, 30);
//        txtNum2.setBounds(120,50, 150,30);
//        
//        lbResult.setBounds(10,50, 100, 30);
//        txtResult.setBounds(120,50, 150,30);
//        
//        btAdd.setBounds(30,90, 100, 30);
//        btSub.setBounds(140,90, 100,30);
//        btMul.setBounds(30,90, 100, 30);
//        btDiv .setBounds(140,90, 100,30);
        frm.add(p);
        frm.setSize(300, 200);
        frm.setLocationRelativeTo(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
    }
}
