# Módulo 7: Frontend - HTML, CSS, JS e Bootstrap (EM REVISÃO)

## Introdução

Neste curso, vamos dar continuidade ao que aprendemos no CS50 e mergulhar no design e criação de aplicações web. Vamos aprimorar nossas habilidades de design web através de diversos projetos ao longo do curso, incluindo um projeto final aberto onde você terá a chance de criar seu próprio site!

Para este curso, você precisará de um editor de texto para escrever código localmente no seu computador. Alguns editores populares incluem [Visual Studio Code](https://code.visualstudio.com/), [Sublime Text](https://www.sublimetext.com/), [Atom](https://atom.io/) e [Vim](https://www.vim.org/), mas há muitos outros para escolher!

## Programação Web

### Tópicos do Curso
Vamos entrar em mais detalhes mais tarde, mas aqui está uma visão geral do que vamos trabalhar durante o curso:

1. **HTML e CSS** (uma linguagem de marcação usada para estruturar uma página web, e um procedimento para tornar nossos sites mais visualmente atraentes)
2. **Git** (usado para controle de versão e colaboração)
3. **Python** (uma linguagem de programação amplamente utilizada que usaremos para tornar nossos sites mais dinâmicos)
4. **Django** (um popular framework web que usaremos para o backend dos nossos sites)
5. **SQL, Modelos e Migrações** (uma linguagem usada para armazenar e recuperar dados, e métodos específicos do Django que facilitam a interação com bancos de dados SQL)
6. **JavaScript** (uma linguagem de programação usada para tornar os sites mais rápidos e interativos)
7. **Interfaces de Usuário** (métodos usados para tornar um site o mais fácil de usar possível)
8. **Testes, CI, CD** (aprendendo sobre diferentes métodos usados para garantir que atualizações em páginas web ocorram sem problemas)
9. **Escalabilidade e Segurança** (garantindo que nossos sites possam ser acessados por muitos usuários ao mesmo tempo, e que estejam seguros contra intenções maliciosas)

## HTML (Linguagem de Marcação de Hipertexto)

- HTML é uma linguagem de marcação que define a estrutura de uma página web. É interpretada pelo seu navegador (Safari, Google Chrome, Firefox, etc.) para exibir conteúdo na sua tela.
- Vamos começar escrevendo um simples arquivo HTML!

```html
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Hello!</title>
    </head>
    <body>
        Hello, world!
    </body>
</html>
```

- Quando abrimos este arquivo no navegador, obtemos:
![Hello Page](images/hello0.png)

- Agora, vamos falar sobre o arquivo que acabamos de escrever, que parece ser bem complicado para uma página tão simples:
  - Na primeira linha, estamos declarando (para o navegador) que estamos escrevendo o documento na versão mais recente do HTML: HTML5.
  - Após isso, a página consiste em elementos HTML aninhados (como html e body), cada um com uma **tag de abertura e fechamento** marcada com `<element>` para abertura e `</element>` para fechamento.
  - Note como cada um dos elementos internos está indentado um pouco mais que o anterior. Embora isso não seja necessariamente requerido pelo navegador, será muito útil manter essa prática em seu próprio código.
  - Elementos HTML podem incluir **atributos**, que dão ao navegador informações extras sobre o elemento. Por exemplo, ao incluir `lang="en"` em nossa tag inicial, estamos dizendo ao navegador que estamos usando inglês como nossa língua principal.
  - Dentro do elemento HTML, geralmente queremos incluir tanto uma tag `head` quanto uma tag `body`. O elemento head incluirá informações sobre sua página que não são necessariamente exibidas, e o elemento body conterá o que é realmente visível para os usuários que visitam o site.
  - Dentro do head, incluímos um `title` para nossa página web, que você notará é exibido na aba no topo do navegador.
  - Finalmente, incluímos o texto "Hello, world!" no body, que é a parte visível da nossa página.

### Document Object Model (DOM)

![cs50Week8Slide065](https://github.com/user-attachments/assets/61a81198-cf30-4a27-a57e-6827e485f5f8)

- O DOM é uma maneira conveniente de visualizar a relação entre os elementos HTML usando uma estrutura em forma de árvore. Acima está um exemplo do layout do DOM para a página que acabamos de escrever.

### Mais Elementos HTML

- Existem muitos elementos HTML que você pode querer usar para personalizar sua página, incluindo cabeçalhos, listas e seções em negrito. No próximo exemplo, veremos alguns desses em ação.
- Outra coisa a notar: `<!-- -->` nos dá um comentário em HTML, então vamos usá-lo abaixo para explicar alguns dos elementos.

```html
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>HTML Elements</title>
    </head>
    <body>
        <!-- Podemos criar cabeçalhos usando h1 a h6 como tags. -->
        <h1>A Large Heading</h1>
        <h2>A Smaller Heading</h2>
        <h6>The Smallest Heading</h6>

        <!-- As tags strong e i nos dão negrito e itálico respectivamente. -->
        A <strong>bold</strong> word and an <i>italicized</i> word!

        <!-- Podemos linkar para outra página (como a página do CS50) usando a. -->
        View the <a href="https://cs50.harvard.edu/">CS50 Website</a>!

        <!-- Usamos ul para uma lista não ordenada e ol para uma ordenada. Ambas listas ordenadas e não ordenadas contêm li, ou itens de lista. -->
        Uma lista não ordenada:
        <ul>
            <li>foo</li>
            <li>bar</li>
            <li>baz</li>
        </ul>
        Uma lista ordenada:
        <ol>
            <li>foo</li>
            <li>bar</li>
            <li>baz</li>
        </ol>

        <!-- Imagens requerem um atributo src, que pode ser o caminho para um arquivo no seu computador ou o link para uma imagem online. Também inclui um atributo alt, que dá uma descrição caso a imagem não possa ser carregada. -->
        Uma imagem:
        <img src="../../images/duck.jpeg" alt="Rubber Duck Picture">
        <!-- Podemos ver acima que para alguns elementos que não contêm outros, tags de fechamento não são necessárias. -->

        <!-- Aqui, usamos a tag br para adicionar espaço em branco na página. -->
        <br/> <br/>

        <!-- Algumas tags diferentes são necessárias para criar uma tabela. -->
        <table>
            <thead>
                <th>Ocean</th>
                <th>Average Depth</th>
                <th>Maximum Depth</th>
            </thead>
            <tbody>
                <tr>
                    <td>Pacific</td>
                    <td>4280 m</td>
                    <td>10911 m</td>
                </tr>
                <tr>
                    <td>Atlantic</td>
                    <td>3646 m</td>
                    <td>8486 m</td>
                </tr>
            </tbody>
        </table>
    </body>
</html>
```

Esta página, quando renderizada, parece algo assim:
![Elements](images/elements.png)

- Caso você esteja preocupado, saiba que nunca terá que memorizar esses elementos. É muito fácil simplesmente procurar algo como "imagem em HTML" para encontrar a tag `img`. Um recurso especialmente útil para aprender sobre esses elementos é o [W3 Schools](https://www.w3schools.com/html/html_elements.asp).

### Formulários

- Outro conjunto de elementos que é realmente importante ao criar um site é como coletar informações dos usuários. Você pode permitir que os usuários entrem com informações usando um formulário HTML, que pode conter vários tipos diferentes de entrada. Mais tarde no curso, vamos aprender sobre como lidar com informações uma vez que um formulário foi enviado.
- Assim como outros elementos HTML, não há necessidade de memorizar esses, e o W3 Schools é um ótimo recurso para aprender sobre eles!

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Forms</title>
</head>
<body>
    <form>
        <input type="text" placeholder="First Name" name="first">
        <input type="password" placeholder="Password" name="password">
        <div>
            Favorite Color:
            <input name="color" type="radio" value="blue"> Blue
            <input name="color" type="radio" value="green"> Green
            <input name="color" type="radio" value="yellow"> Yellow
            <input name="color" type="radio" value="red"> Red
        </div>
        <input type="submit">
    </form>
</body>
</html>
```

![Form](images/form.png)

## CSS (Folhas de Estilo em Cascata)

- CSS é usado para personalizar a aparência de um site.
- Enquanto estamos apenas começando, podemos adicionar um atributo de estilo a qualquer elemento HTML para aplicar algum CSS a ele.
- Alteramos o estilo alterando as propriedades CSS de um elemento, escrevendo algo como `color: blue` ou `text-align: center`.

```html
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Hello!</title>
    </head>
    <body>
        <h1 style="color: blue; text-align: center;">A Colorful Heading!</h1>
        Hello, world!
    </

body>
</html>
```

![Blue Heading](images/style0.png)

- Se estilizamos um elemento externo, todos os elementos internos automaticamente assumem esse estilo. Podemos ver isso se movermos a estilização que aplicamos à tag header para a tag body:

```html
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Hello!</title>
    </head>
    <body style="color: blue; text-align: center;">
        <h1>A Colorful Heading!</h1>
        Hello, world!
    </body>
</html>
```

![Blue Everywhere](images/style1.png)

- Embora possamos estilizar nossa página web como fizemos acima, para alcançar um melhor design, devemos ser capazes de mover nossa estilização para longe das linhas individuais.
  - Uma maneira de fazer isso é adicionar sua estilização entre tags `<style>` no `head`. Dentro dessas tags, escrevemos os tipos de elementos que queremos estilizar e a estilização que desejamos aplicar a eles. Por exemplo:

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Hello!</title>
    <style>
        h1 {
            color: blue;
            text-align: center;
        }
    </style>
</head>
<body>
    <h1>A Colorful Heading!</h1>
    Hello, world!
</body>
</html>
```

  - Outra maneira é incluir um elemento `<link>` no seu `head` com um link para um arquivo `styles.css` que contém alguma estilização. Isso significa que o arquivo HTML pareceria:

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Hello!</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <h1>A Colorful Heading!</h1>
    Hello, world!
</body>
</html>
```

E nosso arquivo chamado `styles.css` pareceria assim:

```css
h1 {
    color: blue;
    text-align: center;
}
```

- Existem muitas propriedades CSS para serem abordadas aqui, mas assim como elementos HTML, geralmente é fácil procurar algo como "alterar fonte para azul CSS" para obter o resultado. Algumas das mais comuns são:
  - `color`: a cor do texto
  - `text-align`: onde os elementos são colocados na página
  - `background-color`: pode ser definida para qualquer cor
  - `width`: em pixels ou percentual da página
  - `height`: em pixels ou percentual da página
  - `padding`: quanto espaço deve ser deixado dentro de um elemento
  - `margin`: quanto espaço deve ser deixado fora de um elemento
  - `font-family`: tipo de fonte para o texto na página
  - `font-size`: em pixels
  - `border`: tamanho, tipo (sólido, tracejado, etc), cor

- Vamos usar um pouco do que acabamos de aprender para melhorar nossa tabela de oceanos de antes. Aqui está algum HTML para começarmos:

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Nicer Table</title>
</head>
<body>
    <table>
        <thead>
            <th>Ocean</th>
            <th>Average Depth</th>
            <th>Maximum Depth</th>
        </thead>
        <tbody>
            <tr>
                <td>Pacific</td>
                <td>4280 m</td>
                <td>10911 m</td>
            </tr>
            <tr>
                <td>Atlantic</td>
                <td>3646 m</td>
                <td>8486 m</td>
            </tr>
        </tbody>
    </table>
</body>
</html>
```

![Table Bad](images/table0.png)

- O acima parece muito com o que tínhamos antes, mas agora, seja incluindo uma tag `style` ou um link para uma folha de estilo no elemento `head`, adicionamos o seguinte css:

```css
table {
    border: 1px solid black;
    border-collapse: collapse;
}

td {
    border: 1px solid black;
    padding: 2px;
}

th {
    border: 1px solid black;
    padding: 2px;
}
```

O que nos deixa com esta tabela de aparência mais agradável:
![Table Good](images/table1.png)

- Você pode já estar pensando que há alguma repetição desnecessária em nosso CSS no momento, já que `td` e `th` têm a mesma estilização. Podemos (e devemos) condensar isso para o seguinte código, usando uma vírgula para mostrar que a estilização deve ser aplicada a mais de um tipo de elemento.

```css
table {
    border: 1px solid black;
    border-collapse: collapse;
}

td, th {
    border: 1px solid black;
    padding: 2px;
}
```

- Esta é uma boa introdução ao que são conhecidos como [seletores CSS](https://www.w3schools.com/cssref/css_selectors.asp). Existem muitas maneiras de determinar quais elementos HTML você está estilizando, algumas das quais mencionaremos aqui:
  - **tipo de elemento**: isso é o que temos feito até agora: estilizando todos os elementos do mesmo tipo.
  - **id**: Outra opção é dar aos nossos elementos HTML um id assim: `<h1 id="first-header">Hello!</h1>` e então aplicar estilização usando `#first-header{...}` usando o símbolo de hashtag para mostrar que estamos buscando por id. Importante, nenhum dois elementos podem ter o mesmo id, e nenhum elemento pode ter mais de um id.
  - **classe**: Isso é semelhante ao id, mas uma classe pode ser compartilhada por mais de um elemento, e um único elemento pode ter mais de uma classe. Adicionamos classes a um elemento HTML assim: `<h1 class="page-text muted">Hello!</h1>` (note que acabamos de adicionar duas classes ao elemento: `page-text` e `muted`). Em seguida, estilizamos com base na classe usando um ponto em vez de uma hashtag: `.muted {...}`

- Agora, também temos que lidar com o problema de potencialmente conflituoso CSS. O que acontece quando um cabeçalho deve ser vermelho com base em sua classe, mas azul com base em seu id? O CSS tem uma ordem de especificidade que vai:
  1. Estilização em linha
  2. id
  3. classe
  4. tipo de elemento

- Além da vírgula para múltiplos seletores, existem várias outras maneiras de especificar quais elementos você gostaria de estilizar. Esta tabela da palestra fornece algumas, e passaremos por alguns exemplos abaixo:

![Selectors](images/selectors.png)

**Selector Descendente**: Aqui, usamos o selector descendente para aplicar estilização apenas a itens de lista encontrados dentro de uma lista não ordenada:

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Using Selectors</title>
    <style>
        ul li {
            color: blue;
        }
    </style>
</head>
<body>
    <ol>
        <li>foo</li>
        <li> bar
            <ul>
                <li>hello</li>
                <li>goodbye</li>
                <li>hello</li>
            </ul>
        </li>
        <li>baz</li>
    </ol>
</body>
</html>
```

![List Selector](images/selectors0.png)

**Atributos como Selectores**: Também podemos restringir nossa seleção com base nos atributos que atribuímos aos elementos HTML usando colchetes. Por exemplo, na seguinte lista de links, escolhemos apenas fazer o link para a Amazon vermelho:

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Using Selectors</title>
    <style>
        a[href="https://www.amazon.com/"] {
            color: red;
        }
    </style>
</head>
<body>
    <ol>
        <li><a href="https://www.google.com/">Google</a></li>
        <li><a href="https://www.amazon.com/">Amazon</a></li>
        <li><a href="https://www.facebook.com/">Facebook</a></li>
    </ol>
</body>
</html>
```

![Link Selectors](images/selectors2.png)

- Não só podemos usar CSS para mudar permanentemente a aparência de um elemento, mas também o que parece sob certas condições. Por exemplo, e se quisermos que um botão mude de cor quando passamos o mouse sobre ele? Podemos conseguir isso usando uma [pseudo-classe CSS](https://www.w3schools.com/css/css_pseudo_classes.asp), que fornece estilização adicional durante circunstâncias especiais. Escrevemos isso adicionando um dois-pontos após o nosso seletor, e depois adicionando a circunstância após esse dois-pontos.

- No caso do botão, adicionaríamos `:hover` ao seletor do botão para especificar o design apenas ao passar o mouse:

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Pseudoclasses</title>
    <style>
        button {
            background-color: red;
            width: 200px;
            height: 50px;
            font-size: 24px;
        }

        button:hover {
            background-color: green;
        }
    </style>
</head>
<body>
    <button>Button 1</button>
    <button>Button 2</button>
    <button>Button 3</button>
</body>
</html>
``

`

![Buttons](images/buttons.gif)

## Design Responsivo

- Hoje em dia, muitas pessoas visualizam sites em dispositivos diferentes de computadores, como smartphones e tablets. É importante garantir que seu site seja legível para pessoas em todos os dispositivos.
- Uma maneira de conseguirmos isso é através do conhecimento do **viewport**. O viewport é a parte da tela que está realmente visível para o usuário em qualquer momento. Por padrão, muitas páginas web assumem que o viewport é o mesmo em qualquer dispositivo, o que leva muitos sites (especialmente os mais antigos) a serem difíceis de interagir em dispositivos móveis.
- Uma maneira simples de melhorar a aparência de um site em um dispositivo móvel é adicionar a seguinte linha no head dos nossos arquivos HTML. Esta linha diz ao dispositivo móvel para usar um viewport que seja do mesmo tamanho que o do dispositivo que você está usando, em vez de um muito maior.

```html
<meta name="viewport" content="width=device-width, initial-scale=1.0">
```

- Outra maneira de lidarmos com diferentes dispositivos é através de [consultas de mídia](https://www.w3schools.com/cssref/css3_pr_mediaquery.asp). Consultas de mídia são maneiras de alterar o estilo de uma página com base em como a página está sendo visualizada.

- Para um exemplo de uma consulta de mídia, vamos tentar simplesmente mudar a cor da tela quando ela encolher para um certo tamanho. Sinalizamos uma consulta de mídia digitando `@media` seguido pelo tipo de consulta entre parênteses:

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Screen Size</title>
    <style>
        @media (min-width: 600px) {
            body {
                background-color: red;
            }
        }

        @media (max-width: 599px) {
            body {
                background-color: blue;
            }
        }
    </style>
</head>
<body>
    <h1>Welcome to the page!</h1>
</body>
</html>
```

![Screen Size](images/responsive0.gif)

- Outra maneira de lidar com tamanhos de tela diferentes é usando um novo atributo CSS conhecido como [flexbox](https://www.w3schools.com/css/css3_flexbox.asp). Isso nos permite ter elementos que se encaixam facilmente na próxima linha se não couberem horizontalmente. Fazemos isso colocando todos os nossos elementos em um `div` que chamaremos de container. Em seguida, adicionamos alguma estilização a esse `div` especificando que queremos usar uma exibição flexbox para os elementos dentro dele. Também adicionamos alguma estilização adicional aos `divs` internos para ilustrar melhor o ajuste que está ocorrendo aqui.

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Screen Size</title>
    <style>
        #container {
            display: flex;
            flex-wrap: wrap;
        }

        #container > div {
            background-color: green;
            font-size: 20px;
            margin: 20px;
            padding: 20px;
            width: 200px;
        }
    </style>
</head>
<body>
    <div id="container">
        <div>Some text 1!</div>
        <div>Some text 2!</div>
        <div>Some text 3!</div>
        <div>Some text 4!</div>
        <div>Some text 5!</div>
        <div>Some text 6!</div>
        <div>Some text 7!</div>
        <div>Some text 8!</div>
        <div>Some text 9!</div>
        <div>Some text 10!</div>
        <div>Some text 11!</div>
        <div>Some text 12!</div>
    </div>
</body>
</html>
```

![Flexbox](images/flexbox.gif)

- Outra maneira popular de estilizar uma página é usando um [grid](https://www.w3schools.com/css/css_grid.asp) HTML. Neste grid, podemos especificar atributos de estilo, como larguras de coluna e espaçamentos entre colunas e linhas, conforme demonstrado abaixo. Note que quando especificamos larguras de coluna, dizemos que a terceira é `auto`, o que significa que deve preencher o restante da página.

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <title>My Web Page!</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        .grid {
            background-color: green;
            display: grid;
            padding: 20px;
            grid-column-gap: 20px;
            grid-row-gap: 10px;
            grid-template-columns: 200px 200px auto;
        }

        .grid-item {
            background-color: white;
            font-size: 20px;
            padding: 20px;
            text-align: center;
        }
    </style>
</head>
<body>
    <div class="grid">
        <div class="grid-item">1</div>
        <div class="grid-item">2</div>
        <div class="grid-item">3</div>
        <div class="grid-item">4</div>
        <div class="grid-item">5</div>
        <div class="grid-item">6</div>
        <div class="grid-item">7</div>
        <div class="grid-item">8</div>
        <div class="grid-item">9</div>
        <div class="grid-item">10</div>
        <div class="grid-item">11</div>
        <div class="grid-item">12</div>
    </div>
</body>
</html>
```

![Grid](images/grid.gif)

## Bootstrap

- Acontece que existem muitas bibliotecas que outras pessoas já escreveram que podem tornar a estilização de uma página web ainda mais simples. Uma biblioteca popular que usaremos ao longo do curso é conhecida como [bootstrap](https://getbootstrap.com/).
- Podemos incluir o bootstrap em nosso código adicionando uma única linha ao head do nosso arquivo HTML:

```html
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
```

- Em seguida, podemos ver alguns dos recursos do bootstrap navegando para a [documentação](https://getbootstrap.com/docs/4.5/components/) do site deles. Nesta página, você encontrará muitos exemplos de classes que pode adicionar aos elementos que permitem que sejam estilizados com bootstrap.
- Um recurso popular do bootstrap é seu [sistema de grid](https://getbootstrap.com/docs/4.0/layout/grid/). O bootstrap divide automaticamente uma página em 12 colunas, e podemos decidir quantas colunas um elemento ocupa adicionando a classe `col-x` onde `x` é um número entre 1 e 12. Por exemplo, na página a seguir, temos uma linha de colunas de largura igual, e depois uma linha onde a coluna central é maior:

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <title>My Web Page!</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <style>
        .row > div {
            padding: 20px;
            background-color: teal;
            border: 2px solid black;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="col-4">
                This is a section.
            </div>
            <div class="col-4">
                This is another section.
            </div>
            <div class="col-4">
                This is a third section.
            </div>
        </div>
    </div>
    <br/>
    <div class="container">
        <div class="row">
            <div class="col-3">
                This is a section.
            </div>
            <div class="col-6">
                This is another section.
            </div>
            <div class="col-3">
                This is a third section.
            </div>
        </div>
    </div>
</body>
</html>
```

![Columns](images/cols1.gif)

- Para melhorar a responsividade móvel, o bootstrap também nos permite especificar tamanhos de coluna que diferem dependendo do tamanho da tela. No exemplo a seguir, usamos `col-lg-3` para mostrar que um elemento deve ocupar 3 colunas em uma tela grande, e `col-sm-6` para mostrar que um elemento deve ocupar 6 colunas quando a tela é pequena:

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <title>My Web Page!</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9If

jh" crossorigin="anonymous">
    <style>
        .row > div {
            padding: 20px;
            background-color: teal;
            border: 2px solid black;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="col-lg-3 col-sm-6">
                This is a section.
            </div>
            <div class="col-lg-3 col-sm-6">
                This is another section.
            </div>
            <div class="col-lg-3 col-sm-6">
                This is a third section.
            </div>
            <div class="col-lg-3 col-sm-6">
                This is a fourth section.
            </div>
        </div>
    </div>
</body>
</html>
```

![Wrap Columns](images/cols2.gif)

## Sass (Folhas de Estilo Sintaticamente Incríveis)

- Até agora, encontramos algumas maneiras de eliminar a redundância no CSS, como movê-lo para arquivos separados ou usar o bootstrap, mas ainda há vários lugares onde podemos fazer melhorias. Por exemplo, e se quisermos que vários elementos tenham estilos diferentes, mas que todos sejam da mesma cor? Se decidirmos mais tarde mudar a cor, teríamos que mudar em vários elementos diferentes.
- [Sass](https://sass-lang.com/) é uma linguagem que nos permite escrever CSS de forma mais eficiente de várias maneiras, uma das quais é permitindo que tenhamos variáveis, como no exemplo a seguir.
- Ao escrever em Sass, criamos um novo arquivo com a extensão `filename.scss`. Neste arquivo, podemos criar uma nova variável adicionando um `$` antes de um nome, depois um dois-pontos, depois um valor. Por exemplo, escreveríamos `$color: red` para definir a variável cor com o valor vermelho. Em seguida, acessamos essa variável usando `$color`. Aqui está um exemplo do nosso arquivo `variables.scss`:

```scss
$color: red;

ul {
    font-size: 14px;
    color: $color;
}

ol {
    font-size: 18px;
    color: $color;
}
```

- Agora, para linkar esta estilização ao nosso arquivo HTML, não podemos simplesmente linkar para o arquivo `.scss` porque a maioria dos navegadores web reconhece apenas arquivos `.css`. Para lidar com esse problema, precisamos [baixar um programa chamado Sass](https://sass-lang.com/install) em nossos computadores. Depois, no nosso terminal, escrevemos `sass variables.scss:variables.css`. Este comando compilará um arquivo `.scss` chamado `variables.scss` em um arquivo `.css` chamado `variables.css`, ao qual você pode adicionar um link na sua página HTML.

- Para agilizar este processo, podemos usar o comando `sass --watch variables.scss:variables.css` que altera automaticamente o arquivo `.css` sempre que uma mudança é detectada no arquivo `.scss`.

- Ao usar o Sass, também podemos aninhar fisicamente nossa estilização em vez de usar os seletores CSS que mencionamos anteriormente. Por exemplo, se quisermos aplicar alguma estilização apenas a parágrafos e listas não ordenadas dentro de um div, podemos escrever o seguinte:

```scss
div {
    font-size: 18px;

    p {
        color: blue;
    }

    ul {
        color: green;
    }
}
```

Uma vez compilado em CSS, obteríamos um arquivo que se parece com:

```css
div {
    font-size: 18px;
}

div p {
    color: blue;
}

div ul {
    color: green;
}
```

- Mais um recurso que o Sass nos dá é conhecido como [herança](https://sass-lang.com/guide). Isso nos permite criar um conjunto básico de estilização que pode ser compartilhado por vários elementos diferentes. Fazemos isso adicionando um `%` antes do nome de uma classe, adicionando alguma estilização e depois adicionando a linha `@extend %classname` ao início de alguma estilização. Por exemplo, o código a seguir aplica a estilização dentro da classe `message` a cada uma das diferentes classes abaixo, resultando em uma página web que parece com a abaixo.

```scss
%message {
    font-family: sans-serif;
    font-size: 18px;
    font-weight: bold;
    border: 1px solid black;
    padding: 20px;
    margin: 20px;
}

.success {
    @extend %message;
    background-color: green;
}

.warning {
    @extend %message;
    background-color: orange;
}

.error {
    @extend %message;
    background-color: red;
}
```

![Inheritance](images/inherit.png)

