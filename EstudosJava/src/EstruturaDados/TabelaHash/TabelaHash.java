package EstruturaDados.TabelaHash;

import java.util.LinkedList;

public class TabelaHash {
    private int tamanho = 10;
    private LinkedList<String>[] tabela;

    @SuppressWarnings("unchecked") // Desativa o aviso de erro da linha 11
    public TabelaHash(){
        tabela = new LinkedList[tamanho];
        for (int i=0; i<tamanho; i++){
            tabela[i] = new LinkedList<>();
        }
    }

    private int funcaoHash(String chave){
        return Math.abs(chave.hashCode()%tamanho);
    }

    public void inserir(String chave){
        int indice = funcaoHash(chave);

        if(!tabela[indice].contains(chave)){
            tabela[indice].add(chave);
        }
    }

    public void exibir(){
        for(int i = 0; i<tamanho; i++){
            System.out.println("Elemento: " + tabela[i]);
        }
    }

    public boolean buscar(String chave){
        int indice = funcaoHash(chave);
        return tabela[indice].contains(chave);

    }

    public static void main(String[] args) {
        TabelaHash tabela2 = new TabelaHash();

        tabela2.inserir("Notebook");
        tabela2.inserir("Mouse");
        tabela2.inserir("Teclado");
        
        System.out.println("Buscar Mouse: " + tabela2.buscar("Mouse"));
        System.out.println("Buscar Monitor: " + tabela2.buscar("Monitor"));
        tabela2.exibir();

    }
}
