abstract class Conta {
    private String numeroConta;
    private double saldo;

    public Conta(String numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado na conta " + numeroConta);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado na conta " + numeroConta);
        } else {
            System.out.println("Saldo insuficiente para saque na conta " + numeroConta);
        }
    }

    public abstract void transferir(Conta destino, double valor);

    public void consultarSaldo() {
        System.out.println("Saldo atual da conta " + numeroConta + ": R$" + saldo);
    }
}