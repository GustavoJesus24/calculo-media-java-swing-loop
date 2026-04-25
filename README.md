# 📚 Exercício: Cálculo de Médias com Java Swing

Este repositório contém um programa simples em Java desenvolvido para fins de treinamento. O objetivo é praticar conceitos básicos de lógica de programação, manipulação de strings, conversão de tipos e interação com o usuário via interface gráfica básica.

## 🚀 Funcionalidades

- **Laço de Repetição:** O sistema processa os dados de 3 alunos consecutivamente usando um laço `for`.
- **Interatividade:** Utiliza a classe `JOptionPane` da biblioteca `javax.swing` para entrada e saída de dados em janelas flutuantes.
- **Processamento:** Realiza a conversão de `String` para `Double` e calcula a média aritmética entre duas notas.

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java
- **Biblioteca:** Swing (Interface Gráfica)
- **IDE Recomendada:** NetBeans, IntelliJ ou Eclipse

## 📝 Explicação do Código

O fluxo do programa segue a estrutura padrão de processamento de dados:

1. **Entrada:** O usuário digita o nome e as duas notas através de caixas de diálogo.

2. **Conversão:** Como a entrada do Swing é textual, utilizamos `Double.parseDouble` para permitir cálculos matemáticos.

3. **Cálculo:**

   $$media = \frac{nota1 + nota2}{2}$$

4. **Saída:** Uma janela exibe o resumo com o nome do aluno, as notas individuais e a média final.
