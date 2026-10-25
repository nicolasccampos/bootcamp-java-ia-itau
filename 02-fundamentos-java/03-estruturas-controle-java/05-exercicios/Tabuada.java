/*
1. Escreva um código onde o usuário entra com um número e seja gerada a tabuada
de 1 até 10 desse número;
*/

import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Olá, seja bem vindo á Tabuada Online! Informe seu nome: ");
        var name = scanner.next();
        System.out.println("Agora um numero que deseja a tabuada: ");
        var number = scanner.nextInt();
        var multiplication = 0;

        for(int i = 1; i <= 10; i++){
            multiplication = number * i;
            System.out.printf("%d * %d = %d\n", number, i, multiplication);
        }
        System.out.println("Fim do da Tabuada!");
        scanner.close();
    }
}
