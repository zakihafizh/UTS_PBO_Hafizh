package Model;

import Db.Db;
import Node.NodeUser;

public class ModelUser {

    public void addUser(String username, String password) {
        NodeUser user = new NodeUser(username, password);
        Db.userList.add(user);
    }

    public void viewUser(){
        for(NodeUser user : Db.getUsers()){
           user.viewUser();
            System.out.println("-------------------");
        }
    }
}
