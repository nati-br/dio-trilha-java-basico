public class ExemploBreak {
    public static void main(String[] args) {
        for(int numero = 1; numero <=5; numero ++){
            if(numero ==3)
            break;
            //continue; // ele continua recebendo mas imprime a saída 

            System.out.println(numero);
        }
    }
}
