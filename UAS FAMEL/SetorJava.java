/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package setor.java;

/**
 *
 * @author LENOVO IP3-14IGL05
 */
public class SetorJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // import java.util.Objects;

public class Setor extends User {
    public static Integer setor;

    public static void viewSetor(String user) {
        System.out.println("-----------------------------");
        System.out.println("(Ketikkan 'x' untuk kembali)");
        System.out.print("NOMINAL : ");
        var input = BankJaehyun.inputNumber();
        if (Objects.equals(input, "x")) {
            User.viewMenuPage(user);
        }
        System.out.println("-----------------------------");
        Integer setor = Integer.parseInt(input);
        if (setor >= 0) {
            BankJaehyun.addTrx(user, "Setor   ", setor);
            User.viewMenuPage(user);
        } else {
            System.out.println("Masukkan nominal > 0");
            viewSetor(user);
        }
    }
}

    }
    
}
