import java.util.Scanner;

public class atividade5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x, y, soma = 0, cont;

		System.out.println("Digite o valor de X:");
		x = sc.nextInt();
		System.out.println("Digite o valor de Y:");
		y = sc.nextInt();

		if (x < y) {

			for (cont = x + 1; cont < y; cont++) {

				if (cont % 2 != 0) {
					soma += cont;
				}
			}

		} else {
			for (cont = y + 1; cont < x; cont++) {

				if (cont % 2 != 0) {
					soma += cont;
				}
			}
		}
	 System.out.println(soma);
	}

}
