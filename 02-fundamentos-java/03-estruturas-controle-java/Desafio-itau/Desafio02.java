import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("digite o codigo: ");
        String codigoInformado = scanner.nextLine();
        System.out.println("codigo esperado: ");
        String codigoEsperado = scanner.nextLine();
        if (codigoInformado.equals(codigoEsperado)){
            System.out.println("ACESSO LIBERADO");
        }else{
            System.out.println("ACESSO NEGADO");
        }
        scanner.close();
    }
}
/*
//codigo corigido com nomes iguais aos do codigo base do desafio, isto para
//que fosse aceito
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String codigoInformado = scanner.nextLine();
        String codigoEsperado = scanner.nextLine();

        if (codigoInformado.equals(codigoEsperado)) {
            System.out.println("ACESSO LIBERADO");
        } else {
            System.out.println("ACESSO NEGADO");
        }

        scanner.close();
    }
}
*/