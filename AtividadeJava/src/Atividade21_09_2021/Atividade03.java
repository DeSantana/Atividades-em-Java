package Atividade21_09_2021;
import java.util.Scanner;
class Atividade03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	

		int contador = 1;
		int numeroInforme;
		
		System.out.println("Informe o valor da tabuada:");
		numeroInforme = sc.nextInt();
		while (contador <=10){
			System.out.println(numeroInforme+" X "+contador+" = "+contador * numeroInforme);
			contador ++;
		}
	}

}
