package m06_array_e_matrizes_bidimensionais;

public class Ex14 {

	public static void main(String[] args) {
		int[][] matriz = new int[3][4];

		/* linha 0 (1) da matriz */
		matriz[0][0] = 10;
		matriz[0][1] = 20;
		matriz[0][3] = 40;

		/* Linha 1 (2) */
		matriz[1][1] = 60;
		matriz[1][2] = 70;
		matriz[1][3] = 80;

		/* linha 2 (3) */
		matriz[2][0] = 90;
		matriz[2][2] = 110;

		int soma = 0;
		int quantidade = 0;

		for (int linha = 0; linha < matriz.length; linha++) { /* Este FOR é a Linha da matriz */

			for (int coluna = 0; coluna < matriz[linha].length; coluna++) { /* Este FOR é das colunas */

				int valor = matriz[linha][coluna];
				
				if (valor > 0) {
					soma += valor;
					quantidade++;
				}

			}

		}

		System.out.println("Soma todal de todo os elementos: " + soma);

		double media = soma / quantidade;

		System.out.println("Média do valores da Matriz : " + media);

	}

}
