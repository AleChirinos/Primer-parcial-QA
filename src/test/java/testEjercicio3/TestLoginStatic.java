package testEjercicio3;

import ejercicio2.Login;
import ejercicio2.Util2;
import ejercicio3.LoginStatic;
import ejercicio3.Util2Static;
import ejercicio3.UtilStatic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class TestLoginStatic {
    @BeforeAll
    public static void before(){
        MockedStatic<Util2Static> objMockPermiso= Mockito.mockStatic(Util2Static.class);
        MockedStatic<UtilStatic> objMockUser= Mockito.mockStatic(UtilStatic.class);
        objMockPermiso.when(()-> Util2Static.isUserValid("test1","123")).thenReturn("CRUD");
        objMockPermiso.when(()-> Util2Static.isUserValid("test2","123")).thenReturn("CRUD");
        objMockPermiso.when(()-> Util2Static.isUserValid("test3","123")).thenReturn("CUD");
        objMockPermiso.when(()-> Util2Static.isUserValid("test4","123")).thenReturn("CD");
        objMockPermiso.when(()-> Util2Static.isUserValid("test5","123")).thenReturn("R");

        objMockUser.when(()-> UtilStatic.getPermission("test1","123")).thenReturn(false);
        objMockUser.when(()-> UtilStatic.getPermission("test2","123")).thenReturn(true);
        objMockUser.when(()-> UtilStatic.getPermission("test3","123")).thenReturn(true);
        objMockUser.when(()-> UtilStatic.getPermission("test4","123")).thenReturn(true);
        objMockUser.when(()-> UtilStatic.getPermission("test5","123")).thenReturn(true);
    }

    @Test
    public void inicioSesionFallido(){
        LoginStatic login=new LoginStatic();
        String expected="El usuario no existe";
        String actual=login.roleUser("test1", "123");
        Assertions.assertTrue(actual.contains(expected),"Error");
    }

    @Test
    public void inicioSesionCRUD(){
        LoginStatic login=new LoginStatic();
        String expected="El usuario no existe";
        String actual=login.roleUser("test2", "123");
        Assertions.assertTrue(actual.contains(expected),"Error");
    }
    @Test
    public void inicioSesionCUD(){
        LoginStatic login=new LoginStatic();
        String expected="El usuario no existe";
        String actual=login.roleUser("test3", "123");
        Assertions.assertTrue(actual.contains(expected),"Error");
    }
    @Test
    public void inicioSesionCD(){
        LoginStatic login=new LoginStatic();
        String expected="El usuario no existe";
        String actual=login.roleUser("test4", "123");
        Assertions.assertTrue(actual.contains(expected),"Error");
    }
    @Test
    public void inicioSesionR(){
        LoginStatic login=new LoginStatic();
        String expected="El usuario no existe";
        String actual=login.roleUser("test5", "123");
        Assertions.assertTrue(actual.contains(expected),"Error");
    }
}
