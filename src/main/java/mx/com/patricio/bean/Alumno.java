/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.patricio.bean;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author patri
 */
@Named
@RequestScoped
public class Alumno {

    private String nombre;
    private String pais;
    private int edad;
    private String genero;
    private String[] tecnologia;
    private List<String> listaCursos;
    private List<String> cursosSeleccionados;

    public Alumno() {
        listaCursos = new ArrayList<>();
        listaCursos.add("Html");
        listaCursos.add("Java Desde Cero");
        listaCursos.add("css");
        listaCursos.add("JQuery con AJAX");
        listaCursos.add("Linux Fundamentos");
        listaCursos.add("Java Persistencia con Hibernet");
    }
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
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

    public String[] getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String[] tecnologia) {
        this.tecnologia = tecnologia;
    }

    public List<String> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(List<String> listaCursos) {
        this.listaCursos = listaCursos;
    }

    public List<String> getCursosSeleccionados() {
        return cursosSeleccionados;
    }

    public void setCursosSeleccionados(List<String> cursosSeleccionados) {
        this.cursosSeleccionados = cursosSeleccionados;
    }
    
    

}
