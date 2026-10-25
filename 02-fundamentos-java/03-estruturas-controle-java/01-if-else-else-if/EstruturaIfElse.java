import java.util.Scanner;
public class EstruturaIfElse{
   public static void main(String[] args){
           var scanner = new Scanner(System.in);
           System.out.println("Digite seu nome: ");
           var name = scanner.next();
           System.out.println("Digite sua idade: ");
           var age = scanner.nextInt();
           System.out.println("Você é emancipado? (s/n): ");
           var isEmancipated = scanner.next().equalsIgnoreCase("s");


           if (age >= 18){
                   System.out.printf("%s, você tem %s e pode dirigir.\n", name, age);
           } else if (age >= 16 && isEmancipated) {
                   System.out.printf("%s, apesar de sua idade (%s), você é emancipado e pode dirigir.\n", name, age);
           } else{
                   System.out.printf("%s, você tem %s e você não pode dirigir.\n", name, age);
           }

           /*
            if ((age >= 18) || (age >= 16 && isEmancipated)){
                   System.out.printf("%s, você pode dirigir.\n", name);
           } else{
                   System.out.printf("%s, você não pode dirigir.\n", name);
           }

          -- ou --

           var canDrive = (age >= 18) || (age >= 16 && isEmancipated);
           if (canDrive){
                   System.out.printf("%s, você pode dirigir.\n", name);
           } else{
                   System.out.printf("%s, você não pode dirigir.\n", name);
           }

          -- ou --

           var canDrive = (age >= 18) || (age >= 16 && isEmancipated);
           var mensage = canDrive ?
                   name + "você pode dirigir.\n":
                   name + "você não pode dirigir.\n";

           System.out.println(mensage);
           System.out.println("Fim da execução");

           */
   }
}
