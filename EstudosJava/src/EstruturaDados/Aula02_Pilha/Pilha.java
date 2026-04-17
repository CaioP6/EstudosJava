package EstruturaDados.Aula02_Pilha;

public class Pilha {
    private int tamanhoMax;
    private int topo;
    private int[] elementos;
    

    //constructor
    public Pilha(int tamanho){
        tamanhoMax = tamanho; //limite de itens na lista
        elementos = new int[tamanhoMax]; //cria vetor elementos
        topo = -1; //lista vazia
    }

    //push: add elementos no topo
    public void push(int valor){
        if(topo == tamanhoMax-1){
            System.out.println("Lista cheia! Não é possível adicionar o elemento: " + valor);
        } else{
            elementos[++topo] = valor;
            System.out.println("Elemento adicionado: " + valor);
        }
    }

    //pop: remove elementos do topo
    public int pop(){
        if (topo==-1) {
            System.out.println("Lista vazia!");
            return -1;
        } else {
            System.out.println("Elemento removido!");
            return elementos[--topo];
        }
    }

    //peek: espia o ultimo elemento da pilha
    public int peek(){
        if (topo==-1) {
            System.out.println("Lista vazia!");
            return -1;
        } else{
            return elementos[topo];
        }
    }

    //Verifica se a pilha está vazia
    public boolean verificaPilha(){

        if(topo==-1){
            return false;
        } else {
            return true;
        }
    }


    

    
}