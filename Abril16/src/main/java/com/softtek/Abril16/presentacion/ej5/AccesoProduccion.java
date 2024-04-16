package com.softtek.Abril16.presentacion.ej5;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
@NoArgsConstructor
@Data
@Component
public class AccesoProduccion implements IDAO {
    @Override
    public String insertar(Cliente cliente1) {
        return null;
    }
}
