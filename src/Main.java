import View.FormLogin;
import Controller.*;
public class Main {
    public static void main(String[] args) {
        ControllerUser.newUser("user","user");
        ControllerAdmin.newAdmin("admin","admin");
        FormLogin Masuk = new FormLogin();
        Masuk.verifikasiLogin();
    }
}
