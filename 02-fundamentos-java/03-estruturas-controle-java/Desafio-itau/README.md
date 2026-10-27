# Desafios de Código – Fundamentos do Java no Setor Bancário

Aqui estão reunidos os dois desafios de código do bloco de **Estruturas de Controle em Java**.

A ideia dessa pasta é guardar os enunciados, as soluções em Java e minhas anotações sobre o que pratiquei em cada desafio.

## Arquivos da pasta

- `Desafio01.java`
- `Desafio02.java`

---

## Desafio 1 – Validação de operação bancária

### Enunciado

No setor bancário, pequenas automações ajudam a evitar erros em tarefas repetitivas. Em uma agência, a equipe de atendimento recebe códigos de operação digitados por diferentes sistemas internos. Antes de seguir com o processamento, um programa simples deve verificar se o código informado representa uma operação válida para o caixa digital.

Você deve criar um programa que leia uma única palavra e verifique se ela é exatamente igual a `DEPOSITO`, `SAQUE` ou `TRANSFERENCIA`. Se for igual a uma dessas opções, a operação deve ser considerada válida. Caso contrário, ela deve ser considerada inválida.

A comparação deve respeitar exatamente os caracteres informados, incluindo letras maiúsculas e minúsculas. Assim, `deposito` e `DEPOSITO` devem ser tratados como valores diferentes.

### Entrada

A entrada contém uma única linha com uma string representando o código da operação bancária informado pelo sistema interno.

### Saída

Imprima `VALID` se a string for exatamente `DEPOSITO`, `SAQUE` ou `TRANSFERENCIA`. Caso contrário, imprima `INVALID`.

### O que eu pratiquei aqui

- leitura de texto com `Scanner`
- comparação exata de `String`
- uso de condição para validar uma entrada
- saída simples e objetiva, do jeito que o enunciado pede

---

## Desafio 2 – Comparação exata de códigos

### Enunciado

Em um banco digital, a equipe de atendimento está treinando novos desenvolvedores para automatizar verificações simples antes de liberar operações no sistema interno. Uma das primeiras tarefas é validar se um código de agência foi digitado corretamente pelos operadores.

Como o treinamento é voltado para fundamentos de Java, o objetivo é praticar leitura de entrada, comparação de strings e decisões condicionais.

Você deve criar um programa que leia dois textos: o código informado pelo operador e o código esperado pelo sistema. Se os dois textos forem exatamente iguais, o programa deve indicar que a validação foi aprovada. Caso contrário, deve informar que houve erro de digitação.

A comparação deve considerar todos os caracteres exatamente como foram recebidos, incluindo letras maiúsculas, minúsculas, números e símbolos. Não há necessidade de tratar espaços extras fora do que for lido como entrada.

### Entrada

A entrada contém duas linhas.  
A primeira linha possui o código informado pelo operador.  
A segunda linha possui o código esperado pelo sistema.  
Cada linha deve ser tratada como uma string completa.

### Saída

Exiba uma única linha.  
Se os códigos forem exatamente iguais, imprima `ACESSO LIBERADO`.  
Caso contrário, imprima `ACESSO NEGADO`.

### O que eu pratiquei aqui

- leitura de duas entradas com `Scanner`
- comparação exata de strings
- uso de `equals` para comparar texto em Java
- validação simples com `if` e `else`
- atenção à saída exata exigida pelo desafio

---

## O que eu aprendi nesse bloco

Esses desafios me ajudaram a reforçar pontos importantes da base de Java:

- ler entradas do console
- comparar textos da forma certa
- controlar fluxo com condições
- manter a saída exatamente como o enunciado pede
- pensar na solução de forma simples e objetiva

---

## Sobre minha abordagem

Esses códigos foram feitos por mim, usando a base que eu já tinha de outras linguagens e adaptando tudo para a sintaxe do Java.

A ideia aqui foi praticar a linguagem de forma direta, reforçando lógica, leitura de entrada, comparação de strings e boas práticas de organização.

---

## Observações

- Os desafios foram organizados no mesmo bloco porque fazem parte da mesma etapa do módulo.
- Cada desafio tem sua própria classe e sua própria solução.
- Os enunciados foram transcritos para ficar mais fácil revisar depois sem precisar voltar no vídeo ou na plataforma toda hora.