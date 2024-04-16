package com.softtek.Abril16.presentacion.ej3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class SeguroCoche implements ITaller {

    //Atributo
    private ITaller taller;
    private String aseguradora;


    //Método

    public String reparar() {
        if (taller != null) {
            return taller.reparar();
        } else {
            return "No se puede reparar, no hay taller asociado.";
        }
    }

    //Constructor
    public SeguroCoche(String matricula, String modelo, ITaller taller, String aseguradora) {
        this.taller = taller;
        this.aseguradora = aseguradora;
    }
    public SeguroCoche() {
    }

    //Setters

    public void setTaller(TallerMecanica taller) {
    }

    public void setTaller2(TallerPintura taller2) {
    }

}
