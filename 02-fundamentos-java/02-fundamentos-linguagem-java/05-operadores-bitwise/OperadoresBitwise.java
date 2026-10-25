public class OperadoresBitwise {

    public static void main(String[] args) {

        int a = 10; // em binário: 00001010
        int b = 6;  // em binário: 00000110

        System.out.println("Valores iniciais:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println();

        // AND (&)
        int resultadoAnd = a & b;
        System.out.println("Operador AND (&)");
        System.out.println("a & b = " + resultadoAnd);
        System.out.println();

        // OR (|)
        int resultadoOr = a | b;
        System.out.println("Operador OR (|)");
        System.out.println("a | b = " + resultadoOr);
        System.out.println();

        // XOR (^)
        int resultadoXor = a ^ b;
        System.out.println("Operador XOR (^)");
        System.out.println("a ^ b = " + resultadoXor);
        System.out.println();

        // NOT (~) - complemento de a
        int resultadoNotA = ~a;
        System.out.println("Operador NOT (~)");
        System.out.println("~a = " + resultadoNotA);
        System.out.println("(o resultado é negativo por causa da forma como o Java representa números em binário)");
        System.out.println();

        // Deslocamento à esquerda (<<)
        int deslocamentoEsquerda = a << 1; // multiplica por 2
        System.out.println("Deslocamento à esquerda (<<)");
        System.out.println("a << 1 = " + deslocamentoEsquerda);
        System.out.println();

        // Deslocamento à direita (>>)
        int deslocamentoDireita = a >> 1; // divide por 2 (aproximado)
        System.out.println("Deslocamento à direita (>>)");
        System.out.println("a >> 1 = " + deslocamentoDireita);
        System.out.println();

        // Se quiser ver em binário, estas linhas usam um método pronto do Java:
        System.out.println("----- Representação em binário (opcional) -----");
        System.out.println("a em binário  = " + Integer.toBinaryString(a));
        System.out.println("b em binário  = " + Integer.toBinaryString(b));
        System.out.println("a & b         = " + Integer.toBinaryString(resultadoAnd));
        System.out.println("a | b         = " + Integer.toBinaryString(resultadoOr));
        System.out.println("a ^ b         = " + Integer.toBinaryString(resultadoXor));
        System.out.println("~a            = " + Integer.toBinaryString(resultadoNotA));
        System.out.println("a << 1        = " + Integer.toBinaryString(deslocamentoEsquerda));
        System.out.println("a >> 1        = " + Integer.toBinaryString(deslocamentoDireita));
    }
}