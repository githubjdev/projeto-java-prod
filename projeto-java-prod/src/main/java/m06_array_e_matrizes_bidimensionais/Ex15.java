package m06_array_e_matrizes_bidimensionais;

import java.util.Arrays;

public class Ex15 {
	
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
		
		int coluna = 2;
		int soma = 0;
		
		for (int linha = 0; linha < matriz.length; linha++) { 
			soma += matriz[linha][coluna];
		}
		
		System.out.println("Soma da coluna 2: " + soma);
		
		
		for (int[] linha : matriz) {
			System.out.println(Arrays.toString(linha));
			
		}
		
	}

}
