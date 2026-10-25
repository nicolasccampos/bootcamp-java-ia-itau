# Estruturas de Controle em Java

Minhas anotações da aula **Estruturas de Controle em Java**.

Aqui foquei em **decisões** e **repetições**: `if`, `switch`, `for`, `while` e `do while`.

## Estrutura desta pasta

- [`01-if-else-else-if/`](01-if-else-else-if)  
  Exemplos de:
  - `if` simples;
  - `if/else`;
  - `if/else if/else`.  
  Usei muito operadores de comparação (`>`, `<`, `>=`, `<=`, `==`, `!=`) e operadores lógicos (`&&`, `||`, `!`) para montar condições.

- [`02-switch-case/`](02-switch-case)  
  Uso de `switch` para vários caminhos diferentes a partir de um único valor:
  - exemplos com números (dia da semana) e letras (menu);
  - importância do `break` para não “cair” nos próximos `case`;
  - uso do `default` para tratar valores inesperados.

- [`03-for/`](03-for)  
  Estrutura de repetição `for`:
  - loops contadores, quando sei quantas vezes quero repetir;
  - contagens crescentes e decrescentes;
  - saltos com `i += 2`, etc.;
  - reforço dos três blocos do `for`: inicialização; condição; incremento.

- [`04-while-do-while/`](04-while-do-while)  
  Estruturas:
  - `while`: testa a condição **antes** de executar o bloco;
  - `do while`: executa o bloco **pelo menos uma vez** e testa a condição no final.  
  Também vi exemplos que mostram a diferença quando a condição já começa falsa e o cuidado para não criar **loop infinito**.

- [`05-exercicios/`](05-exercicios)  
  Pasta separada para os exercícios dessa aula (lista de enunciados e soluções).  
  As anotações ficam no [`README.md` dessa pasta](05-exercicios/README.md).

## Resumo do que aprendi

### Decisões

- **`if`, `else`, `else if`**:
  - usados quando preciso tomar decisões com base em uma condição booleana;
  - boa prática: manter as condições legíveis (evitar expressões gigantes).

- **`switch case`**:
  - alternativa para vários `if/else if` baseados na mesma variável;
  - usado com tipos como `int`, `char`, `String` (a partir de certas versões do Java);
  - sempre lembrar dos `break` para não encadear casos sem querer.

### Repetições

- **`for`**:
  - ideal para laços com contador;
  - muito usado para percorrer intervalos numéricos.

- **`while`**:
  - “enquanto” a condição for verdadeira, o laço continua;
  - a condição é verificada no início.

- **`do while`**:
  - sempre executa **pelo menos uma vez**;
  - checa a condição no final do bloco.

Em todos os laços, é importante:
- atualizar a variável de controle dentro do laço;
- garantir uma condição de parada clara para não travar o programa.

## Próximos passos

- Completar e documentar os exercícios em [`05-exercicios/`](05-exercicios).
- Voltar nos exemplos e testar variações:
  - outras condições em `if`;
  - mais casos em `switch`;
  - laços com diferentes incrementos e condições.
