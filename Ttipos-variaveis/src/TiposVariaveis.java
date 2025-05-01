public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        String nome = "Diórgenes Moura";

        double salarioMinimo = 2500.00;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // Casting necessário para converter int para short
        
        int numero = 5;

        numero = 10; // Reatribuição de valor}

        System.err.println(numero);

        final  double VALOR_DE_PI = 3.14; // Constante, não pode ser reatribuído

        System.err.println(nome);
   }
}

