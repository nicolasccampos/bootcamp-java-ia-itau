# Estruturas de Controle em Java

Minhas anotações da aula **Estruturas de Controle em Java**.

Nesta etapa estudei as estruturas mais usadas para tomada de decisão e repetição em Java.

## Conteúdo da aula

1. Estrutura condicional `if`, `else` e `else if`
2. Estrutura condicional `switch case`
3. Estrutura de repetição `for`
4. Estruturas de repetição `while` e `do while`
5. Exercícios práticos

---

## If, else e else if

- Usados para **tomar decisões** no código.
- A condição do `if` sempre precisa resultar em `true` ou `false`.
- Operadores de comparação:
  - `>`, `<`, `>=`, `<=`, `==`, `!=`
- Operadores lógicos:
  - `&&` (E), `||` (OU), `!` (negação)

Formas básicas:

- `if (condicao) { ... }`
- `if (condicao) { ... } else { ... }`
- `if (cond1) { ... } else if (cond2) { ... } else { ... }`

Exemplos dessa parte foram usados em classificações como:
- maior ou menor de idade;
- faixas de nota;
- validações de entrada.

---

## Switch case

- Serve quando tenho **vários casos possíveis** para o mesmo valor.
- Ajuda a evitar muitos `if / else if`.
- Sintaxe básica:

  ```java
  switch (variavel) {
      case "A":
          // código
          break;
      case "B":
          // código
          break;
      default:
          // código padrão
  }
