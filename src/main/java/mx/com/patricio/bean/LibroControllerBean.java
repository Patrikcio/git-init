/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.patricio.bean;

import javax.enterprise.context.RequestScoped;
import org.primefaces.PrimeFaces;
import javax.inject.Named;

/**
 *
 * @author patri
 */
@Named
@RequestScoped
public class LibroControllerBean {
    private Libro libro = new Libro();
    
    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    
    public void guardarLibro(){
    
    PrimeFaces.current().ajax().addCallbackParam("guardado", true);
    PrimeFaces.current().ajax().addCallbackParam("libro", libro);
   
    }
    
}
