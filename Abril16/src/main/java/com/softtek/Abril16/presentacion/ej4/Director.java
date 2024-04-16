package com.softtek.Abril16.presentacion.ej4;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@NoArgsConstructor
@Data

@Component
public class Director implements Empleado {
    @Autowired
    private Informe informe;


    public String getTareas() {
        return "Tareas dirección";
    }

    public String getInforme() {
        return informe.getInforme();
    }

    // public String jefe(Informe informe) {        return null;    }
}