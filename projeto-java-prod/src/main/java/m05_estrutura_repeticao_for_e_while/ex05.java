package m05_estrutura_repeticao_for_e_while;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {

		/*
		 * Enquanto estamos digitando a nota DIFERENTE dos valores 0 e 10 ele vai ficar
		 * pedindo a nota correta
		 */
		/* Intervalo de nota correta é entre 0 e 10 */

		Scanner scanner = new Scanner(System.in);

		int nota = -1;
		while (nota < 0 || nota > 10) { /*Enquando o valor for diferente de 0 e 10, ele repete*/
			System.out.println("Digite uma nota entre 0 e 10");
			nota = scanner.nextInt();
		}
		scanner.close();
		System.out.println("Nota validada com sucesso: " + nota);

	}

}
