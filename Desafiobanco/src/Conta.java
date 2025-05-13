public class Conta {
    private int numeroConta;
    private int agencia;
    private double saldo;
    private String cliente;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Conta (int numeroConta, int agencia, double saldo, String cliente){
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.cliente = cliente;
    }
    public void depositar (double valor){
        saldo += valor;
    }

    public void sacar (double valor){
        saldo -= valor;
    }

    public void transferir (Conta destino, double valor){
        this.sacar(valor);
        destino.depositar(valor);
    }


    public String toString() {
        return "Conta " + numeroConta + " - Titular: " + cliente + " - Saldo: R$" + saldo;
    }


}
