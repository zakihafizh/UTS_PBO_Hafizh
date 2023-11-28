package View;

import Controller.ControllerUser;
import Db.Db;
import Node.NodeUser;
import java.util.Scanner;

public class FormLogin {
    public boolean verifUser(String username, String password){
        for (NodeUser user : Db.userList){
            if (user.getUsername().equals(username) && user.CheckPassword(password)){

                return true;
            }
        }
        return false;
    }
    public void verifikasiLogin() {
        MainMenu mainMenu = new MainMenu();//inisialisasi objek mainMenu.menu
        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        String username;
        String password;
        int pil;
        displayLogin();
        pil = scan.nextInt();
        scan.nextLine();
        while (!exit) {
            switch (pil) {
                case 1 -> {
                    System.out.println("=====Login=====");
                    System.out.print("Masukkan Username : ");
                    username = scan.nextLine();
                    System.out.print("Masukkan password : ");
                    password = scan.nextLine();
                    if (verifUser(username, password)) {
                        mainMenu.pilihanMenu();
                    } else
                        System.out.println("Username / Password tidak ditemukan");
                    verifikasiLogin();
                }
                case 2 -> {
                    System.out.println("=====Daftar=====");
                    String Username, Password;
                    System.out.print("Masukkan Username : ");
                    Username = scan.nextLine();
                    System.out.print("Masukkan Password : ");
                    Password = scan.nextLine();
                    ControllerUser.newUser(Username, Password);
                    verifikasiLogin();
                }
                case 3 -> {
                    System.out.println(" - Exit -");
                    exit = true;
                }
                default -> {
                    System.out.println("Pilihan anda salah");
                    verifikasiLogin();
                    scan.nextLine();
                }
            }
        }
    }

    public void displayLogin(){
        System.out.println("FORM LOGIN\n-------------");
        System.out.println("1. Login");
        System.out.println("2. Daftar");
        System.out.println("Masukkan Pilihan anda : ");
    }
}
