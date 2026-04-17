package EstruturaDados.Aula02_Stack;
import java.util.Stack;


//classe pronta com o conceito de pilha
public class ExemploStack {
    public static void main(String[] args){
        Stack<String> pages = new Stack<>();

        pages.push("Pag 1 - Inicio");
        pages.push("Pag 2 - Produtos");
        pages.push("Pag 3 - Carrinho");

        System.out.println("Página atual: " + pages.peek());
        
        pages.pop();
        
        System.out.println("Página atual: " + pages.peek());
        
        pages.pop();
        
        System.out.println("Página atual: " + pages.peek());
    
    
    }
}
