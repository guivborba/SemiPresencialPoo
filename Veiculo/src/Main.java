public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("Honda", "Civic", 2021);
        Veiculo veiculo2 = new Veiculo("Ford", "Fusion", 2013);

        veiculo1.ligar();
        veiculo2.ligar();
        veiculo1.desligar();

        veiculo1.informacoes();
        veiculo2.informacoes();
    }
}