/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daftar.java;

/**
 *
 * @author LENOVO IP3-14IGL05
 */
public class DaftarJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereimport java.util.Locale;
import java.util.Objects;

public class BankJaehyun {

    public static String[] username = {"", "user1", "user2", "user3"}; // Contoh username, disesuaikan dengan kebutuhan
    // ... (tambahkan metode atau properti lainnya jika diperlukan)

    public static void main(String[] args) {
        // Contoh penggunaan
        Admin.viewMenuPage("admin");
    }

    public static String cekSaldo(String user) {
        // Implementasikan logika untuk cek saldo di sini
        return "5000"; // Contoh nilai saldo, disesuaikan dengan kebutuhan
    }

    public static String input() {
        // Implementasikan logika untuk input di sini
        return "1"; // Contoh nilai input, disesuaikan dengan kebutuhan
    }

    public static void salah() {
        System.out.println("Input tidak valid. Silakan coba lagi.");
    }
}

class Daftar {
    // ... (implementasikan kelas Daftar sesuai kebutuhan)
}

class Admin {
    // ... (implementasikan kelas Admin sesuai kebutuhan)
}

class Transaksi {
    public static void viewTransaksi(String user) {
        // Implementasikan logika untuk melihat transaksi di sini
    }
}

class User {
    public static void listMenu() {
        // Implementasikan logika untuk menampilkan menu user di sini
    }

    public static void proses(String pilih) {
        // Implementasikan logika untuk proses user di sini
    }
}

class Login {
    public static void viewLoginPage() {
        // Implementasikan logika untuk menampilkan halaman login di sini
    }
}

    }
    
}
