package com.softtek.Abril16.presentacion.ej2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
    public class PruebaCoche implements CommandLineRunner {

        @Autowired

        private Conductor c1;

        public static void main(String[] args) {

            SpringApplication.run(PruebaCoche.class, args);
        }

        @Override
        public void run(String... args) throws Exception {
            System.out.println(c1.conducir());
        }
    }

