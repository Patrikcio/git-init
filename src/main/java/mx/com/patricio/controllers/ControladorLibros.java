/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.patricio.controllers;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import mx.com.patricio.bean.Libro;

/**
 *
 * @author patri
 */
@Named
@RequestScoped
public class ControladorLibros {
    
    private List<Libro> libros;

    public ControladorLibros() {
    libros = new ArrayList<>();
    libros.add(new Libro(1,"La Biblia","Varios","Biblia.jpg",300));
    libros.add(new Libro(2,"El Quijote","Miguel de Cervantes","Quijote.jpg",400));
    libros.add(new Libro(3,"El Principito","Antoine de Saint","Principito.jpg",200));
    libros.add(new Libro(4,"El Mundo de Sofia","Jostein Gaarder","Sofia.jpg",250));
    libros.add(new Libro(5,"Dracula","Bram Stoker","Dacula.jpg",300));
    libros.add(new Libro(6,"EL CAMINO DE LA VIDA","Lev Tolstói","Vida.jpg",70));
    }

    
    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
    
    
}
