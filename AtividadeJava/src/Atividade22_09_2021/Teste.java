package Atividade22_09_2021;

import java.util.Scanner;

public class Teste {
	// Variável Global é acessivél a todos
 static int maiorIdadeGlobal = 30;

	// Main é um método auto executavel em Java
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variável local porque pertence somente a esse método
		int maiorIdade = 18;
      System.out.println("Valor da Variável local = "+maiorIdade);
      System.out.println("Valor da Variável Global = "+maiorIdadeGlobal);
      metodo2 ();
	}

	public static void metodo2() {
  System.out.println("Valor da Variável Global = "+maiorIdadeGlobal);
  	
		
	}
}
