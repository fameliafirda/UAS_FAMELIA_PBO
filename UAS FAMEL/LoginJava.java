/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package login.java;

/**
 *
 * @author LENOVO IP3-14IGL05
 */
public class LoginJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // import java.util.Objects;

public class Login extends Daftar {

    public static void viewLoginPage() {
        System.out.println("-----------------------------");
        System.out.println("LOGIN PAGE");
        System.out.println("-----------------------------");
        System.out.println("(Ketikkan 'x' untuk kembali)");
        System.out.print("Username : ");
        user = BankJaehyun.input();
        cancel(user);
        cekUser(user);
        System.out.print("Password : ");
        pass = BankJaehyun.input();
        cancel(pass);
        cekPass(pass);
        login(user);
    }

    public static void cekUser(String user) {
        while (!BankJaehyun.validasiUser(user)) {
            System.out.println("Username belum terdaftar !");
            System.out.print("Username : ");
            user = BankJaehyun.input();
            cancel(user);
        }
    }

    public static void login(String user) {
        if (Objects.equals(user, "admin")) {
            Admin.viewMenuPage(user);
        } else {
            User.viewMenuPage(user);
        }
    }

    public static void cekPass(String pass) {
        while (!BankJaehyun.validasiPass(pass)) {
            System.out.println("Password Salah !");
            System.out.print("Password : ");
            pass = BankJaehyun.input();
        }
    }
}

    }
    
}
