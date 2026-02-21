TropTech Modas - Sistema de Gestão de Vendas (Java 8)
Este repositório contém o sistema de gerenciamento de vendas da TROPTECH MODAS LTDA, desenvolvido como projeto prático para consolidar conceitos de Programação Orientada a Objetos (POO) utilizando a linguagem Java.
📋 Sobre o Projeto
O sistema foi projetado para atender à demanda de crescimento de uma loja de roupas e acessórios, focando em dois pilares: Cadastro de Clientes e Gestão de Vendas. A implementação utiliza os quatro pilares da POO: Abstração, Encapsulamento, Herança e Composição.
🚀 Funcionalidades
A aplicação é executada via console e oferece um menu interativo com as seguintes opções:
1. Cadastrar Cliente: Permite registrar clientes como Pessoa Física (CPF) ou Pessoa Jurídica (CNPJ), incluindo dados de contato e endereço.
2. Exibir Clientes: Lista todos os clientes com seus respectivos detalhes e endereço formatado.
3. Pesquisar Cliente: Localiza clientes através do nome informado pelo usuário.
4. Remover Cliente: Exclui um cliente da base de dados utilizando o CPF ou CNPJ como critério.
5. Cadastrar Venda: Registra uma nova venda vinculada obrigatoriamente a um cliente, contendo descrição e valor total.
6. Exibir Vendas: Mostra o histórico de vendas, exibindo a descrição, valor e informações básicas do cliente (nome e telefone).
7. Sair: Encerra o programa.
🛠️ Detalhes da Implementação (Java 8)
Estrutura de Classes e Encapsulamento
• Herança: A classe Cliente serve como base para PessoaFisica e PessoaJuridica, compartilhando atributos como nome, telefone e endereço.
• Composição (Endereço): Conforme solicitado pelos requisitos, o endereço foi estruturado em uma classe dedicada (representando a "struct" mencionada no projeto) com os campos: rua, número, cidade, estado e país.
• Encapsulamento Estrito: Todos os atributos das classes são privados, sendo acessados exclusivamente através de métodos públicos get e set.
• Método toString(): Sobrescrito para facilitar a exibição formatada dos dados dos clientes.
Regras de Negócio Aplicadas
• Endereço Formatado: A classe de endereço possui um método que retorna uma string no formato padrão: rua, número, cidade/estado - país.
• Venda Qualificada: Uma instância de Venda só pode ser criada se houver um objeto Cliente associado via construtor.
• Armazenamento em Memória: Os dados são gerenciados em três listas separadas (ArrayList) para Pessoas Físicas, Pessoas Jurídicas e Vendas.
