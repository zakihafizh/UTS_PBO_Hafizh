package Controller;

import Model.ModelUser;

public class ControllerUser {
    static ModelUser modelUser = new ModelUser();
    public static void newUser(String Username, String Password) {
        modelUser.addUser(Username, Password);
    }

    public void tampilkanDataUser (){
        modelUser.viewUser();
    }
}
