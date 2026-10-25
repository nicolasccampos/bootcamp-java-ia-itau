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

  ```java
  var scanner = new Scanner(System.in);
