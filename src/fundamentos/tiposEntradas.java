package fundamentos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class tiposEntradas {
    public static void main(String[] args) {

        /* input no terminal */

        Scanner entrada = new Scanner(System.in);

        System.out.print("entre com um valor: ");
        double valor = entrada.nextDouble();

        System.out.print("valor digitado: " + valor);
        entrada.close();

        /* input com janela */

        String valorJP = JOptionPane.showInputDialog("digite alguma coisa: ");
        System.out.println(valorJP);

    }
}
