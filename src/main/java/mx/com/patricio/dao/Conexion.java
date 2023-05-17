/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.patricio.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author patri
 */
public class Conexion {
    private Conexion(){
        
    }
    public static Connection getConexion() throws ClassNotFoundException, SQLException{
        String password ="valadez23";
        String usuario = "root";
       // String url = "jdbc:mysql://localhost:3306/cursojsfdcinternet";
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cursojsfdcinternet?useSSL=false&serverTimezone=UTC",usuario,password);
  
        System.out.println("Conexion A Mysql Exitosa");
        return conn;
    }
    
}
