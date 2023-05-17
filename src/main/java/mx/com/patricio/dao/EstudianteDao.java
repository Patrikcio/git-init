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
import mx.com.patricio.bean.Estudiante;

/**
 *
 * @author patri
 */
public class EstudianteDao implements Crud<Estudiante> {

    @Override
    public List<Estudiante> consultar() {
        List<Estudiante> listAlumnos = new ArrayList<>();
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM alumnos");
        try {
            Connection conn = Conexion.getConexion();
            PreparedStatement pstmt = conn.prepareStatement(sql.toString());
            ResultSet rst = pstmt.executeQuery();

            while (rst.next()) {

                listAlumnos.add(new Estudiante(rst.getInt(1), rst.getString(2), rst.getInt(3), rst.getString(5), rst.getString(4), rst.getString(6)));

            }

            rst.close();
            conn.close();
            System.out.println("conexionExitosa");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EstudianteDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EstudianteDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listAlumnos;

    }

    @Override
    public void insertar(Estudiante a) {
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("INSERT INTO alumnos (`Nombre`, `Edad`, `Pais`, `Genero`, `Descripcion`) VALUES (?,?,?,?,?)");
            Connection conn = Conexion.getConexion();
            PreparedStatement pstmt = conn.prepareStatement(sql.toString(), PreparedStatement.RETURN_GENERATED_KEYS);

            pstmt.setString(1, a.getNombre());
            pstmt.setInt(2, a.getEdad());
            pstmt.setString(3, a.getPais());
            pstmt.setString(4, a.getGenero());
            pstmt.setString(5, a.getDescripcion());

            pstmt.executeUpdate();
            ResultSet rs = pstmt.getGeneratedKeys();
            while (rs.next()) {
                System.out.println("Id generado: " + rs.getInt(1));
            }
            System.out.println("El Alumno " + a.getNombre() + " se ha insertado");
            pstmt.close();
            conn.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EstudianteDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EstudianteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modificar(Estudiante a) {

        try {
            StringBuilder sql = new StringBuilder();
            sql.append("UPDATE alumnos SET `Nombre` = ?, `Edad` = ?, `Pais` = ?,`Genero` = ?,`Descripcion` = ?  WHERE (`id` = ?)");
            Connection conn = Conexion.getConexion();
            PreparedStatement pstmt = conn.prepareStatement(sql.toString());

          
            pstmt.setString(1, a.getNombre());
            pstmt.setInt(2, a.getEdad());
            pstmt.setString(3, a.getPais());
            pstmt.setString(4, a.getGenero());
            pstmt.setString(5, a.getDescripcion());
            pstmt.setInt(6, a.getId());

            pstmt.executeUpdate();

            System.out.println("El Alumno con ID: " + a.getId() + " se ha modificado");
            pstmt.close();
            conn.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EstudianteDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EstudianteDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void eliminar(Estudiante a) {
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("DELETE FROM alumnos WHERE (`id` = ?)");
            Connection conn = Conexion.getConexion();
            PreparedStatement pstmt = conn.prepareStatement(sql.toString());

            pstmt.setInt(1, a.getId());
            pstmt.executeUpdate();

            System.out.println("Alumno eliminado " + a.getNombre());
            pstmt.close();
            conn.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EstudianteDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EstudianteDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
