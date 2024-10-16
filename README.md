# Engenharia-De-Software-1-Trabalho-Prático

**Instituto de Computação (IC)**  
**Departamento de Ciência da Computação (DCC)**  
**MATA62 – Engenharia de Software I**  
**Semestre:** 2024.1  
**Docente:** Claudio Nogueira Santana  
**Discente:** Bruno de Sousa Behrmann  

## Objetivo

O projeto visa o desenvolvimento de um sistema básico de biblioteca, focado em práticas de programação orientada a objetos. A documentação completa está disponível no arquivo [EnunciadoDoTrabalho.pdf](EnunciadoDoTrabalho.pdf).

## Visão Geral do Sistema

O sistema gerencia livros em uma biblioteca acadêmica, oferecendo funcionalidades para empréstimo, devolução, reserva e observação de livros por professores. Os usuários incluem alunos de graduação, pós-graduação e professores, cada um com regras específicas de empréstimo.

### Funcionalidades Principais

- **Empréstimo:** Permite que usuários emprestem livros, com regras baseadas no tipo de usuário.
- **Devolução:** Gerencia a devolução de livros emprestados.
- **Reserva:** Usuários podem reservar livros; limite de 3 reservas por usuário.
- **Observação:** Professores podem se registrar para serem notificados sobre livros com mais de duas reservas.
- **Consultas:** Informações sobre livros e usuários podem ser consultadas via comandos específicos.

## Exigências de Projeto

1. **Sem Persistência de Dados:** Dados são armazenados apenas em memória.
2. **Sem Interface Gráfica:** Todos os comandos e respostas são via linha de comando.

## Dados de Teste (instanciados na classe BancoDeDados)

**Usuários:**

| Código | Tipo Usuário             | Nome                |
|--------|--------------------------|---------------------|
| 123    | Aluno de Graduação        | João da Silva       |
| 456    | Aluno de Pós-graduação    | Luiz Fernando Rodrigues |
| 789    | Aluno de Graduação        | Pedro Paulo         |
| 100    | Professor                 | Carlos Lucena       |

**Livros:**

| Código | Título                                        | Editora       | Autores                              | Edição | Ano Publicação |
|--------|-----------------------------------------------|---------------|--------------------------------------|--------|----------------|
| 100    | Engenharia de Software                        | Addison-Wesley| Ian Sommerville                      | 6ª     | 2000           |
| 101    | UML – Guia do Usuário                         | Campus        | Grady Booch, James Rumbaugh, Ivar Jacobson | 7ª     | 2000           |
| 200    | Code Complete                                | Microsoft Press| Steve McConnell                      | 2ª     | 2014           |
| 201    | Agile Software Development, Principles, Patterns, and Practices | Prentice Hall | Robert Martin                         | 1ª     | 2002           |
| 300    | Refactoring: Improving the Design of Existing Code | Addison-Wesley| Martin Fowler                        | 1ª     | 1999           |
| 301    | Software Metrics: A Rigorous and Practical Approach | CRC Press     | Norman Fenton, James Bieman          | 3ª     | 2014           |
| 400    | Design Patterns: Elements of Reusable Object-Oriented Software | Addison-Wesley | Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides | 1ª     | 1994           |
| 401    | UML Distilled: A Brief Guide to the Standard Object Modeling Language | Addison-Wesley | Martin Fowler                        | 3ª     | 2003           |

**Exemplares:**

| Código do Livro | Código Exemplar | Status     |
|-----------------|-----------------|------------|
| 100             | 01              | Disponível  |
| 100             | 02              | Disponível  |
| 101             | 03              | Disponível  |
| 200             | 04              | Disponível  |
| 201             | 05              | Disponível  |
| 300             | 06              | Disponível  |
| 300             | 07              | Disponível  |
| 400             | 08              | Disponível  |
| 400             | 09              | Disponível  |
