/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.patricio.zoo;

import mx.com.patricio.zoo.animales.Oviparo;
import mx.com.patricio.zoo.animales.Pollo;
import mx.com.patricio.zoo.animales.Tortuga;
import mx.com.patricio.zoo.animales.Animal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Vector;
import mx.com.patricio.bean.Alumno;
import mx.com.patricio.bean.Estudiante;
import mx.com.patricio.dao.AlumnoDao;
import mx.com.patricio.dao.EstudianteDao;
import mx.com.patricio.dao.TortugaDao;
import mx.com.patricio.zoo.util.Util;
import org.graalvm.compiler.core.common.type.ArithmeticOpTable;

/**
 *
 * @author patri
 */
public class AppZoo {

    public static void main(String[] args) {
        System.out.println("Bienvenido Al Zoologico");
//        Oviparo oviparo = new Oviparo();
//        oviparo.nombre = "pato";

        Tortuga t = new Tortuga();
        t.setEdad(13);
        t.setNombre("Toto");
        //  t.nombre = "Tito";
        //  Util u = new Util();
        Util.darDeComer(t);

        Pollo pio = new Pollo();
//        u.darDeComer(pio);
        Pollo p2 = new Pollo();

        Tortuga t2 = new Tortuga();
        List<Animal> listAnimales = new ArrayList();
        listAnimales.add(t);
        listAnimales.add(pio);
        listAnimales.add(p2);
        listAnimales.add(t2);
        Util.darDeComer(listAnimales);

        System.out.println(t.ponerHuevos());
        System.out.println(pio.ponerHuevos());
        //List lista = new ArrayList();
        Oviparo o = new Pollo();
        String s = new String();
        int i;
        o = t;
        //      Oviparo o1 = new Oviparo();
        //      t = pio;
        o = pio;
        Animal animal = new Tortuga();
        Animal animal2 = new Pollo();
        List lista = new LinkedList();
        ArrayList a = new ArrayList();

        Math.random();
        // Oviparo.totalHuevos=3;
        System.out.print(Oviparo.getNumHuevos());

        TortugaDao tDao = new TortugaDao();
        //t.setId(3);
        //   List<Tortuga> listaTortugas = tDao.consultar();
        for (Tortuga tortuga : tDao.consultar()) {
            System.out.print(tortuga.getId());
            System.out.print(tortuga.getNombre());
            System.out.print(tortuga.getEdad());
            System.out.println(tortuga.getTotalHuevos());
        }

        EstudianteDao estudianteDao = new EstudianteDao();
        for (Estudiante estudiante : estudianteDao.consultar()) {
            System.out.println(estudiante.getId() + " " + estudiante.getNombre() + " " + estudiante.getEdad() + " " + estudiante.getGenero() + " " + estudiante.getPais() + " " + estudiante.getDescripcion());
        }

//        Alumno est = new Alumno();
//        est.setNombre("Julio");
//        AlumnoDao ADao = new AlumnoDao();
//        ADao.eliminar(est);
    }

}
