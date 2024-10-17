package learn.java.standar.classes;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama : ");
        String name = scanner.nextLine();

        System.out.print("Umur : ");
        Integer umur = scanner.nextInt();

        System.out.print("Alamat : ");
        String alamat = scanner.nextLine();

        System.out.println("Hello " + name + " Umur anda adalah "+ umur);
        System.out.println("Alamat " + alamat);
    }
}
