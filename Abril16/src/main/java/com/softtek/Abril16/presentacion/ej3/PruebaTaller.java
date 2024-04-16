package com.softtek.Abril16.presentacion.ej3;

import com.softtek.Abril16.presentacion.ej2.Conductor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

    @SpringBootApplication
    public class PruebaTaller implements CommandLineRunner {

        @Autowired

        private SeguroCoche sC1;


        public static void main(String[] args) {

            SpringApplication.run(PruebaTaller.class, args);
        }

        @Override
        public void run(String... args) throws Exception {
            System.out.println(sC1.reparar());
        }
    }

