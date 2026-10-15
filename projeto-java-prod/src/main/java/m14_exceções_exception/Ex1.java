package m14_exceções_exception;

public class Ex1 {
	
	
	public static void main(String[] args)  {
		
		
		int pessoas = 11;
		int valor = -0; /*valores por vir da tela, do banco, de uma integração, de arquivo etc.*/
		
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor inválido: " + valor);
		}
		
		if (valor <= 0) {
			valor = 1;
		}
		
		int vaquinha = pessoas / valor;
		
		System.out.println("Chegou até aqui");
		
		System.out.println("O valor da vaquinha é: " + vaquinha);
	}

}
