package com.softtek.Abril16.presentacion.ej5;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Data
@Component
public class AccesoDesarrollo implements IDAO {
    @Primary
    @Override
    public String insertar(Cliente cliente1) {
        return null;
    }
}

