public class ContaCorrente  extends Conta{
    public ContaCorrente(int numeroConta, int agencia, double saldo, String cliente) {
        super(numeroConta, agencia, saldo, cliente);
    }

    @Override
    public String toString() {
        System.out.println("+++Extrato conta Corrente+++");;
        return super.toString();
    }
}
