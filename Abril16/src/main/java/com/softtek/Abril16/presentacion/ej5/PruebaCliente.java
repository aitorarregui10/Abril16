package com.softtek.Abril16.presentacion.ej5;

import com.softtek.Abril16.presentacion.ej4.PruebaEmpleado;
import com.softtek.Abril16.presentacion.ej4.Secretario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;


public class PruebaCliente implements CommandLineRunner {

    @Autowired
    private ClienteDao c1;


    public static void main(String[] args) {

        SpringApplication.run(PruebaCliente.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
      // System.out.println(c1.insertar());
    }
}
