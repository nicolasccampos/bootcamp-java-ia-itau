import java.util.Scanner;

public class EstruturaWhile_DoWhile {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var name = "";
        /*
        while(!name.equals("exit")){

            System.out.println("Informe o nome: ");
            name = scanner.next();
            System.out.println(name);

            // utiliza o if se for While(true), para brecar o código.
            // if (name.equalsIgnoreCase("exit")) break;

        }
        */
        do{
            System.out.println("Informe o nome: ");
            name = scanner.next();
            System.out.println(name);
            if (name.equalsIgnoreCase("exit")) break;

            /* a diferença de While e doWhile é que o While verifica a
            condição para ver se roda ou não.Um ex: (!name.equals("exit"))

            Agora o do While primeiro roda 1 vez, ai sim verifica
            a condição. A garantia dele é que se, por exemplo
            a variavel name = "exit", mesmo assim ele rodaria o
            codigo ao menos 1 vez antes de encerrar no if.
            */

        } while (true);
    }

}


