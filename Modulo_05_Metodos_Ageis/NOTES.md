# Módulo 5: Gerenciamento de Projetos com Métodos Ágeis

## Introdução

Os métodos ágeis são abordagens para o desenvolvimento de software que enfatizam a flexibilidade, a colaboração e a entrega rápida de valor. Eles surgiram como uma alternativa aos métodos tradicionais, como o modelo cascata, para enfrentar as mudanças frequentes nos requisitos e melhorar a satisfação do cliente.

## Modelo Cascata (Waterfall)

O **modelo cascata** é um método de desenvolvimento de software linear e sequencial. Cada fase do processo de desenvolvimento deve ser concluída antes que a próxima comece. As principais fases do modelo cascata são:

1. **Requisitos**: Levantamento e documentação dos requisitos do sistema.
2. **Design**: Arquitetura e design do sistema.
3. **Implementação**: Desenvolvimento e codificação do sistema.
4. **Verificação**: Testes para garantir que o sistema atenda aos requisitos.
5. **Manutenção**: Correções e atualizações após a entrega do sistema.

<div align="center">
  <img src="https://github.com/user-attachments/assets/fea710e0-cac4-4704-86cf-313a43244a13" />
</div>

### Vantagens
- Simplicidade e clareza das etapas.
- Facilidade de gerenciamento devido ao seu caráter estruturado.

### Desvantagens
- Rigidez: difícil acomodar mudanças nos requisitos.
- Atrasos: problemas descobertos tardiamente podem ser caros para corrigir.

## Manifesto Ágil

O **Manifesto Ágil** foi criado em 2001 por 17 desenvolvedores que buscaram melhorar os processos de desenvolvimento de software. Ele é composto por quatro valores fundamentais e doze princípios. O manifesto encontra-se disponível através [deste link](https://agilemanifesto.org/iso/ptbr/manifesto.html).


### Valores

1. **Indivíduos e interações** mais que processos e ferramentas.
2. **Software em funcionamento** mais que documentação abrangente.
3. **Colaboração com o cliente** mais que negociação de contratos.
4. **Responder a mudanças** mais que seguir um plano.

### Princípios

- Satisfação do cliente através da entrega contínua e rápida de software.
- Acolher mudanças nos requisitos, mesmo em fases avançadas.
- Entregar software funcional frequentemente (semanas, não meses).
- Colaboração constante entre clientes e desenvolvedores.
- Construir projetos em torno de indivíduos motivados, dando-lhes o ambiente e suporte necessários.
- Conversa face a face é a forma mais eficiente e eficaz de comunicação.
- Software em funcionamento é a principal medida de progresso.
- Desenvolvimento sustentável, mantendo um ritmo constante.
- Excelência técnica e bom design aumentam a agilidade.
- Simplicidade é essencial.
- As melhores arquiteturas, requisitos e designs emergem de equipes auto-organizadas.
- Ajustes regulares para melhorar a eficácia.

## Scrum

**Scrum** é um framework ágil que permite que equipes trabalhem juntas para desenvolver, entregar e sustentar produtos complexos. É baseado em iterações chamadas Sprints, que são ciclos de desenvolvimento de curta duração (geralmente 2-4 semanas).

### Papéis

- **Product Owner**: Responsável por maximizar o valor do produto e gerenciar o backlog do produto.
- **Scrum Master**: Facilita o processo Scrum e ajuda a remover impedimentos.
- **Development Team**: Equipe auto-organizada que trabalha na entrega do incremento de produto.

### Eventos

- **Sprint Planning**: Planejamento do trabalho a ser realizado na Sprint.
- **Daily Scrum**: Reunião diária de 15 minutos para sincronizar as atividades.
- **Sprint Review**: Revisão do trabalho realizado na Sprint e adaptação do backlog do produto.
- **Sprint Retrospective**: Reunião para discutir o que funcionou bem, o que pode ser melhorado e como melhorar.

### Artefatos

- **Product Backlog**: Lista ordenada de tudo que é necessário no produto.
- **Sprint Backlog**: Conjunto de itens do Product Backlog selecionados para a Sprint.
- **Increment**: Soma de todos os itens do Product Backlog completados durante a Sprint.

<div align="center">
  <img src="https://github.com/user-attachments/assets/efe4316a-087f-44b7-be80-78efeabf3153" />
</div>

## Kanban

**Kanban** é um método ágil para gerenciar o trabalho com foco na entrega contínua e na melhoria contínua. Ele utiliza um quadro Kanban para visualizar o fluxo de trabalho.

### Princípios

1. **Visualize o fluxo de trabalho**: Usar um quadro Kanban para mostrar as tarefas em andamento.
2. **Limite o trabalho em progresso (WIP)**: Definir limites para o número de tarefas que podem estar em progresso simultaneamente.
3. **Gerencie o fluxo**: Otimizar o fluxo de trabalho para aumentar a eficiência.
4. **Deixe as políticas explícitas**: Definir regras claras para o processo.
5. **Use loops de feedback**: Realizar reuniões regulares para discutir o progresso e melhorias.
6. **Melhore colaborativamente**: Buscar melhoria contínua através de pequenas mudanças incrementais.

### Exemplo de Quadro Kanban

<div align="center">
  <img src="https://github.com/user-attachments/assets/34828fd5-47bf-4d0f-89cf-9d3c77fd21bd" />
</div>

## SDLC (Ciclo de Vida de Desenvolvimento de Software)

O **SDLC (Software Development Life Cycle)** é um processo para planejar, criar, testar e implantar um sistema de informação. Ele é composto por várias fases:

1. **Planejamento**: Definir o escopo e os objetivos do projeto.
2. **Análise**: Coletar e analisar os requisitos do sistema.
3. **Design**: Arquitetura e design do sistema.
4. **Implementação**: Codificação e desenvolvimento do sistema.
5. **Testes**: Verificação e validação do sistema para garantir que ele atenda aos requisitos.
6. **Implantação**: Colocar o sistema em produção.
7. **Manutenção**: Correções e atualizações contínuas após a implantação.

No contexto de projetos de software, essas fases ocorrem em geral de forma iterativa, isto é, o desenvolvimento do projeto se dá em ciclos iterativos, permitindo ajustes contínuos.
Na perspectiva ágil, o processo acontece por meio de iterações rápidas e entrega contínua de valor, com foco na colaboração e adaptação às mudanças.

### Entrega Evolutiva
A entrega evolutiva é uma abordagem para desenvolvimento e entrega de software onde o produto é desenvolvido e entregue em incrementos. Cada incremento é uma versão funcional do produto, permitindo o feedback contínuo dos usuários e a adaptação às mudanças nos requisitos ao longo do tempo.

<div align="center">
  <img src="https://github.com/user-attachments/assets/c1239946-6263-4a07-8965-bd566d15670a" />
</div>

### MVP vs. MMP vs. MLP

* MVP (Minimum Viable Product): O MVP (Produto Viável Mínimo) é uma versão inicial de um produto com o mínimo de funcionalidades necessárias para que ele possa ser utilizado pelos primeiros clientes e gerar feedback. O objetivo é testar rapidamente uma ideia com o mínimo de esforço e desenvolvimento.
* MMP (Minimum Marketable Product): O MMP (Produto Mínimo Comercializável) é uma versão do produto que contém o mínimo de funcionalidades necessárias para ser lançado no mercado e atender aos clientes iniciais. Ele vai além do MVP, focando em um conjunto de funcionalidades que agregam valor suficiente para serem comercializadas.
* MLP (Minimum Lovable Product): O MLP (Produto Mínimo Amável) é uma evolução do MMP, focando não apenas em funcionalidades mínimas, mas também em criar uma experiência de usuário que encante os clientes. O objetivo é lançar uma versão do produto que seja amada pelos usuários e crie uma base de clientes leais.

<div align="center">
  <img src="https://github.com/user-attachments/assets/07101b14-40d9-4fd8-9ec2-c7dd43f00de5" />
</div>
