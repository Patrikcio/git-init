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
public class HolaMundo {
   private String mensaje = "HolaMundoDesdeTlaxcala";
   
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
       this.mensaje = mensaje;
    }
}
