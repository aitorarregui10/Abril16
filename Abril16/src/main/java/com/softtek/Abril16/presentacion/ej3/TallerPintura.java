package com.softtek.Abril16.presentacion.ej3;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
@NoArgsConstructor
public class TallerPintura implements ITaller{
    
    public String reparar() {
        return "Reparación de piezas";
    }
}
