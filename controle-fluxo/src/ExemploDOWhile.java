import java.util.Random;

public class ExemploDOWhile {
    public static void main(String[] args) {
        do {
            //executando repetidas vezes até alguém atender
            System.out.println("Telefone tocando");
        }while(tocando());
        System.out.println("Alô !!!");
    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu?" + atendeu);
        return ! atendeu;
    }
}
