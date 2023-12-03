/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package saldo.java;

/**
 *
 * @author LENOVO IP3-14IGL05
 */
public class SaldoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // import java.util.Objects;

public class Saldo {

    public static int Saldo;

    public static void viewSaldo(String user) {
        for (int i = (BankJaehyun.trx1.length); i > 0; i--) {
            if (Objects.equals(BankJaehyun.trx1[(i - 1)], user)) {
                Saldo = BankJaehyun.getTrx4()[(i - 1)];
                System.out.println("Saldo Anda : " + Saldo);
                break;
            } else if (i == 0) {
                System.out.println("Saldo Anda : 0");
            }
        }
    }
}

    }
    
}
