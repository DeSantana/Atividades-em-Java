import java.util.Scanner;
public class atividade6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int totalAnimal = 0, coelho = 0, rato = 0, sapo = 0, teste, quantA = 0, cont = 0;
		String animal;

		System.out.println("Digite quantos teste foram realizados: ");
		teste = sc.nextInt();

		while (cont < teste) {

			System.out.println("Digite a quantidade de animais e qual animal: ");
			quantA = sc.nextInt();

			System.out.println("C = Coelho, R = Rato, S = Sapo ");
			animal = sc.next();

			totalAnimal += quantA;

			if (animal.equals("C") || animal.equals("c")) {
				coelho += quantA;

			}else if (animal.equals("R") || animal.equals("r")) {
				rato += quantA;
			}else if (animal.equals("S") || animal.equals("s")) {
				sapo += quantA;

			}	
			cont++;

		}
		System.out.println("Total: " + totalAnimal + " cobaias");
		System.out.println("Total de coelhos: " + coelho);
		System.out.println("Total de ratos: " + rato);
		System.out.println("Total de sapos: " + sapo);
		System.out.println("Percentual de coelhos: " + 100 * coelho / totalAnimal +"%");
		System.out.println("Percentual de ratos: " + 100 * rato / totalAnimal + "%");
		System.out.println("Percentual de sapos: " + 100 * sapo / totalAnimal + "%");
	}

}