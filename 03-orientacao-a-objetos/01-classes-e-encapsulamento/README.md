# Classes e Encapsulamento

Esse é o primeiro bloco do módulo de Orientação a Objetos, parte do curso **Java e a Arte da Abstração com Classes e Encapsulamento**.

Aqui o foco foi entender como encapsular dados dentro de uma classe, controlar o acesso a esses dados e, na sequência, conhecer uma forma mais moderna e enxuta de fazer isso usando `record`.

---

## Estrutura da pasta

```text
01-classes-e-encapsulamento/
├── Criando-primeira-classe/
│   ├── Person.java
│   └── PersonStaticDemo.java
└── Trabalhando-com-Records/
    ├── MainRecords.java
    └── PersonSegundo.java
```

---

## Aula 1 — Criando a primeira classe

Nessa aula o objetivo foi criar uma classe `Person` do zero, aplicando encapsulamento de verdade: atributos `private`, acesso só por getters, e um construtor controlando como o objeto nasce.

```java
public class Person {

    private final String name;
    private int age;
    private int lastYearAgeInc = OffsetDateTime.now().getYear();

    public Person(String name) {
        this.name = name;
        this.age = 1;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void incAge() {
        if (lastYearAgeInc >= OffsetDateTime.now().getYear()) return;
        this.age += 1;
        this.lastYearAgeInc = OffsetDateTime.now().getYear();
    }
}
```

O que eu achei mais interessante aqui foi o método `incAge()`. Em vez de simplesmente somar 1 na idade sempre que o método é chamado, ele guarda em `lastYearAgeInc` o último ano em que a idade foi incrementada, e só deixa incrementar de novo se o ano atual for diferente. Isso evita que a idade suba mais de uma vez no mesmo ano, mesmo que o método seja chamado várias vezes.

Depois, em `PersonStaticDemo.java`, eu testei criando duas instâncias diferentes:

```java
public class PersonStaticDemo {
    public static void main(String[] args) {
        var male = new Person("João");
        var famele = new Person("Maria");

        System.out.println("Male name: " + male.getName() + " age: " + male.getAge());
        System.out.println("Famele name: " + famele.getName() + " age: " + famele.getAge());
    }
}
```

Esse exercício deixou bem claro a diferença entre dado privado (cada `Person` tem seu próprio `name` e `age`, isolados um do outro) e como só expor esse dado através de métodos públicos (`getName`, `getAge`) já é, na prática, o que chamamos de encapsulamento.

---

## Aula 2 — Trabalhando com Records

Essa aula mostrou uma forma bem mais direta de resolver o mesmo problema: usar `record` no lugar de uma classe tradicional.

```java
public record PersonSegundo(String name, int age) {

    public PersonSegundo {
        // construtor compacto, usado pra validação se precisar
    }

    public PersonSegundo(final String name) {
        this(name, 1);
    }

    public String getInfo() {
        return "Name: " + name + " age: " + age;
    }
}
```

E o teste:

```java
public class MainRecords {
    public static void main(String[] args) {
        var person = new PersonSegundo("João", 12);
        System.out.println(person.getInfo());
        System.out.println(person.name());
    }
}
```

Aqui dá pra ver bem a economia de código. Com `record`, o Java já gera sozinho:

- o construtor principal
- os getters (sem o prefixo `get`, só `person.name()`)
- `toString()`, `equals()` e `hashCode()`

Mesmo assim, ainda dá pra personalizar:

- o **construtor compacto** (`public PersonSegundo { ... }`), que entra antes dos campos serem atribuídos — ótimo pra validações
- **construtores extras**, como o que recebe só o `name` e delega pro construtor principal com `this(name, 1)`, definindo uma idade padrão
- métodos normais dentro do record, como o `getInfo()`

Comparando com a aula anterior, ficou evidente que um `record` é ideal quando a classe existe basicamente pra carregar dados (tipo um DTO), enquanto a abordagem tradicional com classe ainda faz mais sentido quando existe lógica de negócio mais elaborada, como aquele controle de incremento de idade por ano que fiz no `Person.java` da primeira aula.

---

## O que eu levo dessas duas aulas

- Encapsulamento não é só "deixar os atributos privados", é pensar em como o estado do objeto pode mudar com segurança
- Um construtor pode fazer mais do que só atribuir valores — ele pode definir regras de inicialização
- `record` não substitui toda classe, mas resolve muito bem os casos onde o objeto é, essencialmente, um conjunto de dados
- Construtor compacto e construtores alternativos dentro de um `record` dão flexibilidade sem perder a simplicidade

---

## Status

- [x] Criando a primeira Classe
- [x] Trabalhando com Records
- [ ] Questionário — Java e a Arte da Abstração com Classes e Encapsulamento
- [ ] Exercícios: Classes e Encapsulamento