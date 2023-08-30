public class Main {
    public static void main(String[] args) {
        ContaCorrente ContaCorrente1 = new ContaCorrente("784512");
        ContaPoupanca ContaPoupanca1 = new ContaPoupanca("235689");
        ContaSalario ContaSalario1 = new ContaSalario("142536");

        ContaCorrente1.depositar(450);
        ContaPoupanca1.depositar(300);
        ContaSalario1.depositar(1450);

        System.out.println("\n");

        ContaCorrente1.sacar(200);
        ContaPoupanca1.sacar(100);
        ContaSalario1.sacar(50);

        System.out.println("\n");

        ContaCorrente1.transferir(ContaPoupanca1, 300);
        System.out.println("\n");
        ContaPoupanca1.transferir(ContaSalario1, 200);

        System.out.println("\n");

        ContaCorrente1.consultarSaldo();
        ContaPoupanca1.consultarSaldo();
        ContaSalario1.consultarSaldo();
    }
}