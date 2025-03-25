public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 9;
        if (nota >= 7){
            System.out.println("Aprovado");
        }else if (nota >= 5 && nota < 7){
            System.out.println("Recuperação");
        }else
        System.out.println("reprovado");

        //Operador ternario
        String resultado = nota >=7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
    }
}
