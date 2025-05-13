public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numeroConta, int agencia, double saldo, String cliente) {
        super(numeroConta, agencia, saldo, cliente);
    }

    public String toString() {
        System.out.println("+++Extrato conta Corrente+++");;
        return super.toString();
    }
}
