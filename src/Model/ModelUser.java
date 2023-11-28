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

//    int index = -1;
//    public void insertUser(String Username, String Password){
//        NodeUser objUser = new NodeUser(Username, Password);
//        Db.getUsers().add(objUser);
//        this.index++;
//    }
//
//    public static void viewUsers(){
//        for (NodeUser users : Db.getUsers()){
//            users.viewUser();
//            System.out.println("--------------------------");
//        }
//    }
//}
