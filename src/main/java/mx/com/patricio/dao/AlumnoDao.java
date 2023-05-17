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
import mx.com.patricio.bean.Alumno;

/**
 *
 * @author patri
 */
public class AlumnoDao implements Crud<Alumno> {

    @Override
    public List<Alumno> consultar() {
        List<Alumno> listAlumnos = new ArrayList<>();
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM alumnos");
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

                Alumno a = new Alumno();

                a.setNombre(rst.getString(1));
                a.setEdad(rst.getInt(2));
                a.setPais(rst.getString(3));
                a.setGenero(rst.getString(4));

                listAlumnos.add(a);
            }

            rst.close();
            conn.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TortugaDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TortugaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listAlumnos;

    }

    @Override
    public void insertar(Alumno a) {

        try {
            StringBuilder sql = new StringBuilder();
            sql.append("INSERT INTO alumnos (`Nombre`, `Edad`, `Pais`, `Genero`, `Descripcion`) VALUES (?,?,?,?,?)");
            Connection conn = Conexion.getConexion();
            PreparedStatement pstmt = conn.prepareStatement(sql.toString(), PreparedStatement.RETURN_GENERATED_KEYS);

            pstmt.setString(1, a.getNombre());
            pstmt.setInt(2, a.getEdad());
            pstmt.setString(3, a.getPais());
            pstmt.setString(4, a.getGenero());
            pstmt.setString(5, "test");

            pstmt.executeUpdate();
            ResultSet rs = pstmt.getGeneratedKeys();
            while (rs.next()) {
                System.out.println("Id generado: " + rs.getInt(1));
            }
            System.out.println("El Alumno " + a.getNombre() + " se ha insertado");
            pstmt.close();
            conn.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TortugaDao.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TortugaDao.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void modificar(Alumno a) {
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("UPDATE alumnos SET `Nombre` = ?, `Edad` = ?, `Pais` = ?,`Genero` = ? WHERE (`id` = '2')");
            Connection conn = Conexion.getConexion();
            PreparedStatement pstmt = conn.prepareStatement(sql.toString(), PreparedStatement.RETURN_GENERATED_KEYS);

            pstmt.setString(1, a.getNombre());
            pstmt.setInt(2, a.getEdad());
            pstmt.setString(3, a.getPais());
            pstmt.setString(4, a.getGenero());
            //pstmt.setString(5, "test");

            pstmt.executeUpdate();
            ResultSet rs = pstmt.getGeneratedKeys();
            while (rs.next()) {
                //  System.out.println("Id generado: " + rs.getInt(1));
            }
            System.out.println("El id Alumno " + 2 + " se ha modificado");
            pstmt.close();
            conn.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TortugaDao.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TortugaDao.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void eliminar(Alumno a) {
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("DELETE FROM alumnos WHERE (`Nombre` = ?)");
            Connection conn = Conexion.getConexion();
            PreparedStatement pstmt = conn.prepareStatement(sql.toString(), PreparedStatement.RETURN_GENERATED_KEYS);

            pstmt.setString(1, a.getNombre());
//            pstmt.setInt(2, a.getEdad());
//            pstmt.setInt(3, 2);

            pstmt.executeUpdate();
            ResultSet rs = pstmt.getGeneratedKeys();
            while (rs.next()) {
                //  System.out.println("Id Afectado: " + rs.getInt(1));
            }
            System.out.println("Alumno eliminado " + a.getNombre());
            pstmt.close();
            conn.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TortugaDao.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TortugaDao.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }

}
