/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package admin.java;

/**
 *
 * @author LENOVO IP3-14IGL05
 */
public class AdminJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereimport java.util.Locale;
import java.util.Objects;

public class Admin extends Daftar {
    public static void viewMenuPage(String user) {
        System.out.println("-----------------------------");
        System.out.println("SELAMAT DATANG " + user.toUpperCase(Locale.ROOT));
        if (!user.equalsIgnoreCase("admin")) {
            System.out.println("Saldo Anda : " + BankJaehyun.cekSaldo(user));
        }
        System.out.println("-----------------------------");
        if (user.equalsIgnoreCase("admin")) {
            Admin.listMenu();
        } else {
            User.listMenu();
        }
        System.out.print("Masukkan Pilihanmu : ");
        String pilih = BankJaehyun.input();
        if (user.equalsIgnoreCase("admin")) {
            Admin.proses(pilih);
        } else {
            User.proses(pilih);
        }
    }

    public static void listMenu() {
        System.out.println("1. Lihat Seluruh Transaksi");
        System.out.println("2. Lihat Transaksi Per User");
        System.out.println("3. Keluar");
    }

    public static void proses(String pilih) {
        if (Objects.equals(pilih, "1")) {
            Transaksi.viewTransaksi(null);
        } else if (Objects.equals(pilih, "2")) {
            for (int i = 1; i < BankJaehyun.username.length; i++) {
                System.out.println(i + " . " + BankJaehyun.username[i]);
            }
            System.out.print("Masukkan Pilihanmu : ");
            int name = Integer.parseInt(BankJaehyun.input());
            Transaksi.viewTransaksi(BankJaehyun.username[name]);
        } else if (Objects.equals(pilih, "3")) {
            Login.viewLoginPage();
        } else {
            BankJaehyun.salah();
            viewMenuPage(pilih);
        }
    }
}

    }
    
}
