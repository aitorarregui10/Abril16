package com.softtek.Abril16.presentacion.ej5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class ClienteDao implements IDAO {

    @Autowired
    private IDAO conexion;

    @Override
    public Cliente insertar(Cliente cliente) {
        return cliente;
    }
}
