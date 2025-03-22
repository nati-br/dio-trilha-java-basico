package edu.natalia.tiposvariaveis;
public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        byte idade = 23;
        short ano  = 2025;
        int cep = 5300000;
        long cpf = 0000000000L;
        float Pi = 3.14F;
        double salario = 1275.33;

        //casting 
        short numeroCurto= 1;
        int numeroNormal = numeroCurto;
        System.out.println(numeroNormal);
        short numeroCurto2 = (short)numeroNormal;
        System.out.println(numeroCurto2);

        //variaveis x constantes
        // constantes são representadas pela palava final e escrita em caixa alta
        final double VALOR_DE_PI = 3.14;
        
    }
}
