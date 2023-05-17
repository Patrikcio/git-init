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
public abstract class Oviparo {

    protected String nombre;
    protected static int totalHuevos;

    public abstract int ponerHuevos();
    public static int getNumHuevos(){
        return totalHuevos;
     }
    }

