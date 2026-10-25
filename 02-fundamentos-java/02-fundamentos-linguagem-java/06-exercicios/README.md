# Exercícios – Fundamentos da Linguagem Java

Minhas anotações e soluções dos exercícios do curso **Fundamentos da Linguagem de Programação Java**.

## Enunciados

1. Receber o nome e o ano de nascimento de alguém e imprimir: "Olá 'Fulano' você tem 'X' anos".
2. Receber o lado de um quadrado, calcular a área e exibir.
    - área = lado × lado
3. Receber a base e a altura de um retângulo, calcular a área e exibir.
    - área = base × altura
4. Receber o nome e a idade de 2 pessoas e imprimir a diferença de idade entre elas.

## Soluções

| Exercício | Arquivo |
|-----------|---------|
| 1 – Idade a partir do ano de nascimento | [Exercicio01Idade.java](Exercicio01Idade.java) |
| 2 – Área do quadrado | [Exercicio02AreaQuadrado.java](Exercicio02AreaQuadrado.java) |
| 3 – Área do retângulo | [Exercicio03AreaRetangulo.java](Exercicio03AreaRetangulo.java) |
| 4 – Diferença de idade entre 2 pessoas | [Exercicio04DiferencaIdade.java](Exercicio04DiferencaIdade.java) |

## O que eu aprendi

### Ler dados do teclado (Scanner)
- Para ler o que o usuário digita, uso `new Scanner(System.in)`.
- `next()` lê só uma palavra, até o primeiro espaço.
- `nextLine()` lê a linha inteira, com espaços.
- `nextInt()` lê um número inteiro e `nextDouble()` lê um número com vírgula.
- Quando uso `nextInt()` e depois `nextLine()`, o "Enter" fica sobrando e o `nextLine()` lê uma linha vazia. A solução é colocar um `scanner.nextLine()` extra para limpar (exercício 4).
- Quando termino, fecho com `scanner.close()`.

### Pegar o ano atual
- `OffsetDateTime.now().getYear()` devolve o ano atual, então não preciso deixar o ano fixo no código.
- Para usar, preciso do `import java.time.OffsetDateTime;`.

### var
- Com `var`, o Java descobre o tipo da variável sozinho. Exemplo: `var idade = 20;` vira `int`.
- Só funciona dentro de métodos, e a variável precisa receber um valor na hora de criar.

### Mostrar na tela
- `System.out.println()` imprime e pula a linha.
- `System.out.print()` imprime sem pular a linha.
- `System.out.printf()` imprime com formatação: `%s` é onde entra o valor e `\n` pula a linha.
- Dá para juntar textos e variáveis com `+` (concatenação).

### Operadores e cálculos
- Idade = ano atual − ano de nascimento.
- Área do quadrado = lado × lado e área do retângulo = base × altura.
- Usei `double` nas áreas para aceitar números com vírgula, e `int` nas idades.
- `Math.abs()` devolve o número sempre positivo. Serve para a diferença de idade não ficar negativa, não importa quem seja mais velho.

## Observações

- Cada exercício tem sua própria classe com `main`, então dá para rodar cada um separado.
- Para rodar no IntelliJ, clico no ▶ ao lado do `main` e digito os valores no console.