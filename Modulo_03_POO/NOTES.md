# Módulo 3: Programação Orientada a Objetos

Agora, você aprenderá um novo nível de capacidade através da programação orientada a objetos.

* Classes vs. Objetos
* Atributos e Métodos
* Métodos Estáticos
* Herança
* Override vs Overload
* Classes Abstratas
* Interfaces

## Classes vs. Objetos

* Existem diferentes paradigmas de programação. À medida que você aprende outras linguagens, começará a reconhecer padrões como esses.
* Até este ponto, você trabalhou proceduralmente, passo a passo.
* A programação orientada a objetos (OOP) é uma solução convincente para problemas relacionados à programação.
* Para começar, digite `code Student.java` na janela do terminal e digite o seguinte:

    ```
    import java.util.Scanner;

    public class Student {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Qual é o seu nome?");
            String name = sc.nextLine();

            System.out.println("Qual é a sua casa?");
            String house = sc.nextLine();

            sc.close();

            System.out.println("Olá, " + name + " da casa " + house + "!");
        }

    }
    ```

* Note que este programa segue um paradigma procedural, passo a passo: Muito parecido com o que você viu nas partes anteriores deste curso.
* Baseando-se no nosso trabalho das semanas anteriores, podemos criar funções para abstrair partes deste programa.

    ```
    import java.util.Scanner;

    public class Student {

        public String name;
        public String house;

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Olá, " + getName(sc) + " da casa " + getHouse(sc) + "!");

            sc.close();
        }

        public static String getName(Scanner sc) {
            System.out.println("Qual é o seu nome?");
            String nameInput = sc.nextLine();

            return nameInput;
        }

        public static String getHouse(Scanner sc) {
            System.out.println("Qual é a sua casa?");
            String houseInput = sc.nextLine();

            return houseInput;
        }

        public static Student getStudent(Scanner sc) {
            Student student = new Student();

            student.name = getName(sc);
            student.house = getHouse(sc);

            return student;
        }

    }
    ```

* Note que, por convenção, `Student` está capitalizado. Além disso, observe que em `getStudent`, podemos criar um aluno da classe `Student` usando a sintaxe `Student student = new Student()`. Além disso, note que utilizamos a "notação de ponto" para acessar atributos dessa variável `student` da classe `Student`.
* A programação orientada a objetos incentiva você a encapsular toda a funcionalidade de uma classe dentro da definição da classe.
* Sempre que você cria uma classe e utiliza esse modelo para criar algo, você cria o que é chamado de "objeto" ou uma "instância". No caso do nosso código, `student` é um objeto.
Além disso, podemos definir alguns fundamentos para os atributos esperados dentro de um objeto cuja classe é `Student`. Podemos modificar nosso código da seguinte maneira:

    ```
    public class Student {

        private String name;
        private String house;

        public Student(String name, String house) {
            this.name = name;
            this.house = house;
        }

        public String getName() {
            return this.name;
        }

        public String getHouse() {
            return this.house;
        }
        
    }
    ```

## Atributos e Métodos

* Note que dentro de `Student`, padronizamos os **atributos** dessa classe. Podemos criar uma função dentro da classe `Student`, chamada de **método**, que determina o comportamento de um objeto da classe `Student`. Dentro desta função, ela recebe o `name` e `house` passados para ela e atribui essas variáveis a este objeto.
* Além disso, observe como o construtor `Student student = new Student(String name, String house)` chama essa função dentro da classe `Student` e cria um objeto `student`. Isso pode ser feito em outra classe da seguinte maneira:

    ```
    import java.util.Scanner;

    public class Hogwarts {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Qual é o seu nome?");
            String name = sc.nextLine();

            System.out.println("Qual é a sua casa?");
            String house = sc.nextLine();

            sc.close();

            Student student = new Student(name, house);

            System.out.println("Olá, " + student.getName() + " da casa " + student.getHouse() + "!");
        }
        
    }
    ```

## Métodos Estáticos

* Acontece que, além dos métodos de classe, existem outros tipos de métodos.
* Usar `static` pode ser algo que você queira explorar, pois está relacionado a toda a classe em vez de um objeto em si.

    ```
    public class Student {

        private String name;
        private String house;
        private static int number = 0;

        public Student(String name, String house) {
            this.name = name;
            this.house = house;
            number++;
        }

        public String getName() {
            return this.name;
        }

        public String getHouse() {
            return this.house;
        }

        public static int getNumberOfStudents() {
            return number;
        }
        
    }
    ```

* Note que `number` é um atributo estático, cujo valor será incrementado em 1 quando um novo objeto `Student` for criado. O `getNumberOfStudents()` por sua vez retornará o número de objetos `Student` criados, que pode ser chamado na classe `Hogwarts`, como segue:
    
    ```
    import java.util.Scanner;

    public class Hogwarts {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Qual é o seu nome?");
            String name = sc.nextLine();

            System.out.println("Qual é a sua casa?");
            String house = sc.nextLine();

            sc.close();

            Student student = new Student(name, house);

            System.out.println("Olá, " + student.getName() + " da casa " + student.getHouse() + "!");

            Student student2 = new Student("Hermione", "Grifinória");

            System.out.println("Olá, " + student2.getName() + " da casa " + student2.getHouse() + "!");

            System.out.println("Número de alunos: " + Student.getNumberOfStudents());

        }
        
    }
    ```

## Herança

* Herança é, talvez, o recurso mais poderoso da programação orientada a objetos.
* Acontece que você pode criar uma classe que "herda" métodos, variáveis e atributos de outra classe.
* No terminal, execute `code Wizard.java`. Digite o seguinte:

    ```
    public class Wizard {

        private String name;

        public String getName() {
            return this.name;
        }
        
    }
    ```

* O mesmo para a classe `Professor`:

    ```
    public class Professor {
    
        private String name;
        private String subject;

        public String getName() {
            return this.name;
        }

        public String getSubject() {
            return this.subject;
        }

    }
    ```

* Note que existe uma classe acima chamada `Wizard` e uma classe chamada `Student`. Além disso, observe que há uma classe chamada `Professor`. Tanto os alunos quanto os professores têm nomes. Além disso, tanto os alunos quanto os professores são bruxos. Portanto, tanto `Student` quanto `Professor` herdam as características de `Wizard`.
* Isso pode ser expresso pela instrução `extends`, conforme segue:
    
    ```
    public class Professor extends Wizard {
    
        private String subject;

        public String getSubject() {
            return this.subject;
        }

    }
    ```
    ```
    public class Student extends Wizard {

        private String house;
        private static int number = 0;

        public Student(String name, String house) {
            Wizard wizard = new Wizard();
            wizard.setName(name);
            
            this.house = house;
            number++;
        }

        public String getHouse() {
            return this.house;
        }

        public static int getNumberOfStudents() {
            return number;
        }
        
    }
    ```

## Override vs Overload

* Alguns métodos de classe da classe herdada podem ser "sobrescritos" para que tenham outro comportamento.
* Por exemplo, vamos incluir um método `castSpell()`, conforme segue:

    ```
    public class Wizard {

        private String name;

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String castSpell() {
            return "Expelliarmus!";
        }
        
    }
    ```

* Note como este método retorna o feitiço `Expelliarmus`. 
* Vamos Override este método nas classes filhas, como:

    ```
    public class Student extends Wizard {

        private String house;
        private static int number = 0;

        public Student(String name, String house) {
            Wizard wizard = new Wizard();
            wizard.setName(name);

            this.house = house;
            number++;
        }

        public String getHouse() {
            return this.house;
        }

        public static int getNumberOfStudents() {
            return number;
        }

        @Override
        public String castSpell() {
            return "Expecto Patronum!";
        }
        
    }
    ```
    ```
   

 public class Professor extends Wizard {
        
        private String subject;

        public String getSubject() {
            return this.subject;
        }

        @Override
        public String castSpell() {
            return "Stupefy!";
        }

    }
    ```

* Note que os feitiços esperados para os objetos `Student` e `Professor` devem ser `Expecto Patronum` e `Stupefy`, respectivamente.
* Por outro lado, podemos "sobrecarregar" um método dentro de uma mesma classe, o que significa que podemos ter um mesmo nome de método, mas com parâmetros diferentes, de modo que tenha comportamentos diferentes.
* Por exemplo, podemos criar outro método `castSpell`, mas agora com um parâmetro de entrada `String spell`, como segue:
    
    ```
    public class Wizard {

        private String name;

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String castSpell() {
            return "Expelliarmus!";
        }

        public String castSpell(String spell) {
            return spell;
        }
        
    }
    ```

* Isso significa que `castSpell(String spell)` será chamado quando uma entrada `spell` for passada como parâmetro. Caso contrário, `castSpell()` será chamado.

## Classes Abstratas

* Uma classe abstrata é uma classe declarada como `abstract` — ela pode ou não incluir métodos abstratos.
* Classes abstratas não podem ser instanciadas, mas podem ser subclassificadas.
* Quando uma classe abstrata é subclassificada, a subclasse geralmente fornece implementações para todos os métodos abstratos na sua classe pai.
* Vamos modificar a classe `Wizard` para ser uma classe abstrata e incluir um método abstrato `preparePotion()`, conforme segue:

    ```
    public abstract class Wizard {

        private String name;

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String castSpell() {
            return "Expelliarmus!";
        }

        public String castSpell(String spell) {
            return spell;
        }

        public abstract void preparePotion();
        
    }
    ```

* As classes filhas de `Wizard` devem então implementar o método `preparePotion()`, como:

    ```
    public class Student extends Wizard {

        private String house;
        private static int number = 0;

        public Student(String name, String house) {
            this.house = house;
            number++;
        }

        public String getHouse() {
            return this.house;
        }

        public static int getNumberOfStudents() {
            return number;
        }

        @Override
        public String castSpell() {
            return "Expecto Patronum!";
        }

        @Override
        public void preparePotion() {
            System.out.println("Amortentia preparada!");
        }
        
    }
    ```

    ```
    public class Professor extends Wizard {
        
        private String subject;

        public String getSubject() {
            return this.subject;
        }

        @Override
        public String castSpell() {
            return "Stupefy!";
        }

        @Override
        public void preparePotion() {
            System.out.println("Veritaserum preparada!");        
        }

    }
    ```

## Interface

* Interfaces são semelhantes a classes abstratas. No entanto, elas não contêm atributos, mas apenas métodos abstratos, que devem ser implementados por outras classes.
* Vamos criar uma interface `MagicalCreature.java`, conforme segue:

    ```
    public interface MagicalCreature {

        public String describeItsMagicalFeature();
        
    }
    ```

* Quando criamos novas classes, como `Dragon` e `Elf`, que são criaturas mágicas, devemos incluir a palavra reservada `implements`. Isso significa que o método `describeItsMagicalFeature()` deve ser implementado por essas classes.

    ```
    public class Dragon implements MagicalCreature {

        @Override
        public String describeItsMagicalFeature() {
            return "Um dragão cospe fogo.";
        }
        
    }
    ```
    ```
    public class Elf implements MagicalCreature {

        @Override
        public String describeItsMagicalFeature() {
            return "Um elfo protege seu ouro.";
        }
        
    }
    ```
