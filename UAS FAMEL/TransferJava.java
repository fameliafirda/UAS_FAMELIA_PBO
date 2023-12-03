/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package transfer.java;

/**
 *
 * @author LENOVO IP3-14IGL05
 */
public class TransferJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // import java.util.Objects;

public class Transfer extends User {
    public static Integer transfer;

    public static void viewTransfer(String user) {
        System.out.println("-----------------------------");
        System.out.println("(Ketikkan 'x' untuk kembali)");
        System.out.print("NOMINAL : ");
        var input = BankJaehyun.inputNumber();
        if (Objects.equals(input, "x")) {
            User.viewMenuPage(user);
        }
        System.out.print("TUJUAN : ");
        var tujuan = BankJaehyun.input();
        Login.cekUser(tujuan);
        System.out.println("-----------------------------");
        Integer transfer = Integer.parseInt(input);
        if (transfer <= Saldo.Saldo) {
            BankJaehyun.addTrx(user, "Transfer", -transfer);
            BankJaehyun.addTrx(tujuan, "Transfer", transfer);
            User.viewMenuPage(user);
        } else {
            System.out.println("Saldo Anda Tidak Cukup !");
            viewTransfer(user);
        }
    }
}

    }
    
}
