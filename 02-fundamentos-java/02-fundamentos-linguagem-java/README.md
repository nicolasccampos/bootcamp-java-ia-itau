# Fundamentos da Linguagem de Programação Java

Minhas anotações do curso **Fundamentos da Linguagem de Programação Java**.

Aqui comecei a entrar mesmo na sintaxe da linguagem: variáveis, tipos, operadores e exercícios simples com entrada via teclado.

## Estrutura desta pasta

- [`01-padroes-desenvolvimento-conceitos/`](01-padroes-desenvolvimento-conceitos)  
  Conceitos iniciais e padrões usados nos exemplos:
  - estrutura básica de uma classe Java;
  - método `main`;
  - boas práticas de nomes:
    - classes em `CamelCase`;
    - variáveis e métodos em `camelCase`;
  - comentários de código (`//` e `/* ... */`).

- [`02-keywords-tipos-primitivos/`](02-keywords-tipos-primitivos)  
  Estudo de **palavras reservadas** (keywords) e **tipos primitivos**:
  - `int`, `double`, `float`, `boolean`, `char`, `byte`, `short`, `long`;
  - `String` como tipo de referência mais usado;
  - declaração e inicialização de variáveis;
  - conversões (casting) entre tipos numéricos;
  - uso de `var` para inferência de tipo local (Java 10+).

- [`03-operadores-atribuicao-logicos/`](03-operadores-atribuicao-logicos)  
  Operadores de:
  - **atribuição**: `=`, `+=`, `-=`, `*=`, `/=`, `%=`;  
  - **comparação**: `>`, `<`, `>=`, `<=`, `==`, `!=`;
  - **lógicos**: `&&` (E), `||` (OU), `!` (negação).  
  Também vi como combinar comparações com operadores lógicos dentro de `if`.

- [`04-operadores-aritmeticos/`](04-operadores-aritmeticos)  
  Operadores numéricos em Java:
  - soma, subtração, multiplicação, divisão: `+`, `-`, `*`, `/`;
  - resto da divisão: `%`;
  - operadores de incremento/decremento: `++` e `--`;
  - precedência de operações (ordem de cálculo) e uso de parênteses.

- [`05-operadores-bitwise/`](05-operadores-bitwise)  
  Operadores bit a bit:
  - `&` (AND), `|` (OR), `^` (XOR), `~` (NOT);
  - deslocamentos: `<<`, `>>`, `>>>`;  
  Vi como esses operadores funcionam com inteiros e como visualizar o resultado usando `Integer.toBinaryString`.

- [`06-exercicios/`](06-exercicios)  
  Exercícios usando tudo o que foi visto até aqui:
  1. Ler **nome** e **ano de nascimento** e mostrar a idade atual.
  2. Calcular a **área de um quadrado** a partir do lado.
  3. Calcular a **área de um retângulo** (base × altura).
  4. Ler nome e idade de **2 pessoas** e mostrar a **diferença de idade**.  
     
  Os exercícios usam:
  - `Scanner` para ler dados do usuário;
  - operadores aritméticos;
  - `System.out.println` e `System.out.printf`.  

  Mais detalhes estão no [`README.md` dessa pasta](06-exercicios/README.md).

## Principais conceitos que pratiquei aqui

- Declaração de variáveis e tipos primitivos.
- Uso de `var` para inferência de tipo local.
- Operadores:
  - aritméticos;
  - de atribuição;
  - comparativos;
  - lógicos;
  - bitwise.
- Leitura de entrada pelo teclado com `Scanner`:
  - `next()`, `nextLine()`, `nextInt()`, `nextDouble()`;
  - cuidado com o `nextLine()` depois de `nextInt()` (limpar o buffer).
- Impressão de dados:
  - `System.out.println` / `System.out.print`;
  - `System.out.printf` com placeholders (`%s`, `%d`, `%f`) e `\n`.

## Certificado

[![Certificado - Fundamentos da Linguagem de Programação Java](https://hermes.dio.me/certificates/GOEBQPBV.png)](https://hermes.dio.me/certificates/GOEBQPBV.pdf)
