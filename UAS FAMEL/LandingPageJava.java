/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package landingpage.java;

/**
 *
 * @author LENOVO IP3-14IGL05
 */
public class LandingPageJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereimport java.util.Objects;

public class LandingPage {
    public static void viewLandingPage() {
        System.out.println("-----------------------------");
        System.out.println("SELAMAT DATANG DI BANK JAEHYUN APP");
        System.out.println("-----------------------------");
        System.out.println("1. Login");
        System.out.println("2. Daftar");
        System.out.print("Masukkan Pilihanmu : ");
        String pilih = BankJaehyun.input();
        landingPage(pilih);
    }

    public static void landingPage(String pilih) {
        if (Objects.equals(pilih, "1")) {
            Login.viewLoginPage();
        } else if (Objects.equals(pilih, "2")) {
            Daftar.viewDaftarPage();
        } else {
            BankJaehyun.salah();
            LandingPage.viewLandingPage();
        }
    }
}

    }
    
}
