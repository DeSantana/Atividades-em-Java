package Atividade22_09_2021;

import java.util.Scanner;

class Ativdade03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cont = 0;

		for (int i = 1000; i < 2000; i++) {
			if (i % 11 == 5) {
				System.out.println(i);

				if (++cont > 20) {
					System.out.println();
					cont = 0;
				}

			}

		}
	}
}
