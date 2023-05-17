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
public class Pollo extends Oviparo implements Animal {

    @Override
    public int ponerHuevos() {
        totalHuevos+=4;
        return 4;
    }

    @Override
    public void nacer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void comer() {
        System.out.println("Comiendo Lombrices");
    }

    @Override
    public void morir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
