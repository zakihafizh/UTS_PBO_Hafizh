package Controller;

import Model.ModelAdmin;

public class ControllerAdmin {
    static ModelAdmin modelAdmin = new ModelAdmin();
    public static void newAdmin(String UsernameAdmin, String PasswordAdmin) {
        modelAdmin.addAdmin(UsernameAdmin, PasswordAdmin);
    }

    public void tampilkanDataUser (){
        modelAdmin.viewAdmin();
    }
}
