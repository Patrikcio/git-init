/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.patricio.bean;

import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Named;
import mx.com.patricio.dao.UsuarioDao;

/**
 *
 * @author patri
 */
@Named
@RequestScoped
public class UsuarioLogin implements Serializable {

    private String correo;
    private String password;
    private Boolean deshabilitado = true;
    private String mensaje;

    public UsuarioLogin() {

    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getDeshabilitado() {
        return deshabilitado;
    }

    public void setDeshabilitado(Boolean deshabilitado) {
        this.deshabilitado = deshabilitado;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void habilitaMailPass(ValueChangeEvent e) {
        if (deshabilitado) {
            deshabilitado = false;
        } else {
            deshabilitado = true;
        }

    }

    public void validUsuLogin() {
        UsuarioDao usuario = new UsuarioDao();
        FacesContext contexto = FacesContext.getCurrentInstance();
        boolean existe;
        existe = usuario.login(this);
        if (existe) {
            try {
                // mensaje = "Bienvenido";
                contexto.getExternalContext().redirect("menuPrimefaces.xhtml");
                contexto.responseComplete();
            } catch (IOException ex) {
                Logger.getLogger(UsuarioLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            FacesMessage fm = new FacesMessage("Usuario no identificado");
            contexto.addMessage(null, fm);
            //mensaje = "verifica tus datos";
        }
    }

    @Override
    public String toString() {
        return "UsuarioLogin{" + "correo=" + correo + ", password=" + password + ", deshabilitado=" + deshabilitado + '}';
    }

}
