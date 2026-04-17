package EstruturaDados.Aula03_RecursividadeExemplo;

import java.io.File;

public class Recursividade {
    public static void main(String[] args){
        System.out.println("Fatorial de 5: " + fatorial(5));
        listar("C:\\Office24");
    }

    public static int fatorial(int n){
        //!5 = 5 x 4 x 3 x 2 x 1
        if(n ==0){
            return 1;
        }
        else{
            return n * fatorial(n-1);
        }
    }

    public static int fibonacci(int n){
        //f(6) = f(6) + f(5) + f(4) + f(3) + f(2) + f(1) + f(0)
        if(n == 0){//base
            return 0;
        }
        else if(n==1){//base
            return 1;
        }
        else{//recursividade
            return fibonacci(n-1) + fibonacci(n-2) ;
        }

    }

    public static void listar(String caminho){
        File pasta = new File(caminho);
        File[] arquivos = pasta.listFiles();

        if(arquivos != null){
            for(File f: arquivos){
                if(f.isDirectory()){
                    System.out.println("Pasta: " + f.getName()); 
                    listar(f.getAbsolutePath());
                    }
                    else{
                        System.out.println("Arquivo: " + f.getName());
                    }
            }
        }
    }

}
