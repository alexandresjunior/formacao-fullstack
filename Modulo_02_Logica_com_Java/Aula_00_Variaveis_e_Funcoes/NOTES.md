# Módulo 2: Lógica de Programação Algorítmica com Java

## Introdução

Nesta aula, você aprenderá habilidades que usará inúmeras vezes em seus próprios programas, como...

* Criar seus primeiros programas na linguagem Java;
* Funções;
* Bugs;
* Variáveis;
* Comentários;
* Pseudocódigo;
* Strings;
* Parâmetros;
* Strings formatadas;
* Inteiros;
* Princípios de legibilidade;
* Floats e Doubles;
* Criar suas próprias funções; e
* Valores de retorno.

## Criando Código com Java

* [Visual Studio Code](https://code.visualstudio.com/download) é um tipo especial de editor de texto chamado **compilador**. Na parte superior, você verá um editor de texto e, na parte inferior, verá um terminal onde pode executar comandos.
* No terminal, você pode executar `code hello.java` para começar a codificar.
* No editor de texto, você pode digitar:
    ```
    public class HelloWorld {
        public static void main(String[] args) {
            System.out.println("Hello, world!");
        }
    }
    ``` 
    Este é um famoso programa canônico que quase todos os programadores escrevem durante seu aprendizado.
* Na janela do terminal, você pode executar comandos. Para executar este programa, você precisará mover o cursor para a parte inferior da tela, clicando na janela do terminal. Agora você pode digitar um segundo comando na janela do terminal. Ao lado do sinal de dólar, digite `javac hello.java` e pressione a tecla Enter no seu teclado.
* Lembre-se, computadores realmente só entendem zeros e uns. Portanto, quando você executa `javac hello.java`, o Java compilará o texto que você criou em `hello.java` e o traduzirá em zeros e uns que o computador pode entender (**bytecode**).
* Um **compilador** é um aplicativo que traduz programas da linguagem Java para uma linguagem mais adequada para execução no computador. Ele recebe um arquivo de texto com a extensão `.java` como **entrada** (seu programa) e produz um arquivo com a extensão `.class` (a versão na linguagem do computador).
* Depois de compilar seu programa, você pode executá-lo. Esta é a parte emocionante, onde o computador segue suas instruções. Para executar o programa `HelloWorld`, digite o seguinte na janela do terminal: `java HelloWorld`. Se tudo correr bem, você deve ver a seguinte resposta `Hello, World`.
* Parabéns! Você acabou de criar seu primeiro programa.

## Funções

* Funções são verbos ou **ações** que o computador ou a linguagem de programação já sabem como executar.
* No seu programa `hello.java`, a função `System.out.println` sabe como imprimir na janela do terminal.
* A função `System.out.println()` recebe argumentos. Neste caso, `"Hello, world!"` são os argumentos que a função `System.out.println()` recebe.

## Bugs

* Bugs são uma parte natural da codificação. Estes são erros, problemas para você resolver! Não desanime! Isso faz parte do processo de se tornar um grande programador.
* Imagine que no nosso programa `hello.java` digitamos acidentalmente `System.out.println("Hello, world"` note que esquecemos o `)` final exigido pelo compilador. Se eu cometer este erro de propósito, o compilador exibirá um erro na janela do terminal!
* Frequentemente, as mensagens de erro informarão sobre seu erro e fornecerão pistas sobre como corrigi-los. No entanto, haverá muitas vezes que o compilador não será tão gentil.

## Melhorando Seu Primeiro Programa em Java

* Podemos personalizar seu primeiro programa em Java.
* No nosso editor de texto em `hello.java`, podemos chamar outra função dentro do método `main`:

    ```
    public class HelloWorld {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Digite seu nome: ");
            System.out.println("Hello, world!");
            
            sc.close();
        }
    }
    ```

    `sc` é um objeto (mais detalhes na seção [Programação Orientada a Objetos](../Modulo_03_POO/)) que recebe um **prompt** como argumento.
* No entanto, essa edição sozinha não permitirá que seu programa exiba o que seu usuário digita. Para isso, precisamos introduzir **variáveis**.

## Variáveis

* Uma variável é apenas um contêiner para um valor dentro do seu próprio programa.
* No seu programa, você pode introduzir sua própria variável editando-o para:

    ```
    public class HelloWorld {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Digite seu nome: ");
            String nome = sc.nextLine();

            System.out.println("Hello, world!");
            
            sc.close();
        }
    }
    ```

* Note que esse sinal de igual `=` no meio de `String nome = sc.nextLine();` tem um papel especial na programação. Este sinal de igual literalmente **atribui** o que está à direita para o que está à esquerda. Portanto, o valor retornado por `sc.nextLine()` é atribuído a `nome`.
* Se você editar seu código da seguinte forma, notará um erro. O programa retornará `Hello, world!` na janela do terminal, independentemente do que o usuário digitar.
* Editando ainda mais o nosso código, você pode digitar:
    
    ```
    public class HelloWorld {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Digite seu nome: ");
            String nome = sc.nextLine();

            System.out.println("Hello, " + nome);
            
            sc.close();
        }
    }
    ```

    O resultado na janela do terminal seria

    ```
    Qual é o seu nome? Alexandre
    Hello, Alexandre
    ```

* Acontece que algumas funções recebem muitos argumentos.
* Podemos usar uma vírgula `,` para passar vários argumentos.
* Você pode aprender mais na documentação do Java sobre [tipos de dados](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html).

## Comentários

* Comentários são uma maneira dos programadores acompanharem o que estão fazendo em seus programas e até mesmo informarem outros sobre suas intenções para um bloco de código. Em resumo, são notas para você mesmo e para os outros que verão seu código!
* Você pode adicionar comentários ao seu programa para ver o que seu programa está fazendo. Você pode editar seu código da seguinte forma:

    ```
    public class HelloWorld {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            // Perguntar ao usuário o nome dele
            System.out.print("Digite seu nome: ");
            String nome = sc.nextLine();

            // Dizer olá a esse usuário
            System.out.println("Hello, " + nome);
            
            sc.close();
        }
    }
    ```

* Comentários também podem servir como uma lista de tarefas para você.

## Pseudocódigo

* Pseudocódigo é um tipo importante de comentário que se torna uma lista de tarefas especial, especialmente quando você não entende como realizar uma tarefa de codificação. Por exemplo, em seu código, você pode editar seu código para dizer:

    ```
    INÍCIO
        ENTRADA NOME
        SAÍDA "HELLO, " + NOME
    FIM
    ```

## Strings e Parâmetros

* Uma `String` é uma sequência de caracteres, conhecida como `char` em Java.
* Parâmetros, portanto, são argumentos que podem ser recebidos por uma função.
* Você pode aprender mais sobre [Strings](https://docs.oracle.com/javase/tutorial/java/data/strings.html) na documentação do Java.

## int

* Em Java, um inteiro é referido como 'int'.
* No mundo da matemática, estamos familiarizados com os operadores +, -, *, / e %. Esse último operador % ou operador módulo pode não ser muito familiar para você.
* Abrindo o VS Code novamente, podemos digitar 'code Calculator.java' no terminal. Isso criará um novo arquivo no qual criaremos nossa própria calculadora.
* Primeiro, podemos declarar algumas variáveis.

    ```
    public class Calculator {
        public static void main(String[] args) {
            int x = 1;
            int y = 2;

            int z = x + y;

            System.out.println(z);

            sc.close();
        }
    }
    ```

* Naturalmente, quando executamos o código acima, obtemos o resultado 3 na janela do terminal. Podemos tornar isso mais interativo usando a classe `Scanner`.

    ```
    public class Calculator {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Qual é o valor de x? ");
            int x = sc.nextInt();

            System.out.println("Qual é o valor de y? ");
            int y = sc.nextInt();

            int z = x + y;

            System.out.println(z);

            sc.close();
        }
    }
    ```

* Isso ilustra que você pode chamar a função `nextInt()` para obter uma entrada `int` do usuário.

## A Legibilidade Vence

* Ao decidir sua abordagem para uma tarefa de codificação, lembre-se de que alguém pode fazer um argumento razoável para muitas abordagens para o mesmo problema.
* Independentemente da abordagem que você adote para uma tarefa de programação, lembre-se de que seu código deve ser legível. Você deve usar comentários para dar a você e aos outros pistas sobre o que seu código está fazendo. Além disso, você deve criar

 código de maneira legível.

## Float / Double

* Um valor de ponto flutuante é um número real que tem um ponto decimal, como 0,52.
* Você pode alterar seu código para suportar `float`s da seguinte forma:

    ```
    public class Calculator {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Qual é o valor de x? ");
            float x = sc.nextFloat();

            System.out.println("Qual é o valor de y? ");
            float y = sc.nextFloat();

            float z = x + y;

            System.out.println(z);

            sc.close();
        }
    }
    ```

* Essa mudança permite que seu usuário insira 1,2 e 3,4 para apresentar um total de 4,6.
* Alternativamente, isso pode ser feito usando o tipo `double` e a função `nextDouble`.

## Criando suas próprias funções

* Não seria bom criar nossas próprias funções?
* Vamos trazer de volta nosso código final de `HelloWorld` digitando `code HelloWorld.java` na janela do terminal. Podemos melhorar nosso código para criar nossa própria função especial que diz "olá" para nós da seguinte forma:

    ```
    public class HelloWorld {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            // Perguntar ao usuário o nome dele
            System.out.print("Digite seu nome: ");
            String nome = sc.nextLine();

            // Dizer olá a esse usuário
            digaOla(nome);
            
            sc.close();
        }

        public static void digaOla(String nome) {
            System.out.println("Hello, " + nome);
        }
    }
    ```
* Aqui, você está criando sua função `digaOla`, e está dizendo ao compilador que essa função recebe um único parâmetro: uma variável local chamada `nome`. Portanto, quando você chama `digaOla(nome)`, o computador passa `nome` para a função `digaOla` como um parâmetro. Isso é como passamos valores para funções. Muito útil!

## Retornando Valores

* Você pode imaginar muitos cenários em que não deseja apenas que uma função execute uma ação, mas também retorne um valor para a função principal. Por exemplo, em vez de simplesmente imprimir o cálculo de `x + y`, você pode querer que uma função retorne o valor desse cálculo para outra parte do seu programa. Esse "retorno" de um valor é chamado de valor de retorno.
* Voltando ao nosso código do `Calculator`, digitando `code Calculator.java`. Apague todo o código lá. Reescreva o código da seguinte forma:

    ```
    public class Calculator {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Qual é o valor de x? ");
            int x = sc.nextInt();

            System.out.println("x ao quadrado é: " + quadrado(x));

            sc.close();
        }

        public static int quadrado(int x) {
            return x * x;
        }
    }
    ```

* Efetivamente, `x` é passado para a função `quadrado`. Em seguida, o cálculo de `x * x` é retornado para a função `main`.
