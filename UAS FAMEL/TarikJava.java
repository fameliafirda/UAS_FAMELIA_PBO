/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarik.java;

/**
 *
 * @author LENOVO IP3-14IGL05
 */
public class TarikJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // import java.util.Objects;

public class Tarik extends User {
    public static Integer tarik;

    public static void viewTarik(String user) {
        System.out.println("-----------------------------");
        System.out.println("(Ketikkan 'x' untuk kembali)");
        System.out.print("NOMINAL : ");
        var input = BankJaehyun.inputNumber();
        if (Objects.equals(input, "x")) {
            User.viewMenuPage(user);
        }
        System.out.println("-----------------------------");
        Integer tarik = Integer.parseInt(input);
        if (tarik <= Saldo.Saldo) {
            BankJaehyun.addTrx(user, "Tarik   ", (-tarik));
            User.viewMenuPage(user);
        } else {
            System.out.println("Saldo Anda Tidak Cukup !");
            viewTarik(user);
        }
    }
}

    }
    
}
