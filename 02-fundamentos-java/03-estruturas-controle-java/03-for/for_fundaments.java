import java.util.Scanner;
public class for_fundaments {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        /*
        for (int i = 0; i <= 100; i++){
            if (i % 2 == 0) continue;
        }
        System.out.println(1);
        */
        for (int i = 0; i < args.length; i++){
            System.out.println((i + 1) + " - " + args[i]);
            //aqui, você determina os args nas configurações e ele
            //gera uma lista deles em sequencia
            //ex: arroz feijão banana melão ... ... ...
        }


    }
}
