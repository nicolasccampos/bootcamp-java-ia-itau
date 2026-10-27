import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Escreva o código de verificação valido: DEPOSITO, SAQUE ou TRANSFERENCIA");
        String operacao = scanner.nextLine();

        boolean operacaoValida = switch (operacao) {
            case "DEPOSITO", "SAQUE", "TRANSFERENCIA" -> true;
            default -> false;
        };
        System.out.println(operacaoValida ? "VALID" : "INVALID");
        scanner.close();
    }
}

/*
//aqui é o código enviado no site da DIO.me, aparentemente a validação
//deles se minha resposta está correta é em uma versão mais antiga do JAVA.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operacao = scanner.nextLine();

        boolean operacaoValida = false;

        switch (operacao) {
            case "DEPOSITO":
            case "SAQUE":
            case "TRANSFERENCIA":
                operacaoValida = true;
                break;
            default:
                operacaoValida = false;
        }

        System.out.println(operacaoValida ? "VALID" : "INVALID");

        scanner.close();
    }
}
*/