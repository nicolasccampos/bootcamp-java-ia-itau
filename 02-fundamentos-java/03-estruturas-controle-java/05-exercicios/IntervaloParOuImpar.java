/*
3. Escreva um código que o usuário entre com um primeiro número, um segundo número
maior que o primeiro e escolha entre a opção par e ímpar, com isso o código deve
informar todos os números pares ou ímpares (de acordo com a seleção inicial) no
intervalo de números informados, incluindo os números informados e em ordem
decrescente;
*/

import java.util.Scanner;
public class IntervaloParOuImpar {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Olá, digite seu nome: ");
        var name = scanner.next();
        System.out.println("Informe um numero: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Digite outro numero: ");
        int secondNumber = scanner.nextInt();
        if (secondNumber <= firstNumber) {
            System.out.println("O segundo número precisa ser maior que o primeiro.");
            return;
        }
        System.out.println("Agora escolha entre Par ou Impar");
        var option = scanner.next().toLowerCase();

        switch (option){
            case "par":
                for (int i = secondNumber; i >= firstNumber; i--){
                    if (i % 2 == 0) System.out.printf("%d -> par\n", i);
                }
                break;
            case "impar":
                for (int i = secondNumber; i >= firstNumber; i--){
                    if (i % 2 != 0) System.out.printf("%d -> impar\n", i);
                }
                break;
            default:
                System.out.println("Opção inválida");
                return;
        }
        System.out.printf("%s, estes são seus numeros (par/impar) de %d à %d", name, firstNumber, secondNumber);
        scanner.close();
    }
}
