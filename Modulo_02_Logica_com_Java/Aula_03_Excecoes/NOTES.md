# Módulo 2: Lógica de Programação Algorítmica com Java

## Aula 3: Tratamento de Exceções

* Erros são inevitáveis no seu código. No entanto, você tem a oportunidade de usar o que foi aprendido hoje para ajudar a prevenir esses erros. Nesta aula, você aprenderá sobre…

* Erros de Execução
* `try/catch`

## Exceções

* Exceções são coisas que dão errado em nossa codificação.
* No nosso editor de texto, digite `code HelloWorld.java` para criar um novo arquivo. Digite o seguinte (com os erros intencionais incluídos):

    ```
    public class HelloWorld {
        public static void main(String[] args) {
            System.out.println("Hello, world);
        }
    }
    ```
    Note que intencionalmente deixamos de fora uma aspa.
* Executando esse código na nossa janela do terminal, um erro é exibido. O compilador afirma que é um "String literal is not properly closed by a double-quote." Erros de sintaxe são aqueles que exigem que você verifique novamente se digitou seu código corretamente.

## Erros de Execução

* Erros de execução referem-se àqueles criados por comportamento inesperado dentro do seu código. Por exemplo, talvez você tenha pretendido que um usuário inserisse um número, mas ele inseriu um caractere em vez disso. Seu programa pode lançar um erro devido a essa entrada inesperada do usuário.
* Na sua janela do terminal, execute `code Calculator.java`. Digite o seguinte no seu editor de texto:

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

* Testando seu código, você pode imaginar como alguém poderia facilmente digitar uma `String` ou um `char` (caractere) em vez de um número. Ainda assim, um usuário poderia não digitar nada - simplesmente pressionando a tecla Enter.
* Como programadores, devemos ser defensivos para garantir que nossos usuários estão inserindo o que esperamos. Podemos considerar "casos extremos" como -1.
* Se executarmos este programa e digitarmos "gato", veremos de repente um erro "InputMismatchException", pois o compilador Java espera um número `float`.
* Uma estratégia eficaz para corrigir esse erro potencial seria criar "tratamento de erros" para garantir que o usuário se comporte como pretendemos.

## try/catch

* Em Java, podemos usar instruções `try/catch` para testar a entrada do usuário antes que algo dê errado. Modifique seu código da seguinte maneira:

    ```
    public class Calculator {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            try {
                System.out.println("Qual é o valor de x? ");
                float x = sc.nextFloat();
        
                System.out.println("Qual é o valor de y? ");
                float y = sc.nextFloat();
        
                float z = x + y;
        
                System.out.println(z);

                sc.close();
            } catch (InputMismatchException e) {
                System.out.println("A entrada deve ser um número real!");
            }
        }
    }
    ```

* Note que, ao executar esse código, inserir 50 será aceito. No entanto, digitar "gato" produzirá um erro visível para o usuário, instruindo-o sobre o motivo pelo qual sua entrada não foi aceita.
* Esta ainda não é a melhor maneira de implementar esse código. Para a melhor prática, devemos tentar apenas as poucas linhas de código possíveis que consideramos que possam falhar. Ajuste seu código da seguinte maneira:

    ```
    public class Calculator {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            float z = 0;
            
            try {
                System.out.println("Qual é o valor de x? ");
                float x = sc.nextFloat();
        
                System.out.println("Qual é o valor de y? ");
                float y = sc.nextFloat();
        
                z = x + y;
            } catch (InputMismatchException e) {
                System.out.println("A entrada deve ser um número real!");
            }

            System.out.println(z);

            sc.close();
        }
    }
    ```
