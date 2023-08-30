import java.util.ArrayList;
import java.util.List;

class CarrinhoDeCompras {
    private List<Produto> produtos;
    private double valorTotal;
    public CarrinhoDeCompras() {
        produtos = new ArrayList<>();
        valorTotal = 0.0;
    }
    public void adicionarAoCarrinho(Produto produto) {
        produtos.add(produto);
        valorTotal += produto.getValor();
        System.out.println(produto.getNome() + " adicionado ao carrinho. \nDescrição: " + produto.getDescricao() + "  \nValor: R$" + produto.getValor() + "\n");
    }
    public double getTotal() {
        return valorTotal;
    }
}