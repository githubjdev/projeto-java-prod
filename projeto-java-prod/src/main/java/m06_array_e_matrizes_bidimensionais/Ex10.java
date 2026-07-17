package m06_array_e_matrizes_bidimensionais;

public class Ex10 {

	public static void main(String[] args) {

		int[][] matriz = new int[3][4];

		/* linha 0 (1) da matriz */
		matriz[0][0] = 10;
		matriz[0][1] = 20;
		matriz[0][2] = 30;
		matriz[0][3] = 40;

		/* Linha 1 (2) */
		matriz[1][0] = 50;
		matriz[1][1] = 60;
		matriz[1][2] = 70;
		matriz[1][3] = 80;

		/* linha 2 (3) */
		matriz[2][0] = 90;
		matriz[2][1] = 100;
		matriz[2][2] = 110;
		matriz[2][3] = 120;

		/* Obtendo quantidade de linhas */
		System.out.println("Qtd. de Linhas: " + matriz.length);

		/* Obtendo quantidade de colunas por liha */
		System.out.println("Qtde. de colunas na linha 1: " + matriz[1].length);

		for (int linha = 0; linha < matriz.length; linha++) { /* Este FOR é a Linha da matriz */

			for (int coluna = 0; coluna < matriz[linha].length; coluna++) { /*Este FOR é das colunas*/
					System.out.println("Na linha " + linha + " na coluna " + coluna + ", temos o valor de: " + matriz[linha][coluna]);
			}

		}

	}

}
