package ejercicio3;

public class LoginStatic {
    String message;
    public String roleUser(String user, String pwd){
        if (Util2Static.isUserValid(user,pwd)){
            message=Util2Static.isUserValid(user,pwd)+" - " +java.time.LocalDateTime.now();;
        }else{
            message="El usuario no existe";
        }

        return message;
    }
}
