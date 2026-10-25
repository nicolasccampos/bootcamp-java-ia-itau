/*
2. Escreva um código que receba o tamanho do lado
de um quadrado, calcule sua área e exiba na tela

fórmula: área = lado X lado
*/

import java.util.Scanner;
public class Exercicio02AreaQuadrado {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Escreva o tamanho do lado de um quadrado");
        var lado = scanner.nextInt();
        var area = lado * lado;
        System.out.printf("A Area do Quadrado é: %s\n", area);
    }
}
