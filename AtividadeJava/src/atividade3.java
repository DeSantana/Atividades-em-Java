import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
	
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		
        int cont = 0;
        double media = 0;
        double x;
        
        for (int i = 0; i < 6; i++) {
        	x = leitor.nextDouble();
        	if (x > 0) {
        		cont++;
        		media += x;
        	}
        }
        
        media = media / cont;
        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media));
    }
	


	}


