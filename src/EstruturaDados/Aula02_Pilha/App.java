package EstruturaDados.Aula02_Pilha;

import java.util.Stack;

public class App {

    public static void main(String[] args){
        Pilha pilha = new Pilha(5);

        pilha.push(20);
        pilha.push(25);
        pilha.push(30);
        pilha.push(35);
        pilha.push(40);
        System.out.println(pilha.peek());
        pilha.pop();
        System.out.println(pilha.peek());

        String[] items = {"A", "B", "C"};
        Stack<String> pilhaa = new Stack<>();
        for (String item : items){
            pilhaa.push(item);
        }
         

    }
}
