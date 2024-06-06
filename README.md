# Desafio Proposto (Trilha Java Básico) - Controle de Fluxo

## Autor do Desafio:
Gleyson Sampaio

## Sintaxe
Vamos exercitar todo o conteúdo apresentado no módulo de Controle de Fluxo codificando o seguinte cenário.

O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros, com estes dois números você deverá obter a quantidade de interações (for) e realizar a impressão no console (System.out.print) dos números incrementados, exemplo:
+ Se você passar os números 12 e 30, logo teremos uma interação (for) com 18 ocorrências para imprimir os números, exemplo:
<kbd>Imprimindo o número 1</kbd>, <kbd>Imprimindo o número 2</kbd> e assim por diante.
+ Se o primeiro parâmetro for MAIOR que o segundo parâmetro, você deverá lançar a exceção customizada chamada de
<kbd>ParametrosInvalidosException</kbd> com a segunda mensagem: "O segundo parâmetro deve ser maior que o primeiro"

1. Crie o projeto <kbd>DesafioControlFluxo</kbd>;
2. Dentro do projeto, crie a classe <kbd>Contador.java</kbd> para realizar toda a codificação do nosso programa;
3. Dentro do projeto, crie a classe <kbd>ParametrosInvalidosException</kbd> que representará a exceção de negócio no sistema;
