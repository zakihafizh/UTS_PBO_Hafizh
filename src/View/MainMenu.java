package View;

import java.util.Scanner;
import Controller.ControllerBarang;

public class MainMenu {

    public void pilihanMenu(){
        int menuUser;
        boolean exitUser = false;
        Scanner scan = new Scanner(System.in);
        displayMenu();
        menuUser = scan.nextInt();
        while(!exitUser){
            switch (menuUser) {
                case 1 -> displayInputBarang(false);
                case 2 -> System.out.println("Kasir");
                case 3 -> {
                    System.out.println(" - Exit -");
                    (new FormLogin()).verifikasiLogin();
                }
                default -> {
                    System.out.println("Pilihan Anda Salah");
                    pilihanMenu();
                }
            }
        }
    }
    public void pilihanMenuAdmin(){
        int menuadmin;
        boolean exitAdmin = false;
        Scanner scan = new Scanner(System.in);
        displayMenuAdmin();
        menuadmin = scan.nextInt();
        while(!exitAdmin){
            switch (menuadmin) {
                case 1 -> displayInputBarang(true);
                case 2 -> System.out.println("Edit Stok");
                case 3 -> System.out.println("Kasir");
                case 4 -> System.out.println("Setting Admin");
                case 5 -> {
                    System.out.println(" - Exit -");
                    (new FormLogin()).verifikasiLogin();
                }
                default -> {
                    System.out.println("Pilihan Anda Salah");
                    pilihanMenu();
                }
            }
        }
    }
    public void displayMenuAdmin(){
        System.out.println("============================================");
        System.out.println("         PROGRAM PENGELOLAAN BARANG         ");
        System.out.println("--------------------------------------------");
        System.out.println("                   ADMIN                    ");
        System.out.println("============================================");
        System.out.println("Pilihan menu : \n1. Input Barang \n2. Edit Stok \n3. Kasir \n4. Setting Admin \n5. exit");
        System.out.print("Masukkan pilihan : ");
    }
    public void displayMenu(){
        System.out.println("============================================");
        System.out.println("         PROGRAM PENGELOLAAN BARANG         ");
        System.out.println("--------------------------------------------");
        System.out.println("                    USER                    ");
        System.out.println("============================================");
        System.out.println("Pilihan menu : \n1. Input Barang \n2. Kasir \n3. Exit");
        System.out.print("Masukkan pilihan : ");
    }
    public void displayInputBarang(boolean isAdmin){
        Scanner scan = new Scanner(System.in);
        System.out.println("=====Input Barang=====");
        String NamaBarang;
        double Harga;
        int stok;
        System.out.print("Nama Barang  : ");
        NamaBarang = scan.nextLine();
        while (true) {
            System.out.print("Harga Barang : ");
            try {
                Harga = Double.parseDouble(scan.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        while (true) {
            System.out.print("Stok Barang  : ");
            try {
                stok = Integer.parseInt(scan.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
        ControllerBarang.newBarang(NamaBarang, Harga, stok);
        System.out.println("1. input lagi 2. tidak");
        System.out.print("Masukkan pilihan anda :");
        int pilih = scan.nextInt(); 
        if (pilih == 1 ){
            displayInputBarang(isAdmin);
        }
        else if (pilih == 2 && isAdmin == true){
            pilihanMenuAdmin();
        }
        else if (pilih == 2 && isAdmin == false){
            pilihanMenu();
        }
    }
    public void displayUpdate(){
        Scanner edit = new Scanner(System.in);
        System.out.println("\n======UPDATE BARANG======");
        System.out.println("Nama Barang : ");
    }
}
