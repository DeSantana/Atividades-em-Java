import java.util.Scanner; 

  

public class atividade1 { 

  

	public static void main(String[] args) { 

	Scanner leia = new Scanner(System.in); 

	double  valor1, valor2; 

	 

	System.out.println("Informe o valor do seu salário: "); 

	valor1=leia.nextDouble(); 

      

	if (valor1 <= 2000){ 

	System.out.println("Isento de Imposto!"); 

	 

	}  

	else if((valor1 >=2000.01)&&(valor1 <=3000)){ 

		valor2=(valor1-2000)* 8/100; 

		String resultado = String.format("R$ %,.2f", valor2); 

		System.out.println(resultado); 

	} 

	else if((valor1 >3000)&& (valor1 <=4500)){ 

		valor2=(1000*8/100)+((valor1-3000)*18/100); 

		String resultado = String.format("R$ %,.2f", valor2); 

		System.out.println(resultado); 

		 

	} 

	else { 

		valor2= (1000*8/100)+(1500*18/100)+((valor1-4500)*28/100); 

		String resultado = String.format("R$ %,.2f", valor2); 

		System.out.println(resultado); 

	} 

	 

	} 

  

} 

   


  