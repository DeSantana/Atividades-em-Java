package Atividade22_09_2021;

import java.util.Scanner;

import javax.swing.JOptionPane;;

public class Teste2 {

	private static final JOptionPane JoptionPane = null;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros:");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas:");

		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);
		int divisao = (int) (carroNumero / pessoaNumero);
		double resto = carroNumero % pessoaNumero;

		int resposta = JoptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");

		if (resposta == 0) {
			JoptionPane.showMessageDialog(null, "Divisão para pessoas deu: " + divisao);
		}

		resposta = JoptionPane.showConfirmDialog(null, "Deseja ver o RESTO da divisão?");

		if (resposta == 0) {
			JoptionPane.showMessageDialog(null, "O resto da divisão é: " + resto);
		}
	}
}