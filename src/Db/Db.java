package Db;

import Node.NodeAdmin;
import Node.NodeUser;
import Node.NodeBarang;
import java.util.ArrayList;

public class Db{
    public static ArrayList<NodeUser> userList = new ArrayList<>();
    public static ArrayList<NodeUser> getUsers() {
        return userList;
    }

    public static ArrayList<NodeAdmin> userListAdmin = new ArrayList<>();
    public static ArrayList<NodeAdmin> getUsersAdmin() {
        return userListAdmin;
    }
    public static ArrayList<NodeBarang> barangList = new ArrayList<>();
    public static ArrayList<NodeBarang> getBarang(){
        return barangList;
    }
}
