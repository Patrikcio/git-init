/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.patricio.dao;

import java.util.List;

/**
 *
 * @author patri
 */
public interface Crud <T> {

    List<T> consultar();
    void insertar(T a);
    void modificar(T a);
    void eliminar(T a);
}

