# Exercícios – Estruturas de Controle em Java

Esses são meus exercícios e anotações da aula **Estruturas de Controle em Java**.

## Enunciados

1. Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número.
2. Escreva um código onde o usuário entra com sua altura e peso, seja feito o cálculo do seu IMC (`IMC = peso / (altura * altura)`) e seja exibida a mensagem de acordo com o resultado:
   - Se for menor ou igual a 18,5 → `"Abaixo do peso"`
   - Se for entre 18,6 e 24,9 → `"Peso ideal"`
   - Se for entre 25,0 e 29,9 → `"Levemente acima do peso"`
   - Se for entre 30,0 e 34,9 → `"Obesidade Grau I"`
   - Se for entre 35,0 e 39,9 → `"Obesidade Grau II (Severa)"`
   - Se for maior que 40,0 → `"Obesidade III (Mórbida)"`
3. Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolha entre a opção par e ímpar. O código deve informar todos os números pares ou ímpares, de acordo com a escolha, no intervalo informado, incluindo os números informados e em ordem decrescente.
4. Escreva um código onde o usuário informa um número inicial. Depois, irá informar outros `N` números. A execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de 0 na divisão. Números menores que o primeiro número devem ser ignorados.

---

## Organização dos arquivos

| Exercício | Pasta | Arquivo principal |
|-----------|-------|------------------|
| 1 – Tabuada | `tabuada/` | `Tabuada.java` |
| 2 – IMC | `imc_classificacao/` | `ImcClassificacao.java` |
| 3 – Intervalo par ou ímpar | `intervalo_par_ou_impar/` | `IntervaloParOuImpar.java` |
| 4 – Divisão condicional | `divisao_condicional/` | `DivisaoCondicional.java` |

---

## O que eu aprendi em cada exercício

### 1. Tabuada

- usei `for` para repetir de 1 até 10
- aprendi a montar a saída no console de forma organizada
- entendi melhor o uso do contador dentro do laço

### 2. IMC

- trabalhei com `double`
- usei `Scanner` para ler valores com casas decimais
- usei `if`, `else if` e `else` para classificar o IMC por faixa
- entendi melhor a fórmula do IMC

### 3. Intervalo par ou ímpar

- usei `switch` para separar a escolha do usuário
- usei `for` em ordem decrescente
- usei `if` dentro do laço para filtrar só par ou só ímpar
- validei se o segundo número era maior que o primeiro

### 4. Divisão condicional

- usei `while` para continuar pedindo números
- ignorei números menores que o inicial
- usei o resto da divisão para descobrir quando parar
- entendi melhor como controlar a saída do laço

---

## Sobre meus códigos

Todos os códigos feitos até aqui são autorais.

Eu escolhi não depender de IA durante os estudos porque os conceitos de estruturas de controle eu já tinha visto em outras linguagens, como JavaScript, C, C++ e C#. Então aqui a ideia foi reforçar o que eu já sabia, aprender a sintaxe do Java e escrever os exercícios do meu jeito, com mais atenção para organização, legibilidade e boas práticas.

---

## Observações

- Cada exercício ficou em sua própria pasta.
- Isso me ajudou a organizar melhor os arquivos e executar tudo no IntelliJ.
- Os enunciados foram transcritos da aula e anotados aqui para eu não precisar voltar no vídeo toda hora.

---

## Certificado

[![Certificado - Estruturas de Controle em Java](https://hermes.dio.me/certificates/3CZPGSBD.png)](https://hermes.dio.me/certificates/3CZPGSBD.pdf)
