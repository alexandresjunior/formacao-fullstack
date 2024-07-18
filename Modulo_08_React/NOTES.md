# Módulo 8: React JS

## Introdução
Neste módulo, veremos os seguintes tópicos:

- Estrutura de um Componente
- Propriedades e Gerenciamento de Estados c/ os Hooks useState e useEffect
- React Router Dom: Navegando entre Páginas
- Context API: Gerenciamento de Estados Globais
- Integração com APIs Externas com Axios
- Armazenamento local com Local e Session Storage

A documentação oficial do React está disponível através [deste link](https://react.dev/).

---

## Estrutura de um Componente

Em React, um componente é uma função ou classe que retorna um elemento React. A estrutura básica de um componente funcional é:

```jsx
import React from 'react';

const MeuComponente = () => {
    return (
        <div>
            <h1>Olá, Mundo!</h1>
        </div>
    );
};

export default MeuComponente;
```

---

## Propriedades e Gerenciamento de Estados c/ os Hooks useState e useEffect

### Propriedades (Props)

As propriedades são usadas para passar dados de um componente pai para um componente filho.

```jsx
const Saudacao = (props) => {
    return <h1>Olá, {props.nome}!</h1>;
};

// Utilização do componente Saudacao
const App = () => {
    return <Saudacao nome="João" />;
};
```

### useState

O Hook `useState` permite adicionar o estado local ao componente funcional.

```jsx
import React, { useState } from 'react';

const Contador = () => {
    const [contador, setContador] = useState(0);

    return (
        <div>
            <p>Você clicou {contador} vezes</p>
            <button onClick={() => setContador(contador + 1)}>Clique aqui</button>
        </div>
    );
};

export default Contador;
```

### useEffect

O Hook `useEffect` permite realizar efeitos colaterais em componentes funcionais, como busca de dados, assinaturas e alterações manuais no DOM.

```jsx
import React, { useState, useEffect } from 'react';

const Relogio = () => {
    const [hora, setHora] = useState(new Date());

    useEffect(() => {
        const timerID = setInterval(() => setHora(new Date()), 1000);
        return () => clearInterval(timerID); // Cleanup
    }, []);

    return (
        <div>
            <h2>São {hora.toLocaleTimeString()}.</h2>
        </div>
    );
};

export default Relogio;
```

---

## React Router Dom: Navegando entre Páginas

O React Router DOM permite a navegação entre diferentes páginas em uma aplicação React.

### Instalação

```bash
npm install react-router-dom
```

### Utilização

```jsx
import React from 'react';
import { BrowserRouter as Router, Route, Switch, Link } from 'react-router-dom';

const Home = () => <h2>Home</h2>;
const Sobre = () => <h2>Sobre</h2>;

const App = () => {
    return (
        <Router>
            <div>
                <nav>
                    <ul>
                        <li><Link to="/">Home</Link></li>
                        <li><Link to="/sobre">Sobre</Link></li>
                    </ul>
                </nav>

                <Switch>
                    <Route path="/sobre">
                        <Sobre />
                    </Route>
                    <Route path="/">
                        <Home />
                    </Route>
                </Switch>
            </div>
        </Router>
    );
};

export default App;
```

---

## Context API: Gerenciamento de Estados Globais

A Context API permite compartilhar dados entre componentes sem a necessidade de passar props manualmente em cada nível da árvore de componentes.

### Criação de um Contexto

```jsx
import React, { createContext, useState } from 'react';

const TemaContext = createContext();

const TemaProvider = ({ children }) => {
    const [tema, setTema] = useState('claro');

    return (
        <TemaContext.Provider value={{ tema, setTema }}>
            {children}
        </TemaContext.Provider>
    );
};

export { TemaContext, TemaProvider };
```

### Utilização do Contexto

```jsx
import React, { useContext } from 'react';
import { TemaContext, TemaProvider } from './TemaContext';

const ThemedComponent = () => {
    const { tema, setTema } = useContext(TemaContext);

    return (
        <div style={{ background: tema === 'claro' ? '#fff' : '#333', color: tema === 'claro' ? '#000' : '#fff' }}>
            <p>O tema atual é {tema}</p>
            <button onClick={() => setTema(tema === 'claro' ? 'escuro' : 'claro')}>Alternar Tema</button>
        </div>
    );
};

const App = () => {
    return (
        <TemaProvider>
            <ThemedComponent />
        </TemaProvider>
    );
};

export default App;
```

---

## Integração com APIs Externas com Axios

Axios é uma biblioteca para realizar requisições HTTP.

### Instalação

```bash
npm install axios
```

### Utilização

```jsx
import React, { useState, useEffect } from 'react';
import axios from 'axios';

const Usuarios = () => {
    const [usuarios, setUsuarios] = useState([]);

    useEffect(() => {
        axios.get('https://jsonplaceholder.typicode.com/users')
            .then(response => {
                setUsuarios(response.data);
            })
            .catch(error => {
                console.error('Erro ao buscar usuários', error);
            });
    }, []);

    return (
        <div>
            <h1>Lista de Usuários</h1>
            <ul>
                {usuarios.map(usuario => (
                    <li key={usuario.id}>{usuario.name}</li>
                ))}
            </ul>
        </div>
    );
};

export default Usuarios;
```

---

## Armazenamento Local com Local e Session Storage

### Local Storage

Armazena dados no navegador sem data de expiração.

```jsx
import React, { useState } from 'react';

const App = () => {
    const [valor, setValor] = useState(localStorage.getItem('meuValor') || '');

    const salvarValor = () => {
        localStorage.setItem('meuValor', valor);
    };

    return (
        <div>
            <input type="text" value={valor} onChange={(e) => setValor(e.target.value)} />
            <button onClick={salvarValor}>Salvar no Local Storage</button>
        </div>
    );
};

export default App;
```

### Session Storage

Armazena dados no navegador que são removidos quando a sessão do navegador termina.

```jsx
import React, { useState } from 'react';

const App = () => {
    const [valor, setValor] = useState(sessionStorage.getItem('meuValor') || '');

    const salvarValor = () => {
        sessionStorage.setItem('meuValor', valor);
    };

    return (
        <div>
            <input type="text" value={valor} onChange={(e) => setValor(e.target.value)} />
            <button onClick={salvarValor}>Salvar no Session Storage</button>
        </div>
    );
};

export default App;
```
