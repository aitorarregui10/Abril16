package com.softtek.Abril16.presentacion.ej2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Coche implements IVehiculo {
    @Value("5")
    private int gasolina;


    @Override
    public String moverse() {
        if (gasolina > 0) {
            gasolina--;
            return "El coche se mueve";
        } else {

            return "Vete a la gasolinera a repostar";
        }
    }
}