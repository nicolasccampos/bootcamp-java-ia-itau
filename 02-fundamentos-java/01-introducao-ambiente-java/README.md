# Introdução ao Java e seu Ambiente de Desenvolvimento

Primeiras aulas do **Módulo 2** do Bootcamp Java & IA (Itaú + DIO), com foco na configuração do ambiente necessário para desenvolver em Java: JDK, gerenciadores de build, IDEs e a execução dos primeiros programas.

---

## Conteúdos estudados

### 1. Introdução
- Apresentação do curso e do instrutor.
- História e evolução da linguagem Java, desde sua criação até as versões atuais (LTS).

---

### 2. Configuração do Ambiente Java
- O que é o **JDK (Java Development Kit)** e por que ele é necessário para compilar e executar código Java.
- Diferentes formas de instalação do JDK:
  - Instalador oficial da **Oracle** (Windows).
  - **Amazon Corretto** via terminal (Linux).
  - Gerenciador de versões **SDKMAN!** (Linux), que permite alternar entre diferentes versões de JDK facilmente.

---

### 3. Gerenciadores de Build

#### O que é "Build"?
Processo de transformar código-fonte (`.java`) em algo executável/distribuível. Envolve:
- Compilação dos arquivos `.java` em `.class`;
- Gerenciamento e download de dependências externas;
- Execução de testes automatizados;
- Empacotamento final (`.jar` ou `.war`).

#### O que é um Gerenciador de Build?
Ferramenta que automatiza todo esse processo, evitando que ele seja feito manualmente.

#### Maven
- Ferramenta tradicional, muito usada no mercado corporativo.
- Segue o princípio de **"convenção sobre configuração"**.
- Usa arquivos **XML** (`pom.xml`) para definir dependências e etapas do build.
- Instalação manual no Windows: configuração da variável `MAVEN_HOME` e inclusão de `%MAVEN_HOME%\bin` no `Path`.
- Validação: `mvn -version`.

#### Gradle
- Ferramenta mais moderna e flexível.
- Usa scripts em **Groovy** ou **Kotlin** (`build.gradle`), permitindo configurações mais personalizadas.
- Instalação manual no Windows: configuração da variável `GRADLE_HOME` e inclusão de `%GRADLE_HOME%\bin` no `Path`.
- Validação: `gradle -v`.

> Em ambos os casos, o curso recomenda o uso do **SDKMAN!** para gerenciar versões, mas a instalação manual é útil em cenários como servidores, onde se deseja uma versão fixa.

---

### 4. Instalação de IDEs e Execução do Primeiro Programa Java

- Instalação das IDEs sugeridas pelo curso: **Eclipse**, **VSCode** e **IntelliJ IDEA**.
- No meu caso, foquei no **IntelliJ IDEA**, que já utilizo como IDE principal.
- Execução do primeiro **Hello World** no IntelliJ, apenas para validar a estrutura do projeto e a configuração do ambiente.
- Em seguida, desenvolvimento de um **primeiro programa um pouco mais completo**, ainda na mesma aula, explorando:
  - uso de variáveis;
  - passagem de argumentos via `String[] args`;
  - execução e depuração (debug) no IntelliJ.

---

### 5. Exercícios práticos desta aula

Esta aula gerou dois pequenos exercícios organizados no repositório:

#### 🔹 00 - Hello World (Instalação do IntelliJ e primeiro teste)

Exercício associado à parte **“Instalando IntelliJ / executando primeiro programa no IntelliJ”**.  
Serve para validar:

- se o JDK está configurado corretamente;
- se o IntelliJ está compilando e executando o projeto;
- a estrutura mínima de um programa Java.

📂 [Ver exercício](./00-hello-world/README.md)

---

#### 🔹 01 - Primeiro Programa Java (Executando Primeiro Programa Java)

Exercício associado à parte **“Executando primeiro programa no IntelliJ”** da mesma aula.  
Aqui foi criado um programa um pouco mais elaborado, com:

- impressão de mensagens no console;
- uso de variável `msg`;
- leitura de argumentos via `String[] args`;
- configuração de argumentos na Run Configuration;
- uso de **Debug**, visualização de variáveis e *Evaluate Expression* no IntelliJ.

📂 [Ver exercício](./first-program-java/README.md)

---

## 🎓 Certificado da aula

Concluí o curso **“Introdução ao Java e seu Ambiente de Desenvolvimento”**, parte do Módulo 2 do bootcamp.

[![Certificado DIO](https://img.shields.io/badge/Certificado-DIO-6C00FF?style=for-the-badge&logoColor=white)](https://hermes.dio.me/certificates/7IKZD5JA.pdf)

---

## Aprendizados principais

- O ambiente de desenvolvimento Java é formado por três peças centrais: **JDK**, **gerenciador de build** e **IDE**.
- Maven e Gradle resolvem o mesmo problema de formas diferentes: Maven prioriza padronização via XML, enquanto Gradle prioriza flexibilidade via scripts.
- Os primeiros exercícios com **Hello World** e o **primeiro programa com argumentos/debug** ajudam a consolidar:
  - a estrutura básica de um programa Java;
  - o fluxo completo de compilar, executar e depurar código no IntelliJ IDEA.

---

## Ambiente configurado

- **JDK:** Oracle JDK 25 (LTS), instalado via site oficial da Oracle. A versão 25 foi escolhida em vez da 21 por não exigir licença comercial para uso em desenvolvimento/produção até aproximadamente 2028–2030.
- **Gerenciador de Build:** Maven instalado manualmente via [site oficial](https://maven.apache.org/download.cgi); Gradle instalado seguindo o mesmo processo.
- **IDE:** IntelliJ IDEA, instalado via site oficial da [JetBrains](https://www.jetbrains.com/idea/).

---

## Próximos passos

Aprofundar os fundamentos da sintaxe da linguagem Java (variáveis, tipos de dados, operadores, estruturas condicionais e de repetição) e evoluir para exercícios mais completos nos próximos cursos do módulo.
