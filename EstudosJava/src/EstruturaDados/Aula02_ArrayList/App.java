package EstruturaDados.Aula02_ArrayList;

public class App {

    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();

        carrinho.addProduto("mochila");
        carrinho.addProduto("notebook");
        carrinho.addProduto("monitor");
        carrinho.addProduto("mouse");
        carrinho.addProduto("teclado");

        System.out.println("Ultimo produto: " + carrinho.ultimoProduto());

        System.out.println("Produto removido: " + carrinho.removerProduto());
        
    }
}
