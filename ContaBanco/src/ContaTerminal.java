import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Cliente cliente = new Cliente ();
        
        System.out.print("Por favor, digite o número da Conta! ");
        System.out.println("");
        cliente.setNumero(scanner.nextInt());
        scanner.nextLine();
    
        
        System.out.println("Por favor, digite o número da Agência!");
        cliente.setAgencia(scanner.nextLine());
        
        
        System.out.println("Por favor, digite seu Nome!");
        cliente.setNomeCliente(scanner.nextLine());

         
        System.out.print("Por favor, digite o saldo inicial! ");
        cliente.setSaldo(scanner.nextDouble());
        System.out.println(cliente.getMensagem());
       
        
    }
}
