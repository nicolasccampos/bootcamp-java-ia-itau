/*
3. Escreva um código que receba a base e a altura de um retângulo,
calcule sua área e exiba na tela

fórmula: área = base X altura
*/

import java.util.Scanner;
public class Exercicio03AreaRetangulo {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Escreva o tamanho da base de um retângulo: ");
        var base = scanner.nextInt();
        System.out.println("Escreva a altura do um retângulo: ");
        var altura = scanner.nextInt();
        var area = base * altura;
        System.out.printf("A Area do Retângulo é: %s\n", area);
    }
}
