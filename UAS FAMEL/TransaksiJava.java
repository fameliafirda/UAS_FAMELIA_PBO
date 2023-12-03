/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package transaksi.java;

/**
 *
 * @author LENOVO IP3-14IGL05
 */
public class TransaksiJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // import java.util.Objects;

public class Transaksi extends User {
    public static void viewTransaksi(String user) {
        System.out.println("-------------------------------------------------------------");
        System.out.println("| Username\t| Jenis Transaksi\t| Nominal\t| Saldo Akhir\t|");
        System.out.println("-------------------------------------------------------------");
        if (user == null) {
            for (int i = 0; i < BankJaehyun.trx1.length; i++) {
                System.out.println("| " + BankJaehyun.trx1[i] + "\t\t| " + BankJaehyun.trx2[i] + "\t\t\t| " + BankJaehyun.trx3[i] + "\t\t| " + BankJaehyun.getTrx4()[i] + "\t\t\t| ");
            }
        } else {
            for (int i = 0; i < BankJaehyun.trx1.length; i++) {
                if (Objects.equals(BankJaehyun.trx1[i], user)) {
                    System.out.println("| " + BankJaehyun.trx1[i] + "\t\t| " + BankJaehyun.trx2[i] + "\t\t\t| " + BankJaehyun.trx3[i] + "\t\t| " + BankJaehyun.getTrx4()[i] + "\t\t\t| ");
                }
            }
        }
        System.out.println("-------------------------------------------------------------");
        System.out.print("Tekan enter untuk kembali");
        BankJaehyun.input();
        Admin.viewMenuPage(user);
    }
}

    }
    
}
