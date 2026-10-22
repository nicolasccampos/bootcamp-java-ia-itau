#  Introdução ao Java e seu Ambiente de Desenvolvimento

Primeiras aulas do **Módulo 2** do Bootcamp Java & IA (Itaú + DIO), com foco na configuração do ambiente necessário para desenvolver em Java: JDK, gerenciadores de build e IDEs.

---

##  Conteúdos estudados

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

>  Em ambos os casos, o curso recomenda o uso do **SDKMAN!** para gerenciar versões, mas a instalação manual é útil em cenários como servidores, onde se quer uma versão fixa.

---

### 4. Instalação de IDEs e Execução do Primeiro Programa Java
- Apresentação de três IDEs possíveis para desenvolvimento Java: **Eclipse**, **VSCode** e **IntelliJ IDEA**.
- Execução do primeiro programa Java diretamente no IntelliJ e no VSCode.

> Já utilizo o **IntelliJ IDEA** como IDE principal, então não houve necessidade de testar as demais alternativas apresentadas no curso.

---

## Aprendizados principais

- O ambiente de desenvolvimento Java é formado por três peças centrais: **JDK** , **gerenciador de build**  e **IDE**.
- Maven e Gradle resolvem o mesmo problema de formas diferentes: Maven prioriza padronização via XML, enquanto Gradle prioriza flexibilidade via scripts.
- Entender esse isso antes de começar evita bastante dor de cabeça nos, principalmente ao lidar com projetos Spring Boot.

---

##  Ambiente configurado

- **JDK:** _(preencher: versão e distribuição utilizada)_
- **Gerenciador de Build:** Maven e Gradle instalados e validados via terminal.
- **IDE:** IntelliJ IDEA.

---

## Próximos passos

Aprender mais dos fundamentos da sintaxe da linguagem Java (variáveis, tipos de dados, estruturas condicionais e de repetição).
