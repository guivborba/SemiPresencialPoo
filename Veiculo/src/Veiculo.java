public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private boolean ligado;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = false;
    }

    public void ligar() {
        if (!ligado) {
            System.out.println("Ligando o veículo " + marca + " " + modelo);
            ligado = true;
        } else {
            System.out.println("O veículo já está ligado.");
        }
    }
    public void desligar() {
        if (ligado) {
            System.out.println("\nDesligando o veículo " + marca + " " + modelo);
            ligado = false;
        } else {
            System.out.println("O veículo já está desligado.");
        }
    }
    public void informacoes() {
        System.out.println("\nInformações do " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Status: " + (ligado ? "Ligado" : "Desligado"));
    }
}