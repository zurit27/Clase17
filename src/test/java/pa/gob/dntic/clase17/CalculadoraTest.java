package pa.gob.dntic.clase17;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    @Test
    void suma_de_dos_numeros(){
        assertEquals(5, new Calculadora().sumar(3 ,2));
    }
}
