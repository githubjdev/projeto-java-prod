package m14_exceções_exception;

public class Ex2 {

	public static void main(String[] args) {

		int pessoas = 11;
		int valor = 50; /* valores por vir da tela, do banco, de uma integração, de arquivo etc. */
		int vaquinha = 0;
		try {
			vaquinha = pessoas / valor;
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		} finally { /* Sempre é executado */
			System.out.println("----------Finalizando o programa.");
		}

		System.out.println("Chegou até aqui");

		System.out.println("O valor da vaquinha é: " + vaquinha);

	}

}
