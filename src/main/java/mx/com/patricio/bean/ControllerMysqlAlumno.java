/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.patricio.bean;

import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import mx.com.patricio.dao.EstudianteDao;

/**
 *
 * @author patri
 */
@Named
@RequestScoped
public class ControllerMysqlAlumno implements Serializable {

    private Estudiante estudiante;
    private Integer numRenglones = 20;

    private static List<Estudiante> estudiantes = new EstudianteDao().consultar();
//    private Estudiante regEstudiante;
//    public List<Estudiante> llenarLista() {
//        estudiantes = new EstudianteDao().consultar();
//        return estudiantes;
//    }

    public String nuevoRegistro(Estudiante e) {

        EstudianteDao estudianteDao = new EstudianteDao();
//        System.out.println(e.getNombre());
        estudianteDao.insertar(e);
        estudiantes.add(e);
        return "mysqlReporteAlumnos?faces-redirect=true";
    }

    public String editar(Estudiante e) {
        e.setEditable(true);
        return null;
    }

    public String actualizar(Estudiante e) {
        new EstudianteDao().modificar(e);
        for (Estudiante estudiante : estudiantes) {
            estudiante.setEditable(false);
        }
        return null;
    }

    public String borrar(Estudiante e) {
        new EstudianteDao().eliminar(e);
        return "mysqlReporteAlumnos?faces-redirect=true";
    }

    public void ordenamientoNombre() {
        Collections.sort(estudiantes, new Comparator<Estudiante>() {
            @Override
            public int compare(Estudiante e1, Estudiante e2) {
                String nombre1 = e1.getNombre();
                String nombre2 = e2.getNombre();
                return nombre1.compareTo(nombre2);
            }
        });
    }
    
    public void ordenamientoEdad(){
      Collections.sort(estudiantes, new Comparator<Estudiante>() {
            @Override
            public int compare(Estudiante e1, Estudiante e2) {
                Integer edad1 = e1.getEdad();
                Integer edad2 = e2.getEdad();
                return edad1.compareTo(edad2);
            }
        });
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Integer getNumRenglones() {
        return numRenglones;
    }

    public void setNumRenglones(Integer numRenglones) {
        this.numRenglones = numRenglones;
    }

}
