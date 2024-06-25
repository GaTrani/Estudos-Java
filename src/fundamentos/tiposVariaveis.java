package fundamentos;

public class tiposVariaveis {

    public static void main(String[] args) {

        /* tipo int declarada e inicializada */

        int numeroVariavel = 3;
        numeroVariavel = 4; // alteração no valor da variavel

        /* tipo final - é a constante de java */

        final int pi = 3;
        // tentiva de alterar a const
        // pi = 4; RESULTA EM ERRO POIS É CONST (FINAL)

        /*
         * tipo var, o tipo é atribuido dinamicamento
         * pelo java ao passar o valor (inferencia)
         */
        var numeroInferente = 2;

        // nao pode ser "anonima"
        // var letra; precisa ser inicializada com algum valor

        System.out.println(numeroVariavel);
        System.out.println(pi);
        System.out.println(numeroInferente);
    }

}