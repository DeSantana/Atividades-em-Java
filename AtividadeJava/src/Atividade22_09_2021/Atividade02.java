package Atividade22_09_2021;

import java.util.Scanner;

class Atividade02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite a velocidade do carro: ");

		float velCarro = leia.nextFloat(); 

		System.out.print("Digite a velocidade máxima da rua: ");

		float velMax = leia.nextFloat(); 

		float kmAcima = velCarro - velMax;

		System.out.print("A multa é de: ");

		if (kmAcima <= 10 && kmAcima > 0) {

			System.out.println("R$50");   // velocidade 15 km/velocidade da rua 10    

		} else if (kmAcima > 10 && kmAcima <= 30) {

			System.out.println("R$100");  // velocidade 35 km/velocidade da Rua 10

		} else if (kmAcima > 30) {

			System.out.println("R$300"); // velocidade 100 km/ velocidade da rua 50

		} else {

			System.out.println("R$0"); 

		}

	}

}
