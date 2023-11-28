// Db.java
package Db;

import Node.NodeUser;

import java.util.ArrayList;

public class Db {
    public static ArrayList<NodeUser> userList = new ArrayList<>();

    public static ArrayList<NodeUser> getUsers() {
        return userList;
    }


}
