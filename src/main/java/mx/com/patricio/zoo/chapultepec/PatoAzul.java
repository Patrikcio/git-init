/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.patricio.zoo.chapultepec;

import mx.com.patricio.zoo.animales.Oviparo;

/**
 *
 * @author patri
 */
public class PatoAzul extends Oviparo{

    @Override
    public int ponerHuevos() {       
        totalHuevos += 8;
        return 8;   
  }
}    
