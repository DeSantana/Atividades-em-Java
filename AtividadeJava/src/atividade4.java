import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cont =0;
		int x =0 ;

		System.out.println("Digite um número");

		x = sc.nextInt();
		if (x >= 1 && x <= 1000) {

			for (cont = 1; cont <= x; cont = cont + 2) {
				System.out.println(cont);

			}

		} else {
			System.out.println("Número Invalido");
		}

	}

}
