ProjetoDio
package com.mycompany.treinamento;
import javax.swing.JOptionPane;

public class Treinamento {
  public static void main(String[] args) {
    //declaração 
    String nome; 
    double nota1, nota2, media;
    for (int i = 0; i <3; i++) {
      nome = JOptionPane.showInputDialog("Digite o nome do " +(i+1)+"° Aluno");
      nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do " +(i+1)+"° Aluno"));
      nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do " +(i+1)+"° Aluno"));
      //calculo
      media = (nota1 + nota2)/2;
      //saida
      JOptionPane.showMessageDialog(null, "Nome do Aluno: " + nome + "\nNota1: " + nota1 + "\nNota2: " + nota2 + "\nMedia: " + media);
    }
  }
}