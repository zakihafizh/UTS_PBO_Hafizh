package View;

import java.util.Scanner;

public class MainMenu {
    public void pilihanMenu(){
        int pilihan;
        boolean exit = false;
        Scanner scan = new Scanner(System.in);
        displayMenu();
        pilihan = scan.nextInt();
        while(!exit){
            switch (pilihan) {
                case 1 -> System.out.println("Menu Utama");
                case 2 -> System.out.println("Setting");
                case 3 -> {
                    System.out.println(" - Exit -");
                    exit = true;
                }
                default -> {
                    System.out.println("Pilihan Anda Salah");
                    pilihanMenu();
                }
            }
        }
    }

    public void displayMenu(){
        System.out.println("============================================");
        System.out.println("         PROGRAM PENGELOLAAN BARANG         ");
        System.out.println("--------------------------------------------");
        System.out.println("============================================");
        System.out.println("Pilihan menu : \n1. MasukMenu \n2. Setting \n3. Exit");
        System.out.print("Masukkan pilihan : ");
    }
}
