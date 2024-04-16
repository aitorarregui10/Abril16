package com.softtek.Abril16.presentacion.ej4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PruebaEmpleado implements CommandLineRunner {
    @Autowired
    private Director d1;

    public static void main(String[] args) {

        SpringApplication.run(PruebaEmpleado.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(d1.getTareas()+ " " + d1.getInforme());
    }
}

