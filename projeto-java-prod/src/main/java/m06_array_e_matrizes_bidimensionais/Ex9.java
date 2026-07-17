package m06_array_e_matrizes_bidimensionais;

public class Ex9 {

	public static void main(String[] args) {

		int[] notas = new int[4];
		notas[0] = 100;
		notas[1] = 80;
		notas[2] = 50;
		notas[3] = 40;

		double total = 0;

		for (double n : notas) {
			total += n;
		}

		double media = total / notas.length;

		System.out.println("M�dia = " + media);
		
		int contador = 0;
		for (int n : notas) {
			if (n > 50) {
				contador ++;
			}
		}
		
		System.out.println("Nota maior que 50: " + contador);
		
		boolean encontrado = false;
		for (int n : notas) {
			if (n == 50) {
				encontrado = true;
				break;
			}
		}
		
		System.out.println("Valor 50 encontrado? " + encontrado);

	}

}
