/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.patricio.zoo.animales;

/**
 *
 * @author patri
 */
public class Tortuga extends Oviparo implements Animal{

    private int id;
    private int edad;
    private int totalHuevos;
    public int ponerHuevos() {
        totalHuevos += 5;
        return 5;
    }

    @Override
    public void nacer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void comer() {
        System.out.println("Comiendo Lechuga");
    }

    @Override
    public void morir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotalHuevos() {
        return totalHuevos;
    }

    public void setTotalHuevos(int totalHuevos) {
        this.totalHuevos = totalHuevos;
    }

}
