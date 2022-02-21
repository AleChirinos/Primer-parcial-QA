package pruebaTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import prueba.Prueba1;
import prueba.Utils1;

public class Test1 {
    @BeforeAll
    public static void before(){
        MockedStatic<Utils1> mock = Mockito.mockStatic(Utils1.class);
        mock.when(()->Utils1.convert("bolivianos", "dolares")).thenReturn(7);
        mock.when(()->Utils1.convert("bolivianos", "reales")).thenReturn(2);
    }

    @Test
    public void verify(){
        Prueba1 convertirMonedaStatic = new Prueba1();
        Assertions.assertEquals("Se convirtio a: 70",
                convertirMonedaStatic.cambio(10, "bolivianos", "dolares"), "Error");
    }

    @Test
    public void verifyWrong(){
        Prueba1 convertirMonedaStatic = new Prueba1();
        Assertions.assertEquals("La cantidad ingresada es incorrecta",
                convertirMonedaStatic.cambio(-10, "bolivianos", "reales"), "Error");
    }
}
