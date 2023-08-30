public class Main{
    public static void main(String[] args) {
        Produto produto1 = new Produto("Coca-cola", 10.0, "Refrigerante");
        Produto produto2 = new Produto("Danone", 15.0, "Iogurte de morango");
        Produto produto3 = new Produto("Halls", 5.0, "Bala sabor menta");

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarAoCarrinho(produto1);
        carrinho.adicionarAoCarrinho(produto2);
        carrinho.adicionarAoCarrinho(produto3);

        double valorTotal = carrinho.getTotal();
        System.out.println("Valor Total no Carrinho: R$" + valorTotal);
    }
}