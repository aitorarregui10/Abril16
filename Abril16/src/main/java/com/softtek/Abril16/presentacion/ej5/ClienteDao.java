package com.softtek.Abril16.presentacion.ej5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClienteDao implements IDAO {
    @Autowired
    private IDAO conexion;

    @Override
    public String insertar(Cliente cliente1) {
        return null;
    }
}
