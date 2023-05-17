/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.patricio.bean;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author patri
 */
@FacesValidator("nombreValidador")
public class Validador implements Validator{

    @Override
    public void validate(FacesContext fc, UIComponent uic, Object t) throws ValidatorException {
        
        String nombre = (String) t;
        
        if(nombre.equals("Pedro")){
            FacesMessage mensaje = new FacesMessage(FacesMessage.SEVERITY_ERROR, "El nombre es incorrecto", "intenta con otro nombre");
            throw new ValidatorException(mensaje);
        }
        
    }
    
}
