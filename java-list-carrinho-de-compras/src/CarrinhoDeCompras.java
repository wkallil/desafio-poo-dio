import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> itensCarrinho;

    public CarrinhoDeCompras() {
        this.itensCarrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itensCarrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> listaParaRemoverItem = new ArrayList<>();
        if (!itensCarrinho.isEmpty()) {
            for (Item itemVerficiador : itensCarrinho) {
                if (itemVerficiador.getNome().equalsIgnoreCase(nome)) {
                    listaParaRemoverItem.add(itemVerficiador);
                }
            }
            itensCarrinho.removeAll(listaParaRemoverItem);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itensCarrinho.isEmpty()) {
            for (Item calcularValorTotal : itensCarrinho) {
                double ValorPorCadaItem = calcularValorTotal.getQuantidade() * calcularValorTotal.getPreco();
                valorTotal += ValorPorCadaItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens() {
        if (!itensCarrinho.isEmpty()) {
            System.out.println(itensCarrinho);
        } else {
            System.out.println("A lista está vazia!");
        }
    }
}
