package com.softtek.Abril16.presentacion.ej4;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@NoArgsConstructor
@Component

public class InformeTrimestre3 implements Informe {
    @Override
    public String getInforme() {
        return null;
    }
}
