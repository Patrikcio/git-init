/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.patricio.dao;

import java.util.List;
import mx.com.patricio.zoo.animales.Pollo;

/**
 *
 * @author patri
 */
public class PolloDao implements Crud<Pollo>{

    @Override
    public List<Pollo> consultar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertar(Pollo a) {
        a.getNombre();
    }

    @Override
    public void modificar(Pollo a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Pollo a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
