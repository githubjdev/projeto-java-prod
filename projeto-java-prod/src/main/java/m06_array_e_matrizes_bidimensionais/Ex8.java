package m06_array_e_matrizes_bidimensionais;

public class Ex8 {

	public static void main(String[] args) {
		int[] notas = new int[5];
		notas[0] = 10;
		notas[1] = 8;
		notas[2] = 36;
		notas[3] = 25;
		notas[4] = 11;

		/*
		 * Pegamos o primeiro valor e sempre que o valor atual for maior ser� feito a
		 * atribui��o na vari�vel
		 */
		int maior = notas[0];

		for (int n : notas) {
			if (n > maior) {
				maior = n;
			}
		}

		System.out.println("Maior n�mero = " + maior);

	}

}
