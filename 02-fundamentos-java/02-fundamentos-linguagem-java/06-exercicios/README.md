# Exercícios – Fundamentos da Linguagem Java

Minhas anotações dos exercícios do curso **Fundamentos da Linguagem de Programação Java**.

## Enunciados

1. Escreva um código que receba o **nome** e o **ano de nascimento** de alguém e imprima:  
   `Olá 'Fulano' você tem 'X' anos`.
2. Escreva um código que receba o **tamanho do lado de um quadrado**, calcule sua área e exiba na tela.  
   - Fórmula: `área = lado × lado`
3. Escreva um código que receba a **base** e a **altura de um retângulo**, calcule a área e exiba na tela.  
   - Fórmula: `área = base × altura`
4. Escreva um código que receba o **nome** e a **idade de 2 pessoas** e imprima a **diferença de idade** entre elas.

## Meus arquivos

| Exercício | Arquivo Java |
|-----------|--------------|
| 1 – Idade a partir do ano de nascimento | `Exercicio01Idade.java` |
| 2 – Área do quadrado | `Exercicio02AreaQuadrado.java` |
| 3 – Área do retângulo | `Exercicio03AreaRetangulo.java` |
| 4 – Diferença de idade entre 2 pessoas | `Exercicio04DiferencaIdade.java` |

## O que eu aprendi aqui

### Ler dados do teclado com `Scanner`

- Crio o leitor assim:

    var scanner = new Scanner(System.in);

- Métodos que usei:
  - `next()` → lê **uma palavra** (até o primeiro espaço).
  - `nextLine()` → lê a **linha inteira** (com espaços).
  - `nextInt()` → lê um **inteiro**.
  - `nextDouble()` → lê um número com **ponto/vírgula**.

- No exercício 4, se eu uso `nextInt()` e depois `nextLine()`, preciso cuidar do **Enter** que sobra no buffer.  
  A solução é chamar um `scanner.nextLine()` extra entre eles para limpar.

- No final, fecho o scanner:

    scanner.close();

### Mostrar mensagens na tela

- `System.out.println()` → imprime e **pula linha**.
- `System.out.print()` → imprime **sem** pular linha.
- `System.out.printf()` → imprime com **formatação**, por exemplo:

    System.out.printf("Olá %s você tem %s anos%n", nome, idade);

Onde:
- `%s` é um placeholder para valor (o Java converte para texto).
- `%n` quebra a linha.

### Cálculos e operadores

- Idade = `anoAtual - anoNascimento`.
- Área do quadrado = `lado * lado`.
- Área do retângulo = `base * altura`.
- Diferença de idade:

    var diferencaAges = Math.abs(age1 - age2);

Usei `Math.abs()` para garantir que a diferença fica **sempre positiva**, sem precisar de `if`.

### Descobrir o ano atual sozinho

No exercício 1 dá para pegar o ano atual do sistema:

- Import:

    import java.time.OffsetDateTime;

- Uso:

    var anoAtual = OffsetDateTime.now().getYear();

Assim não preciso trocar o ano manualmente todo ano.

### `var` para inferência de tipo

- Em vez de escrever `int idade = 20;`, posso escrever:

    var idade = 20;

- O Java descobre o tipo com base no valor:
  - `20` → `int`
  - `20.0` → `double`
  - `"texto"` → `String`
- `var` só funciona para **variáveis locais** (dentro de métodos) e sempre precisa de um valor na hora da declaração.

## Como eu executo estes exercícios

Estrutura das classes:

```text
02-fundamentos-java/
└── 02-fundamentos-linguagem-java/
    └── 06-exercicios/
        ├── Exercicio01Idade.java
        ├── Exercicio02AreaQuadrado.java
        ├── Exercicio03AreaRetangulo.java
        └── Exercicio04DiferencaIdade.java
