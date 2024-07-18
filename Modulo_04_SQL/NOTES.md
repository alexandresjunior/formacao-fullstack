# Módulo 4: Banco de Dados MySQL

## Introdução
Neste módulo, veremos os seguintes assuntos:
- Banco de dados
  - Conceitos básicos
  - MySQL
  - Instalação
  - Configuração básica
  - Criação de um banco de dados
- DDL (Data Definition Language)
  - CREATE
  - ALTER
  - DROP
  - CONSTRAINTS
- DML (Data Manipulation Language)
  - INSERT
  - UPDATE
  - DELETE
- DQL (Data Query Language)
  - SELECT (SELECT, FROM, WHERE, ORDER BY, GROUP BY, HAVING)
  - Funções de agregação (MIN, MAX, AVG, COUNT, SUM)
  - JOIN (INNER, LEFT, RIGHT)

---

## Banco de Dados

### Conceitos Básicos

Um banco de dados é uma coleção organizada de dados, geralmente armazenados e acessados eletronicamente a partir de um sistema de computador. O Sistema de Gerenciamento de Banco de Dados (SGBD) é o software que interage com os usuários, aplicações e o próprio banco de dados para capturar e analisar os dados.

### MySQL

**MySQL** é um SGBD relacional de código aberto, muito popular para aplicações web devido à sua performance, confiabilidade e facilidade de uso.

### Instalação

Para instalar o MySQL, você pode baixar e instalar a partir do site oficial [MySQL Downloads](https://dev.mysql.com/downloads/installer/).

### Configuração Básica

Após a instalação, é necessário configurar o MySQL, geralmente definindo um usuário root e uma senha de acesso.

```bash
mysql -u root -p
```

### Criação de um Banco de Dados

```sql
CREATE DATABASE escola;
```

---

## DDL (Data Definition Language)

### CREATE

Cria um novo banco de dados ou tabela.

```sql
CREATE TABLE alunos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    idade INT NOT NULL,
    turma VARCHAR(50)
);
```

### ALTER

Modifica a estrutura de uma tabela existente.

```sql
ALTER TABLE alunos ADD COLUMN endereco VARCHAR(255);
```

### DROP

Remove uma tabela ou banco de dados.

```sql
DROP TABLE alunos;
DROP DATABASE escola;
```

### CONSTRAINTS

Restrições são usadas para limitar o tipo de dados que pode ser inserido em uma tabela.

```sql
CREATE TABLE professores (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    idade INT CHECK (idade >= 21)
);
```

---

## DML (Data Manipulation Language)

### INSERT

Insere novos registros em uma tabela.

```sql
INSERT INTO alunos (nome, idade, turma) VALUES ('João Silva', 15, '10A');
```

### UPDATE

Atualiza registros existentes em uma tabela.

```sql
UPDATE alunos SET idade = 16 WHERE nome = 'João Silva';
```

### DELETE

Remove registros de uma tabela.

```sql
DELETE FROM alunos WHERE nome = 'João Silva';
```

---

## DQL (Data Query Language)

### SELECT

Seleciona dados de uma tabela.

```sql
SELECT nome, idade FROM alunos;
```

#### SELECT com condições

```sql
SELECT nome, idade FROM alunos WHERE turma = '10A';
```

### ORDER BY

Ordena os resultados.

```sql
SELECT nome, idade FROM alunos ORDER BY idade DESC;
```

### GROUP BY

Agrupa os resultados.

```sql
SELECT turma, COUNT(*) as total_alunos FROM alunos GROUP BY turma;
```

### HAVING

Filtra grupos de resultados.

```sql
SELECT turma, COUNT(*) as total_alunos FROM alunos GROUP BY turma HAVING COUNT(*) > 10;
```

### Funções de Agregação

- **MIN**: Valor mínimo.

  ```sql
  SELECT MIN(idade) as idade_minima FROM alunos;
  ```

- **MAX**: Valor máximo.

  ```sql
  SELECT MAX(idade) as idade_maxima FROM alunos;
  ```

- **AVG**: Média dos valores.

  ```sql
  SELECT AVG(idade) as idade_media FROM alunos;
  ```

- **COUNT**: Contagem de registros.

  ```sql
  SELECT COUNT(*) as total_alunos FROM alunos;
  ```

- **SUM**: Soma dos valores.

  ```sql
  SELECT SUM(idade) as idade_total FROM alunos;
  ```

### JOIN

#### INNER JOIN

Retorna registros que têm correspondências em ambas as tabelas.

```sql
SELECT alunos.nome, professores.nome as professor
FROM alunos
INNER JOIN professores ON alunos.turma = professores.turma;
```

#### LEFT JOIN

Retorna todos os registros da tabela à esquerda, e os registros correspondentes da tabela à direita.

```sql
SELECT alunos.nome, professores.nome as professor
FROM alunos
LEFT JOIN professores ON alunos.turma = professores.turma;
```

#### RIGHT JOIN

Retorna todos os registros da tabela à direita, e os registros correspondentes da tabela à esquerda.

```sql
SELECT alunos.nome, professores.nome as professor
FROM alunos
RIGHT JOIN professores ON alunos.turma = professores.turma;
```

