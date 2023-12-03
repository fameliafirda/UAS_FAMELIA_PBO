/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package user.java;

/**
 *
 * @author LENOVO IP3-14IGL05
 */
public class UserJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // import java.util.Objects;

public class User extends Admin {

    public static void listMenu() {
        System.out.println("1. Setor");
        System.out.println("2. Tarik");
        System.out.println("3. Transfer");
        System.out.println("4. History Transaksi");
        System.out.println("5. Keluar");
    }

    public static void proses(String pilih) {
        if (Objects.equals(pilih, "1")) {
            Setor.viewSetor(user);
        } else if (Objects.equals(pilih, "2")) {
            Tarik.viewTarik(user);
        } else if (Objects.equals(pilih, "3")) {
            Transfer.viewTransfer(user);
        } else if (Objects.equals(pilih, "4")) {
            Transaksi.viewTransaksi(user);
        } else if (Objects.equals(pilih, "5")) {
            Login.viewLoginPage();
        } else {
            BankJaehyun.salah();
        }
        System.out.print("Masukkan Pilihanmu : ");
        int name = Integer.parseInt(BankJaehyun.input());
        Transaksi.viewTransaksi(BankJaehyun.username[name]);
    }
}

    }
    
}
