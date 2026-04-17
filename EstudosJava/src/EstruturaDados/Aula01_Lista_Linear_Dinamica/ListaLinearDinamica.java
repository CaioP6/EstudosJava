package EstruturaDados.Aula01_Lista_Linear_Dinamica;

import java.util.ArrayList;

public class ListaLinearDinamica {
    
    public static void main(String[] args) {
        ArrayList<String> listacompras = new ArrayList<>(); 

        listacompras.add("Caio");
        listacompras.add("Passaros");

        System.out.println("Lista: ");

        for(String item : listacompras){
            System.out.println("Item: " + item);
        }


    }
}
