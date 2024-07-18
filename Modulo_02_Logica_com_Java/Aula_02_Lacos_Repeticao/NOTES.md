# Módulo 2: Lógica de Programação Algorítmica com Java

## Aula 2: Laços de Repetição (Loops)

Agora você tem outro poder na sua crescente lista de habilidades em Java. Nesta aula, abordaremos…

* Laços `while`
* Laços `for`
* Listas

## Laços

* Essencialmente, laços são uma forma de fazer algo repetidamente.
* Comece digitando `code Hello.java` na janela do terminal.
* No editor de texto, comece com o seguinte código:

    ```
    public class Hello {
        public static void main(String[] args) {
            System.out.println("Hello!");
            System.out.println("Hello!");
            System.out.println("Hello!");
        }
    }
    ```

* Executando este código, você notará que o programa diz "Hello!" três vezes.
* Ao se desenvolver como programador, você deve considerar como pode melhorar áreas do seu código onde digita a mesma coisa repetidamente. Imagine se você quisesse dizer "Hello!" 500 vezes. Seria lógico digitar essa mesma expressão `System.out.println("Hello!")` repetidamente?
* Laços permitem criar um bloco de código que é executado repetidamente.

## Laços While

* O laço `while` é quase universal em todas as linguagens de codificação.
* Esse tipo de laço repetirá um bloco de código várias vezes.
* Na janela do editor de texto, edite seu código da seguinte maneira:

    ```
    public class Hello {
        public static void main(String[] args) {

            int i = 3;

            while (i != 0) {
                System.out.println("Hello!");
            }
        }
    }
    ```

* Note que, embora este código execute `System.out.println("Hello!");` várias vezes, ele nunca parará! Ele entrará em loop infinito. Laços `while` funcionam perguntando repetidamente se a condição do laço foi satisfeita. Neste caso, o compilador está perguntando "i não é igual a zero?". Quando você ficar preso em um loop que se executa para sempre, você pode pressionar control-c no teclado para sair do loop.
* Para corrigir esse loop infinito, podemos editar nosso código da seguinte forma:

    ```
    public class Hello {
        public static void main(String[] args) {

            int i = 3;

            while (i != 0) {
                System.out.println("Hello!");
                i--;
            }
        }
    }
    ```

* Note que agora nosso código executa corretamente, reduzindo `i` em 1 a cada “iteração” pelo loop. O termo iteração tem um significado especial na codificação. Por iteração, queremos dizer um ciclo através do loop. A primeira iteração é a “0ª” iteração pelo loop. A segunda é a “1ª” iteração. Na programação, começamos a contar com 0, depois 1, depois 2.
* Podemos melhorar ainda mais nosso código da seguinte forma:

    ```
    public class Hello {
        public static void main(String[] args) {

            int i = 0;

            while (i < 3) {
                System.out.println("Hello!");
                i++;
            }
        }
    }
    ```

* Note que quando codificamos `i++`, que significa `i = i + 1`, atribuímos o valor de `i` da direita para a esquerda. Se você executar o código acima, verá que ele diz "Hello!" três vezes. É uma boa prática na programação começar a contar do zero.
* Note como mudar o operador para `i < 3` permite que nosso código funcione conforme o esperado. Começamos a contar com 0 e ele itera pelo nosso loop três vezes.
* Nosso código neste ponto é ilustrado da seguinte forma:

    <div align="center">
    <img src="./images/loops.png" alt="loops" align="center"/>
    </div>
    </br>

* Note como nosso loop conta `i` até, mas não incluindo, 3.

## Laços For

* Um laço `for` é um tipo diferente de laço. 
* Por exemplo, na janela do editor de texto, modifique seu código `Hello.java` da seguinte forma:

    ```
    public class Hello {
        public static void main(String[] args) {

            for (int i = 0; i < 3; i++) {
                System.out.println("Hello!");
            }
        }
    }
    ```

* Note como este código é semelhante ao seu código anterior de laço `while`. Neste código, `i` começa com 0, diz "Hello!", `i` é atribuído 1, diz "Hello!", e, finalmente, `i` é atribuído 2, diz "Hello!", e então termina.

## Melhorando com Entrada do Usuário

* Talvez queiramos obter a entrada do nosso usuário. Podemos usar laços como uma forma de validar a entrada do usuário.
* Um paradigma comum em Java é usar um laço `while` para validar a entrada do usuário.
* Por exemplo, vamos tentar solicitar ao usuário um número maior ou igual a 0:

    ```
    public class Hello {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n;

            while (true) {
                System.out.println("Qual é o valor de n? ");
                n = sc.nextInt();

                if (n < 0) {
                    continue;
                } else {
                    break;
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.println("Hello!");
            }

            sc.close();
        }
    }
    ```

* Note que introduzimos duas novas palavras-chave em Java, `continue` e `break`. `continue` diz explicitamente ao Java para ir para a próxima iteração de um loop. `break`, por outro lado, diz ao Java para "sair" de um loop antecipadamente, antes de concluir todas as suas iterações. Neste caso, continuaremos para a próxima iteração do loop quando `n` for menor que 0, repromptando o usuário com “Qual é o valor de n?”. No entanto, se `n` for maior ou igual a 0, sairemos do loop e permitiremos que o restante do nosso programa seja executado.
* Acontece que a palavra-chave `continue` é redundante neste caso. Podemos melhorar nosso código da seguinte forma:

    ```
    public class Hello {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n;

            while (true) {
                System.out.println("Qual é o valor de n? ");
                n = sc.nextInt();

                if (n > 0) {
                    break;
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.println("Hello!");
            }

            sc.close();
        }
    }
    ```

* Note como este laço `while` sempre será executado (para sempre) até que `n` seja maior que 0. Quando `n` for maior que 0, o laço será interrompido.

## Listas

* Considere o mundo de Hogwarts do famoso universo de Harry Potter.
* Agora queremos ter uma lista de alunos com seus nomes conforme abaixo. Assim como ilustramos anteriormente, podemos usar um loop para iterar sobre a lista.

    ```
    public class Hello {
        public static void main(String[] args) {
            List<String> nomes = Arrays.asList("Harry", "Hermione", "Rony");

            for (int i = 0; i < nomes.size(); i++) {
                System.out.println("Hello, " + nomes.get(i));
            }
        }
    }
    ```

* Note que para cada aluno na lista de alunos, ele dirá "Hello" para esse aluno conforme esperado. 
* Podemos utilizar o método `size()` como uma forma de verificar o comprimento da lista chamada alunos.
* Note como executar este código resulta não apenas em obter a posição de cada aluno mais um usando `i + 1`, mas também imprime o nome de cada aluno. `size()` permite que você veja dinamicamente quanto tempo a lista de alunos é, independentemente de quanto ela cresce.
* Podemos melhorar o código acima usando a sintaxe `for-each`:

    ```
    public class Hello {
        public static void main(String[] args) {
            List<String> nomes = Arrays.asList("Harry", "Hermione", "Rony");

            for (String nome : nomes) {
                System.out.println("Hello, " + nome);
            }
        }
    }
    ```
