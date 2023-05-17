/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.patricio.bean;

/**
 *
 * @author patri
 */
public class Libro {
    private int id;
    private String titulo;
    private String autor;
    private String imagen;
    private double precio;

    public Libro() {
    }

    public Libro(int id, String titulo, String autor, String imagen, double precio) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.imagen = imagen;
        this.precio = precio;
    }
    
  
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
    
  
    
}
