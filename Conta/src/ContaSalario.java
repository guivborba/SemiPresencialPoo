class ContaSalario extends Conta {
    public ContaSalario(String numeroConta) {
        super(numeroConta);
    }
    @Override
    public void transferir(Conta destino, double valor) {
        System.out.println("Transferência não permitida em contas salário.");
    }
}