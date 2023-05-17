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
public class TablaAlumnos {
  
    private List<Estudiante> lEstudiantes = new ArrayList<>();

    public TablaAlumnos() {
       lEstudiantes.add(new Estudiante(1,"Patricio", 26, "M", "Mexico", "Test"));
       lEstudiantes.add(new Estudiante(2,"Julio", 26, "M", "Mexico", "Test1"));
       lEstudiantes.add(new Estudiante(3,"juan", 27, "M", "Toluca", "Test2"));
       
    }

    public List<Estudiante> getlEstudiantes() {
        return lEstudiantes;
    }

    public void setlEstudiantes(List<Estudiante> lEstudiantes) {
        this.lEstudiantes = lEstudiantes;
    }

}

