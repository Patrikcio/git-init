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
public class Pais {

    private String nombre;

    public List<String> listaPaises() {
        List<String> paises = new ArrayList<>();
        paises.add("Mexico");
        paises.add("Canada");
        paises.add("Estados Unidos");
        paises.add("Cuba");
        paises.add("Argentina");
        paises.add("Colombia");
        paises.add("Rusia");
        paises.add("China");
        paises.add("España");
        paises.add("Inglaterra");

        return paises;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
