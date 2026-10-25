# Introdução ao Java e seu Ambiente de Desenvolvimento

Minhas anotações do curso **Introdução ao Java e seu Ambiente de Desenvolvimento**.

## O que configurei

- Instalação do **Java (JDK)**.
- Instalação e primeiros passos com o **IntelliJ IDEA**.
- Criação de um **projeto Java** e primeiros arquivos `.java`.
- Execução de programas:
  - direto pela IDE (botão ▶);
  - visualização da saída no console.
- Noções iniciais de:
  - estrutura de um programa Java (`class`, `main`, `System.out.println`);
  - organização em pastas/projeto.

## Estrutura desta pasta

- [`00-hello-world/`](00-hello-world)  
  Meu primeiro programa em Java. Focado em:
  - entender a estrutura mínima:
    - `public class HelloWorld { ... }`
    - `public static void main(String[] args) { ... }`
  - usar `System.out.println` para imprimir mensagens no console.

- [`first-program-java/`](first-program-java)  
  Primeiro programa um pouco mais completo, baseado no que foi mostrado na aula:
  - uso de `Scanner` para ler dados do teclado;
  - captura de argumentos/entradas;
  - uso de **debug** no IntelliJ (breakpoints, step over etc.);
  - impressão formatada no console (`System.out.printf`).

Cada subpasta tem o seu próprio `README.md` explicando melhor o que o código faz (prints, prints de tela etc.).

## Anotações rápidas sobre o IntelliJ

- Atalho para criar o `main`: digitar `psvm` e apertar `Tab`/`Enter`.
- Atalho para `System.out.println`: digitar `sout` e apertar `Tab`/`Enter`.
- Para rodar um programa:
  - clicar no ▶ ao lado do `main`;
  - ou usar o menu **Run > Run 'NomeDaClasse'**.
- Marcar a pasta onde estão os `.java` como **Sources Root**:
  - botão direito na pasta → `Mark Directory as > Sources Root`.

## Certificado

[![Certificado - Introdução ao Java e seu Ambiente de Desenvolvimento](https://hermes.dio.me/certificates/7IKZD5JA.png)](https://hermes.dio.me/certificates/7IKZD5JA.pdf)
