/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.patricio.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author patri
 */
@Named
@RequestScoped
public class Estudiante {

    private int id;
    private String nombre;
    private int edad;
    private String genero;
    private String pais;
    private String descripcion;
    private boolean editable;

    public Estudiante() {

    }

    public Estudiante(int id, String nombre, int edad, String genero, String pais, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.pais = pais;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

//    public String insertar() {
//
//        EstudianteDao estudianteDao = new EstudianteDao();
//       // estudianteDao.insertar(this);
//        return "mysqlReporteAlumnos";
//    }
//    
//    public void borrar(){
//        
//    }

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }
}
