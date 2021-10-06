package Atividade22_09_2021;

import java.util.Scanner;

class Atividade01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double valor1, valor2, valor3;

		System.out.println("Digite o primeiro número fracionário:");
		valor1 = sc.nextDouble();
		System.out.println("Digite o segundo número fracionário:");
		valor2 = sc.nextDouble();
		System.out.println("Digite o terceiro número fracionário:");
		valor3 = sc.nextDouble();

		if (valor1 > valor2 + valor3) {
			System.out.println("Primeiro maior que a soma dos outros dois");
			System.out.println(" valor1 = " + valor1 + " valor2 = " + valor2 + " valor3 = " + valor3);

		} else {
			System.out.println("O primeiro número não é maior que os outros dois");
		}
	}

}