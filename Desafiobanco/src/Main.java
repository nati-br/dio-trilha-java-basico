public class Main {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(123, 1, 1000, "João");
        ContaPoupanca cp = new ContaPoupanca(456, 1, 5000, "Maria");

        System.out.println(cc);
        System.out.println(cp);

        cc.transferir(cp, 300);
        System.out.println(cc);
        System.out.println(cp);



    }
}