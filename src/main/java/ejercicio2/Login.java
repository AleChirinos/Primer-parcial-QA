package ejercicio2;

public class Login {
    Util2 util2= new Util2();
    Utils utils= new Utils();
    String message;

    public Login(Utils utils, Util2 util2){
        this.utils = utils;
        this.util2 = util2;
    }

    public Login() {

    }

    public String roleUser(String user, String pwd){
        if (util2.isUserValid(user,pwd)){
            message="PERMISSION ROLE "+ utils.getPermission(user,pwd);
        }else{
            message="Incorrect USER and PWD";
        }

        return message;
    }
}
