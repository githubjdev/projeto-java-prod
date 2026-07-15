package m05_estrutura_repeticao_for_e_while;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {

		/* Enquanto o valor for diferente de -1 então pode ir adicionando valores. */

		Scanner scanner = new Scanner(System.in);
		List<Integer> notas = new ArrayList<Integer>();
		int nota = 0;
		int contador = 1;
		System.out.println("Informe o -1 para sair do sistema:");

		while (nota != -1) { /* Enquanto a nota for diferente de -1 */
			System.out.println("Informe a nota: " + contador);
			nota = scanner.nextInt(); /* pega do teclado */
			if (nota >= 0) {
				notas.add(nota);
				contador++;
			}
		}

		scanner.close();

		System.out.println("Nota que forma informadas:");
		for (Integer n : notas) {
			System.out.println("Nota informada: " + n);
		}

	}

}
