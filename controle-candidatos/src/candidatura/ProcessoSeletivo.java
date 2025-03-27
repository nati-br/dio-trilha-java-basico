package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args){
    //    analisarCandidato(1900.0);
    //    analisarCandidato(2200.0);
    //    analisarCandidato(2000.0);
    }
    static void imprimirSelecionados(){
        String [] candidatos = {"AAAA", "BBBB", "CCCC", "DDDD", "EEEEE"};
        for(int indice=0; indice < candidatos. length; indice++) {
            System.out.println("O candidato de n°" + (indice+1) + " é o " + candidatos[indice]);
            
            System.out.println("Forma abrevida de interação for each");
            
            for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
            }
            
        }
    }


    static void selecaoCandidatos(){
        String [] candidatos = {"AAAA", "BBBB", "CCCC", "DDDD", "EEEEE"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos [candidatosAtual];
            double salarioPretendido = ValorPretendido();
            System.out.println(("O candidato "+ candidato + "Solicitou este valor de salario"));
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato" + candidato + " foi selecionado para a vaga ");
                candidatosSelecionados ++;
            }
        }candidatosAtual++;
    }
    static double ValorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase =  2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if (salarioBase==salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else{
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}
