package Exercicios;

import javax.swing.*;

import controller.Controller04;

public class Exercicio04 {

	public static void main (String[] args) {
		
		Controller04 Negativos = new Controller04();
		
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor: "));
		
		int vetor[] = new int [tamanho];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		}
		
		int totalNegativos = Negativos.Negativos(vetor, tamanho);

	    System.out.println("O total de números negativos é: " + totalNegativos);
	}
}
