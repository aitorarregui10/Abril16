package com.softtek.Abril16.presentacion.ej4;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@NoArgsConstructor
@Component
public class Jefe implements Empleado{
    private Informe informe;
    @Override
    public String getTareas() {
        return null;
    }

    @Override
    public String getInforme() {
        return null;
    }
    public String jefe(Informe informe) {
        return null;
    }
}
