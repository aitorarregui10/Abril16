package com.softtek.Abril16.presentacion.ej3;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor

public class TallerMecanica implements ITaller{
    @Primary
    public String reparar() {
        return "Reparación de piezas";
    }
}
