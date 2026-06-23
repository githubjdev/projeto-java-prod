package variaveistipoeoperador;

public class OperadorLogicoE {
	
	public static void main(String[] args) {
		
		// Operadores lógico & e &&
		// o operador & -> ele avalia os dois lados da condição (avalia sempre os dois lados)
		// o operador && -> se a primeira condição for false não avalia a segunda (não avalia os dois lado)
		
		
		int idade = 18;
		boolean possuiCarteira = false;
		boolean permissaoEspecial = true;
		
		
		if (idade >= 18 && possuiCarteira || permissaoEspecial) {
			System.out.println("Permitido dirigir");
		}else {
			System.out.println("Não pode dirigir");
		}
		
	}
	

}
