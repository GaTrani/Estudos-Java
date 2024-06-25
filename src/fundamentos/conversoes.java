package fundamentos;
import java.util.Locale;
class conversoes {

    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        /* Converter double para String */
        double numero = 1.4;
        String numeroTexto = Double.toString(numero);

        System.out.println(numeroTexto);

        /* Converter String para Double */
        String texto = "2.0";
        double textoNumero = Double.parseDouble(texto);

        System.out.println(textoNumero);

    }
}