package testEjercicio1;

import ejercicio1.CalcularDescuento;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestDescuento {
    @ParameterizedTest
    @CsvSource({
            "0, ",
            "1, 1",
            "2, 2"
    })

    public void calDescuento(int sueldo, int expected){
        CalcularDescuento calcularDescuento = new CalcularDescuento();
        
    }
}
