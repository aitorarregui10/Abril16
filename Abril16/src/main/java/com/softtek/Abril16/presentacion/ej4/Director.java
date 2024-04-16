package com.softtek.Abril16.presentacion.ej4;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@NoArgsConstructor
@Data
@Component
@Qualifier("IT2")
public class Director implements Empleado {
    private Informe informe;


    @Override
    public String getTareas() {
        return "Tareas dirección";
    }

    @Override
    public String getInforme() {
        return null;
    }

    public String jefe(Informe informe) {
        return null;
    }
}