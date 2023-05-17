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
public class Color {
    private String color;
    private String[] colores = {"red", "blue", "yellow"};  
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String[] getColores() {
        return colores;
    }

    public void setColores(String[] colores) {
        this.colores = colores;
    }
    
    
    
}
