class ContaPoupanca extends Conta {
    public ContaPoupanca(String numeroConta) {
        super(numeroConta);
    }
    @Override
    public void transferir(Conta destino, double valor) {
        if (valor <= getSaldo()) {
            destino.depositar(valor);
            this.sacar(valor);
            System.out.println("Transferência de R$" + valor + " realizada da conta " + getNumeroConta() + " para a conta " + destino.getNumeroConta());
        } else {
            System.out.println("Saldo insuficiente para transferência da conta " + getNumeroConta());
        }
    }
}