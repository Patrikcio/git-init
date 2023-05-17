/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.patricio.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.com.patricio.bean.UsuarioLogin;

/**
 *
 * @author patri
 */
public class UsuarioDao implements Crud<UsuarioLogin> {

    @Override
    public List<UsuarioLogin> consultar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertar(UsuarioLogin a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(UsuarioLogin a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(UsuarioLogin a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean login(UsuarioLogin u) {
        System.out.println(u);

        StringBuilder sql = new StringBuilder();
        boolean usu = false;
        sql.append("SELECT EMAIL, PASSWORD FROM usuarios WHERE EMAIL = ? AND PASSWORD = ?");

        try {
            Connection conn = Conexion.getConexion();
            PreparedStatement pstmt = conn.prepareStatement(sql.toString());
            pstmt.setString(1, u.getCorreo());
            pstmt.setString(2, u.getPassword());
            ResultSet rst = pstmt.executeQuery();

            if (rst.next()) {
                usu = true;
//                usu.setCorreo(rst.getString(1));
//                usu.setPassword(rst.getString(2));
            }
            rst.close();
            conn.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usu;
    }

}
