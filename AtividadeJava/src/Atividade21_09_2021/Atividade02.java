package Atividade21_09_2021;

import java.util.Scanner;

class Atividade02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float peso,altura, imc;
		
		System.out.println("Digite seu peso:");
		peso = sc.nextFloat();
		
		System.out.println("Digite sua Altura:");
		altura = sc.nextFloat();
		 
	    imc = peso / (altura*altura );
	    		
	   System.out.printf("IMC:  "+"%.2f",imc); 		
	    
	   if ((imc >=18.5) && (imc <25)) {
		 System.out.println("Parabens! Você está no seu peso ideal");  
	   }
	   else {
		   System.out.println("Você não está na faixa de peso ideal");
	   }
	}

}
