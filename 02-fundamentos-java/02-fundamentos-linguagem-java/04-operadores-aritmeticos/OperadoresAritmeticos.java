import java.util.Scanner;

public class OperadoresAritmeticos {
    //aqui considerei operadores que não conhecia
    // ou que não dominava a sintaxe de comandos nativos do java:
    // como o Math .pow e .sqrt, cada um com sua função.

    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro numero: ");
        var value1 = scanner.nextInt();
        System.out.println("Informe sua potencia: ");
        var value2 = scanner.nextInt();
        System.out.printf(" a potencia de %s é %s\n", value1, Math.pow(value1, value2));
        System.out.printf("E a raiz quadrada de %s é %s\n", value1, Math.sqrt(value1));
    }
}