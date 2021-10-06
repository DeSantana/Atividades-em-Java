package Atividade22_09_2021;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Teste3 {

	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);

		String nota1 = JOptionPane.showInputDialog("Informa a primeira nota");
		String nota2 = JOptionPane.showInputDialog("Informa a segunda nota");
		String nota3 = JOptionPane.showInputDialog("Informa a terceira nota");
		String nota4 = JOptionPane.showInputDialog("Informa a quarta nota");

		double Dnota1 = Double.parseDouble(nota1);
		double Dnota2 = Double.parseDouble(nota2);
		double Dnota3 = Double.parseDouble(nota3);
		double Dnota4 = Double.parseDouble(nota4);

		double media = (Dnota1 + Dnota2 + Dnota3 + Dnota4) / 4;
		JOptionPane.showMessageDialog(null, "A média é: " + media);

		if (media >= 50) {

			if (media >= 70) {
				JOptionPane.showMessageDialog(null, "Aluno está aprovado com a média de:" + media);
			} else {
				JOptionPane.showMessageDialog(null, "Aluno está em recuperação com a média de:" + media);
			}

		} else {
			JOptionPane.showMessageDialog(null, "Aluno está reprovado com a média de:" + media);

		}

	}

}
