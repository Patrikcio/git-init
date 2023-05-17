/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.patricio.zoo.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import mx.com.patricio.zoo.animales.Animal;
import mx.com.patricio.zoo.animales.Oviparo;
import mx.com.patricio.zoo.animales.Pollo;
import mx.com.patricio.zoo.animales.Tortuga;

/**
 *
 * @author patri
 */
public class Util {

//    public void darDeComer(Tortuga t) {
//
//        t.comer();
//
//    }
//
//    public void darDeComer(Pollo p) {
//        p.comer();
//    }
    public static void darDeComer(Animal a) {

        a.comer();
    }

    public static void darDeComer(Animal[] a2) {
        for (Animal a : a2) {
            a.comer();
        }
    }

//    public void darDeComer(ArrayList<Animal> a3) {
//
//        for (Animal a : a3) {
//            a.comer();
//        }
//
//    }
//
//    public void darDeComer(Vector<Animal> a4) {
//        for (Animal a : a4) {
//            a.comer();
//        }
//    }
//
//    public void darDeComer(LinkedList<Animal> a5) {
//        for (Animal a : a5){
//        a.comer();
//        }
//
//    }
    public static void darDeComer(List<Animal> lista){
        for (Animal a: lista){
        a.comer();
        }
    }
}
