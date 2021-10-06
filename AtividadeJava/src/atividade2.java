import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args)
	{
	int ddd; 
	Scanner leia = new Scanner(System.in);
	System.out.println("Digite o DDD: ");
	ddd = leia.nextInt();
	switch(ddd) {
	case 61:
	      System.out.println("Brasília");
	      break;
	case 71:
          System.out.println("Salvador");
         break; 
	case 11:
          System.out.println("São Paulo");
         break;    
	case 21: 
		  System.out.println("Rio de Janeiro"); 
	       break;       
	case 32:       
	     System.out.println("Juiz de Fora");
	     break;
	case 19: 
	     System.out.println("Campinas");
	     break; 
	case 27:
	     System.out.println("Vitoria");
	     break;
	case 31:
		 System.out.println("Belo Horizonte");
		 break;
	case 81:
		System.out.println("Pernambuco");
		break;
		
    default:
    	
          System.out.println("DDD Não encontrado");
 }             

	}
 }