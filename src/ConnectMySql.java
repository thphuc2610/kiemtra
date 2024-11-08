
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;

/**
 *
 * @author ADMIN
 */
public class ConnectMySql {
    public Connection getConnection(String dbURL, String userName, String password) {
        Connection cnn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cnn = DriverManager.getConnection(dbURL, userName, password);
            System.out.println("connect success");
        } catch (Exception e) {
            System.out.println("connect failure");
            e.printStackTrace();
        }
        return cnn;
    }
}