package com.softtek.Abril16.presentacion.ej4;

import com.softtek.Abril16.presentacion.ej3.PruebaTaller;
import com.softtek.Abril16.presentacion.ej3.SeguroCoche;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

public class PruebaEmpleado implements CommandLineRunner {

    @Autowired
    private Director d1;

    public static void main(String[] args) {

        SpringApplication.run(PruebaEmpleado.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(d1.getTareas());
    }
}

