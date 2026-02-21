# 🛍️ TropTech Modas — Sistema de Gestão de Vendas (Java 8)

Sistema de gerenciamento de vendas desenvolvido em Java como projeto prático para consolidação de conceitos de Programação Orientada a Objetos (POO), arquitetura em camadas e boas práticas de desenvolvimento.

O projeto simula o funcionamento de um sistema interno para a empresa **TROPTECH MODAS LTDA**, focado no controle de clientes e vendas em ambiente de console.

---

## 📌 Objetivo do Projeto

Este projeto tem como principal objetivo:

* Aplicar conceitos fundamentais de **POO em Java**
* Praticar **organização em camadas (View, Service, Repository, Model)**
* Implementar **injeção manual de dependências**
* Trabalhar com **gerenciamento de dados em memória**
* Simular um sistema real de gestão comercial

Além disso, o sistema foi estruturado para facilitar futuras evoluções, como integração com banco de dados ou frameworks.

---

## 🚀 Funcionalidades

A aplicação é executada via terminal (console) e apresenta um menu interativo com as seguintes opções:

1. **Cadastrar Cliente**
   Permite registrar clientes como Pessoa Física (CPF) ou Pessoa Jurídica (CNPJ), incluindo dados de contato e endereço.

2. **Exibir Clientes**
   Lista todos os clientes cadastrados com informações formatadas.

3. **Pesquisar Cliente**
   Busca clientes pelo nome informado.

4. **Remover Cliente**
   Remove um cliente utilizando CPF ou CNPJ como identificador.

5. **Cadastrar Venda**
   Registra uma venda vinculada obrigatoriamente a um cliente, com descrição e valor total.

6. **Exibir Vendas**
   Mostra o histórico de vendas, exibindo descrição, valor e dados básicos do cliente.

7. **Sair**
   Encerra a aplicação.

---

## 🧱 Arquitetura do Projeto

O sistema foi organizado utilizando uma arquitetura em camadas, inspirada em padrões como MVC simplificado e Clean Architecture.

### Estrutura Geral

```
Main
 └── View
      └── Service
           └── Repository
                └── Model
```

### Responsabilidades

#### 📂 Model

* Representa as entidades do sistema
* Exemplo: Cliente, PessoaFisica, PessoaJuridica, Venda, Endereco
* Contém apenas dados e comportamentos básicos

#### 📂 Repository

* Responsável por armazenar e manipular dados em memória
* Centraliza o acesso às listas
* Simula uma camada de persistência

#### 📂 Service

* Contém as regras de negócio
* Valida dados
* Coordena operações entre repositories

#### 📂 View

* Interface com o usuário via console
* Exibe menus
* Coleta entradas
* Não contém regra de negócio

#### 📂 Main

* Ponto de entrada da aplicação
* Responsável por criar e conectar todas as dependências
* Atua como "Composition Root"

---

## 🔧 Tecnologias Utilizadas

* **Java 8**
* **Paradigma Orientado a Objetos**
* Execução via **Console / Terminal**
* Estruturas de dados da API padrão (List, ArrayList, etc.)

Não são utilizados frameworks externos, visando reforçar o aprendizado dos fundamentos.

---

## 📐 Conceitos Aplicados

### ✅ Programação Orientada a Objetos (POO)

* Encapsulamento
* Herança (Pessoa Física / Pessoa Jurídica)
* Polimorfismo
* Abstração

### ✅ Arquitetura em Camadas

Separação clara entre:

* Interface
* Regras
* Dados
* Entidades

Facilitando manutenção e evolução.

### ✅ Injeção de Dependência Manual

As dependências são criadas na classe `Main` e injetadas nos construtores:

```java
ClienteService clienteService =
    new ClienteService(pessoaFisicaRepo, pessoaJuridicaRepo);
```

Isso evita acoplamento e duplicação de dados em memória.

### ✅ Gerenciamento de Ciclo de Vida de Objetos

* Repositories possuem instância única
* Dados são compartilhados entre as camadas
* Evita criação excessiva de objetos

### ✅ Boas Práticas

* Separação de responsabilidades
* Baixo acoplamento
* Código organizado por domínio
* Métodos com propósito claro

---

## ▶️ Como Executar

### Pré-requisitos

* Java JDK 8 ou superior
* IDE (IntelliJ, Eclipse, VS Code) ou terminal

### Passos

1. Clone o repositório:

```bash
git clone <url-do-repositorio>
```

2. Compile o projeto

3. Execute a classe `Main`

4. Interaja com o menu pelo terminal

---

## 💾 Persistência de Dados

Atualmente, o sistema trabalha com **dados em memória**:

* Os dados existem apenas durante a execução
* Ao encerrar o programa, são perdidos

A arquitetura foi preparada para futura integração com banco de dados.

---

## 🔮 Possíveis Evoluções

Algumas melhorias planejadas ou possíveis:

* Integração com banco de dados (JDBC / JPA)
* Interface gráfica ou Web
* Validações mais robustas
* Autenticação de usuários
* Relatórios
* Uso de Spring Framework



