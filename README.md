# Banco Digital - Orientado a Objetos (Java)

Este projeto é uma implementação simples de um sistema bancário digital em Java, utilizando conceitos de Programação Orientada a Objetos (POO). O sistema permite criar contas correntes e poupança, realizar depósitos, saques e consultar saldos e extratos.

---

## Funcionalidades

- Criação de contas correntes e contas poupança com números automáticos.
- Operações básicas: depósito, saque e consulta de saldo.
- Controle de múltiplos clientes usando coleções (`HashSet`).
- Busca de contas por número.
- Impressão de extratos das contas.

---

## Tecnologias

- Java 11+
- Collections Framework (Set, HashSet)
- Lambda Expressions e Streams

---

## Estrutura do Projeto

- `Conta` (classe abstrata): Define atributos e métodos comuns às contas.
- `ContaCorrente` e `ContaPoupanca`: Implementações concretas de contas.
- `Operacoes`: Interface implementada por ContaCorrente e ContaPoupanca
- `SistemaBanco`: Gerencia o cadastro de clientes e operações.
- `App`: Classe principal para executar e testar o sistema.

---
