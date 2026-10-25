import java.util.Scanner;

public class EstruturaSwitch {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Informe um numero de 1 a 7");
        var option = scanner.nextInt();

        /*
        switch (option){

            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("Domingo");
                break;
            case 4:
                System.out.println("Domingo");
                break;
            case 5:
                System.out.println("Domingo");
                break;
            case 6:
                System.out.println("Domingo");
                break;
                break;
            default:
                System.out.println("Opção invalida");
        }
        */

        var menssage = switch (option){
        case 1, 7 -> {
            var day = option == 1 ? "Domingo" : "Sabado";
            yield String.format("Hoje é %s, fim de semana", day);
        }
        case 2 -> ("Segunda");
        case 3 -> ("Terça");
        case 4 -> ("Quarta");
        case 5 -> ("Quinta");
        case 6-> ("Sexta");
        default -> ("Domingo");

        };
        System.out.println(menssage);
    }
}