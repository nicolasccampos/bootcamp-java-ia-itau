/*
4. Escreva um código que receba o nome e a idade de 2 pessoas
e imprima a diferença de idade entre elas
*/

import java.util.Scanner;
public class Exercicio04DiferencaIdade {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Escreva o nome e em seguida a idade de uma pessoa: ");
        var name1 = scanner.next();
        var age1 = scanner.nextInt();
        System.out.println("Escreva o mesmo de outra pessoa: ");
        var name2 = scanner.next();
        var age2 = scanner.nextInt();

        var diferencaAges = Math.abs(age1 - age2);
        System.out.printf("A diferença da idade da %s para %s é: %s\n", name1, name2, diferencaAges);
    }
}
