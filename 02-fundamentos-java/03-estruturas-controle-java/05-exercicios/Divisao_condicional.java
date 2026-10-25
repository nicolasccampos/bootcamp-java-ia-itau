/*
4. Escreva um código onde o usuário informa um número inicial, posteriormente irá
informar outros N números, a execução do código irá continuar até que o número
informado dividido pelo primeiro número tenha resto diferente de 0 na divisão,
números menores que o primeiro número devem ser ignorados.
*/

import java.util.Scanner;
public class Divisao_condicional {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Sua missão é escolher um numero inicial");
        System.out.println("para após dividir com N numeros que vc escolher.");
        System.out.println("Escolha apenas numeros divisiveis entre si!\n");
        System.out.println("Informe um numero inicial: ");
        var number1 = scanner.nextInt();
        var number2 = 0;
        var division = 0;

        while (division == 0){
            System.out.println("Agora outro numero: ");
            number2 = scanner.nextInt();
            if (number2 >= number1){
                division = number2 % number1;
            }
        }
        System.out.println("\nNúmero não divisível pelo primeiro :/");
    }
}
