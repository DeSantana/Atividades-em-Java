package Atividade22_09_2021;

import java.util.Scanner;

public class Teste {
	// Vari�vel Global � acessiv�l a todos
 static int maiorIdadeGlobal = 30;

	// Main � um m�todo auto executavel em Java
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Vari�vel local porque pertence somente a esse m�todo
		int maiorIdade = 18;
      System.out.println("Valor da Vari�vel local = "+maiorIdade);
      System.out.println("Valor da Vari�vel Global = "+maiorIdadeGlobal);
      metodo2 ();
	}

	public static void metodo2() {
  System.out.println("Valor da Vari�vel Global = "+maiorIdadeGlobal);
  	
		
	}
}
