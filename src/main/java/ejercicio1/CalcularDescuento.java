package ejercicio1;

public class CalcularDescuento {
    public int devDescuento (int sueldo) throws Exception{
        if(sueldo>0 && sueldo<=2000){
            return sueldo;
        }else if(sueldo>2000 && sueldo<=4000){
            return (int) (sueldo*0.5);
        }else if (sueldo>4000){
            return (int) (sueldo*0.15);
        }else {
            throw new Exception("ERROR, el sueldo ingresado es incorrecto");
        }
    }
}
