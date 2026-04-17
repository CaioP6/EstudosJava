package EstruturaDados.Aula01_Lista_Linear_Dinamica;

public class ListaLinear {
    private String[] elementos; //Vetor para armazenar os elementos
    private int tamanho; //Quantidade de elementos

    //Construtor, já recebe informações assim que for chamado
    //capacidade define o tamaho máx da lista
    public ListaLinear (int capacidade){
        elementos = new String[capacidade];
        tamanho = 0;
    }

    public boolean inserir(String valor){
          if(tamanho < elementos.length){
            elementos[tamanho] = valor;
            tamanho++;
            return true;    
        }else{
            System.out.println("Lista cheia!");
            return false;
        }
    }

    public boolean remove(String valor){
        for(int i=0; i < tamanho; i++){
            if(elementos[i].equals(valor)){
                for(int j=i; j<tamanho-1;j++){
                    elementos[j] = elementos[j+1];
                }
                tamanho--;
                elementos[tamanho] = null; //limpa a última posição
                return true;
            }

        }

        return false;
    }

    public int buscar(String valor){
        for(int i=0; i<tamanho; i++){
            if(elementos[i].equals(valor)){
                return i;
            }
        }
        return -1;
    }

    public void imprimir(){
        System.out.println("Lista: ");
        for(int i=0; i< tamanho; i++){
            System.out.println("Item: " + elementos[i]);
        }
        System.out.println();

    }

    public int tamanho(){
        return tamanho;

    }


}
