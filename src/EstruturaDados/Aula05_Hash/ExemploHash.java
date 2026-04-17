package EstruturaDados.Aula05_Hash;

import java.util.HashMap;

public class ExemploHash {
    public static void main(String[] args) {
        //criando a tabela Hash
        HashMap<String,Integer> estoque = new HashMap<>();
        
        
        System.out.println("======= Inserindo - Inicio ========");
        //inserindo elementos na chave e valor
        estoque.put("Notebook", 10);
        estoque.put("Mouse", 50);
        estoque.put("Teclado", 30);
        estoque.put("Mochila", 1);
        System.out.println("======= Inserindo - Fim ========");
        
        
        System.out.println("======= Busca - Apenas do Mouse ========");
        //Análise de existência de chave
        if(estoque.containsKey("Mochila")){
            System.out.println("Teste: " + estoque.get("Mochila"));
        }else{
            System.out.println("Produto sem estoque");
        }
        System.out.println("======= Busca - Fim ========");
        
        
        System.out.println("======= Todos os elementos ========");
        //Busca dos elementos iterando com os itens
        for(String produto : estoque.keySet()){
            System.out.println(produto + " => " + estoque.get(produto));
        }
        System.out.println("======= Todos os elementos - Fim ========");
        

        System.out.println("======= Inserindo repetido ========");
        //inserindo o mesmo elemento
        estoque.put("Teclado", 60);
        System.out.println("======= Inserindo repetido - Fim ========");
        

        System.out.println("======= Todos os elementos ========");
        //Busca dos elementos iterando com os itens
        for(String produto : estoque.keySet()){
            System.out.println(produto + " => " + estoque.get(produto));
        }
        System.out.println("======= Todos os elementos - Fim ========");


        
        
    
    }
}
