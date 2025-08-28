import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import ar.edu.unahur.obj2.tdd.CajaFuerte;

public class testCajaFuerte {

    CajaFuerte cajaFuerte = new CajaFuerte(false);

    @Test
    public void dadaUnaCajaEstaAbierta(){
        assertTrue(cajaFuerte.isEstaAbierta());
    }

    @Test
    public void dadaUnaCajaAbierla()throws Exception{
        cajaFuerte.abrirCaja(1234);
        assertTrue(cajaFuerte.isEstaAbierta());
    }

       @Test
    public void intentarAbrirLaCaja(){
        cajaFuerte.cerrar();
        assertFalse(cajaFuerte.isEstaAbierta());
    }
}
