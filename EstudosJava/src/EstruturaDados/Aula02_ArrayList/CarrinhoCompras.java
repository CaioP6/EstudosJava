package EstruturaDados.Aula02_ArrayList;

import java.util.ArrayList;

public class CarrinhoCompras {
    private ArrayList<String> produtos;

    //constructor
    public CarrinhoCompras(){
        produtos = new ArrayList<>();

    }

    //push
    public void addProduto(String produto){
        produtos.add(produto);
        System.out.println(produto + " foi adicionado ao carrinho!");
    }
    
    //pop
    public String removerProduto(){
        if (produtos.isEmpty()){
            System.out.println("Carrinho Vazio!");
            return null;
        }
        return produtos.remove(produtos.size()-1);
    }

    //peek
    public String ultimoProduto(){
        if(produtos.isEmpty()){
            System.out.println("Carrinho vazio!");
            return null;
        }

        return produtos.get(produtos.size()-1);
    }


}
