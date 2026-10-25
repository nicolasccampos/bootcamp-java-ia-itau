/*
2. Escreva um código onde o usuário entra com sua altura e peso, seja feito o cálculo
do seu IMC (IMC = peso / (altura * altura)) e seja exibida a mensagem de acordo
com o resultado:
   - Se for menor ou igual a 18,5 "Abaixo do peso";
   - Se for entre 18,6 e 24,9 "Peso ideal";
   - Se for entre 25,0 e 29,9 "Levemente acima do peso";
   - Se for entre 30,0 e 34,9 "Obesidade Grau I";
   - Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
   - Se for maior que 40,0 "Obesidade III (Mórbida)";
*/
import java.util.Locale;
import java.util.Scanner;
public class Imc_classificacao {
    public static void main(String[] args){
        var scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, Digite seu nome: ");
        var name = scanner.next();
        System.out.println("Escreva sua Altura: ");
        double height = scanner.nextDouble();
        System.out.println("Escreva seu Peso: ");
        double weight = scanner.nextDouble();
        System.out.println("Calculo do IMC: (IMC = peso / (altura * altura))\n");
        var imc = weight / (height * height);

        if (imc <= 18.5){
            System.out.printf("%s, você está abaixo do peso", name);
        } else if (imc <= 24.9) {
            System.out.printf("%s, você está no peso ideal", name);
        } else if (imc <= 29.9) {
            System.out.printf("%s, você está levemente acima do peso", name);
        } else if (imc <= 34.9) {
            System.out.printf("%s, você tem obesidade grau I", name);
        } else if (imc <= 39.9) {
            System.out.printf("%s, você tem obesidade grau II", name);
        } else {
            System.out.printf("%s, você tem obesidade grau III (Mórbida)", name);
        }

    }
}
