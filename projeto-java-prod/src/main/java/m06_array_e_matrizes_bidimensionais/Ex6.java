package m06_array_e_matrizes_bidimensionais;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int[] valores = new int[5];

		for (int i = 0; i < valores.length; i++) {
			System.out.print("Qual o n�mero:" + i + " ? ");
			valores[i] = sc.nextInt();
		}

		System.out.println("=====================");
		System.out.println("Valores digitados:");

		for (int v : valores) {
			System.out.println(v);
		}
	}

}
