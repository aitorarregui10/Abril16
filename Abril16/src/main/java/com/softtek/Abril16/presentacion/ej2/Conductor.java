package com.softtek.Abril16.presentacion.ej2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Conductor{
    @Autowired
    //Atributo
    private IVehiculo vehiculo;

    //Métodos
    public String conducir() {

        if (vehiculo != null) {
            return vehiculo.moverse();
        } else {
            return "Esto se llama andar";
        }
    }
}