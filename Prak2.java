package prak2;

import java.util.ArrayList;
import java.util.Scanner;

public class Prak2 {

    public static void main(String[] args) {
        ArrayList<String> kopi = new ArrayList<String>();
        ArrayList<String> Topping = new ArrayList<String>();
        ArrayList<String> Asal = new ArrayList<String>();

        Mesinkopi robusta = new Mesinkopi();
        robusta.setJenisKopi("Robusta");
        robusta.setAsal("Eropa");
        kopi.add(robusta.getJenisKopi());
        Asal.add(robusta.getAsal());

        Mesinkopi arabica = new Mesinkopi();
        arabica.setJenisKopi("Arabica");
        arabica.setAsal("Timur Tengah");
        kopi.add(arabica.getJenisKopi());
        Asal.add(arabica.getAsal());

        Mesinkopi flores = new Mesinkopi();
        flores.setJenisKopi("Flores");
        flores.setAsal("Asia");
        kopi.add(flores.getJenisKopi());
        Asal.add(flores.getAsal());

        Topping yun = new Topping();
        yun.setTopping("Cream");
        Topping.add(yun.getTopping());
        yun.setTopping("Hazelnut");
        Topping.add(yun.getTopping());

        System.out.println("\t MENU KOPI");
        for (int i = 0; i < kopi.size(); i++) {
            int j = i + 1;
            System.out.println("\t " + j + ": " + kopi.get(i));
        }

        System.out.println("\t MENU TOPPING");
        for (int i = 0; i < Topping.size(); i++) {
            int j = i + 1;
            System.out.println("\t " + j + ": " + Topping.get(i));

        }

        try {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("");
            System.out.print("Masukkan Pilihan Kopi Anda : ");
            int pilihkopi = keyboard.nextInt() - 1;
            System.out.print("Masukkan Pilihan Topping Anda : ");
            int pilihtopping = keyboard.nextInt() - 1;

            System.out.println("");
            System.out.println("Pesanan anda adalah kopi " + kopi.get(pilihkopi) + " yang berasal dari " + Asal.get(pilihkopi) + " dengan topping " + Topping.get(pilihtopping));
        } catch (Exception e) {
            System.out.println("Inputan Anda Salah ");
            System.out.println(e + "\n");
        }
    }

}
