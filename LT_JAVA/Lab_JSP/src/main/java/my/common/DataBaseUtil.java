/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DataBaseUtil {

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-FBE59P3;databaseName=qlts", "sa", "sa");
        } catch (Exception e) {
            System.out.println("Loi:" + e.toString());
        }
        return conn;
    }

    public static void main(String[] args) {
        System.out.println(DataBaseUtil.getConnection());
    }
}
