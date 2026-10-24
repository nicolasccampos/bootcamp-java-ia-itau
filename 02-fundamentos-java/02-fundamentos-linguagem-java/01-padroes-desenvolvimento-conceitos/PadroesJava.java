import java.util.Scanner;

public class PadroesJava {

    private final static String WELL_COME = "Olá, informe seu nome: ";
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(WELL_COME);
        String name = scanner.next();
        System.out.println("Informe sua idade:");
        int age = scanner.nextInt();
        System.out.println("(primeiro metodo): Olá! " + name + " sua idade é " + age);
        System.out.printf("(segundo metodo): Olá! %s sua idade é %s ", name, age);

    }
}