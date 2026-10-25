/*
1. Escreva um código que receba o nome e o ano de
nascimento de alguém e imprima na tela a seguinte mensagem:
"Olá 'Fulano' você tem 'X' anos"
*/

import java.time.OffsetDateTime;
import java.util.Scanner;

public class Exercicio01Idade {

    public static void main(String[] args) {
        var anoAtual = OffsetDateTime.now().getYear();
        var scanner = new Scanner(System.in);

        System.out.println("Informe o seu nome:");
        var nome = scanner.next();

        System.out.println("Informe o seu ano de nascimento:");
        var anoNascimento = scanner.nextInt();

        var idade = anoAtual - anoNascimento;

        System.out.printf("Olá %s você tem %s anos \n", nome, idade);

        scanner.close();
    }
}
