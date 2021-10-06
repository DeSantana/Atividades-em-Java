package Atividade21_09_2021;

import java.util.Scanner;

class Atividade01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
	    String usuario,senha,idusuario,idsenha;   
	    System.out.println("Ótimo,vamos fazer seu cadastro!");
	    
	    
		System.out.println("Crie seu loguin:");
		usuario = sc.next();
		System.out.println("Crie sua senha:");
		senha = sc.next();
			
		System.out.println("Entre com seu loguin:");
		idusuario = sc.next();
		System.out.println("Entre com sua senha:");
		idsenha = sc.next();
			
		if ((idusuario.equals(usuario))&&(idsenha.equals(senha))){
			System.out.println("Seus dados foram Salvos!");
		}
		else {
			System.out.println("Senha ou loguin incorretos!");
		}
	}
}
