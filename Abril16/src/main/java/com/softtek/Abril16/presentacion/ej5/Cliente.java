package com.softtek.Abril16.presentacion.ej5;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.springframework.stereotype.Component;
@NoArgsConstructor
@Data
@Component
public class Cliente {

    //Atributos
    private String nombre="Pepe";
    private String NIF="85823456F";
}
