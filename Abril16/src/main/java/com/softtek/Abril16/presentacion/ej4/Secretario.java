package com.softtek.Abril16.presentacion.ej4;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@Data
public class Secretario implements Empleado {
    private Informe informe;
    private String empresa;
    private String email;


    @Override
    public String getTareas() {
        return "funciona mamón";
    }

    @Override
    public String getInforme() {
        return "funciona mamón";
    }
    //Setter
    public void setInforme(Informe informe) {
        this.informe = informe;
    }
}
