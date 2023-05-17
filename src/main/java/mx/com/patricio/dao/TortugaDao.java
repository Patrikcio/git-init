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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.com.patricio.zoo.animales.Animal;
import mx.com.patricio.zoo.animales.Oviparo;
import mx.com.patricio.zoo.animales.Tortuga;

/**
 *
 * @author patri
 */
public class TortugaDao implements Crud<Tortuga> {

    @Override
    public List<Tortuga> consultar() {

        List<Tortuga> trtga = new ArrayList<>();
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM tortuga");
        try {
            Connection conn = Conexion.getConexion();
            PreparedStatement pstmt = conn.prepareStatement(sql.toString());
            ResultSet rst = pstmt.executeQuery();

            while (rst.next()) {
                //rst.getInt(1);
//                System.out.println(rst.getInt(1));
//                System.out.println(rst.getString(2));
//                System.out.println(rst.getString(3));
//                System.out.println(rst.getInt(4));

                Tortuga t = new Tortuga();
                t.setId(rst.getInt(1));
                t.setNombre(rst.getString(2));
                t.setEdad(rst.getInt(3));
                t.setTotalHuevos(rst.getInt(4));

                trtga.add(t);
            }

            rst.close();
            conn.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TortugaDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TortugaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return trtga;
    }

    @Override
    public void insertar(Tortuga a) {
        try {
            //  System.out.println("La tortuga Tito se ha insertado " + a.getNombre());
            StringBuilder sql = new StringBuilder();
            sql.append("INSERT INTO tortuga (`Nombre`,`Edad`,`TotalHuevos`) VALUES (?,?,?)");
            Connection conn = Conexion.getConexion();
            PreparedStatement pstmt = conn.prepareStatement(sql.toString(), PreparedStatement.RETURN_GENERATED_KEYS);

            pstmt.setString(1, a.getNombre());
            pstmt.setInt(2, a.getEdad());
            pstmt.setInt(3, 10);

            pstmt.executeUpdate();
            ResultSet rs = pstmt.getGeneratedKeys();
            while (rs.next()) {
                System.out.println("Id generado: " + rs.getInt(1));
            }
            System.out.println("La tortuga " + a.getNombre() + " se ha insertado");
            pstmt.close();
            conn.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TortugaDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TortugaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modificar(Tortuga a) {
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("UPDATE tortuga SET Nombre = ?, Edad = ?, TotalHuevos = ? WHERE (`id` = ?)");
            Connection conn = Conexion.getConexion();
            PreparedStatement pstmt = conn.prepareStatement(sql.toString());

            pstmt.setString(1, a.getNombre());
            pstmt.setInt(2, a.getEdad());
            pstmt.setInt(3, 2);
            pstmt.setInt(4, a.getId());

            pstmt.executeUpdate();
            System.out.println("Id de la tortuga afectada  " + a.getId());
            pstmt.close();
            conn.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TortugaDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TortugaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void eliminar(Tortuga a) {
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("DELETE FROM tortuga WHERE (`Nombre` = ?)");
            Connection conn = Conexion.getConexion();
            PreparedStatement pstmt = conn.prepareStatement(sql.toString());

            pstmt.setString(1, a.getNombre());
//            pstmt.setInt(2, a.getEdad());
//            pstmt.setInt(3, 2);

            pstmt.executeUpdate();
            System.out.println("tortuga eliminada " + a.getNombre());
            pstmt.close();
            conn.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TortugaDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TortugaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
