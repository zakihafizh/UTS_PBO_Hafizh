package Model;

import Db.Db;
import Node.NodeAdmin;

public class ModelAdmin {

    public void addAdmin(String usernameAdmin, String passwordAdmin) {
        NodeAdmin userAdmin = new NodeAdmin(usernameAdmin, passwordAdmin);
        Db.userListAdmin.add(userAdmin);
    }

    public void viewAdmin(){
        for(NodeAdmin userAdmin : Db.getUsersAdmin()){
            userAdmin.viewUserAdmin();
            System.out.println("-------------------");
        }
    }
}
