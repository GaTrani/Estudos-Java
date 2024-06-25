package fundamentos;

public class tiposPrimitivos {

    public static void main(String[] args) {

        /* 8 tipos primitivos */

        // 1 byte = 8 bits

        byte um = 127;          // 128 - 127 bytes
        short dois = 2;         // 32.767 +-
        int quatro = 4;
        long oito = 8;

        float quatro2 = 4.0F;   // f ou F para mostrar que é float e nao double
        double oito2 = 8.0;     //

        char letra = 'A';           // uma letra, numero ou caracter
        boolean verdadeiro = true;  //false

        System.out.println(um + dois + quatro + oito);
        System.out.println(letra + "-" + verdadeiro + quatro2 + oito2);

        // NOTAÇÃO PONTO NAO FUNCIONA EM TIPOS PRIMITIVOS

    }

}