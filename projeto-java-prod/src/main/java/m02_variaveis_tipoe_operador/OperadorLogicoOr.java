package m02_variaveis_tipoe_operador;

public class OperadorLogicoOr {

	public static void main(String[] args) {
		
		// Operadores lógico | e ||
		// o operador | -> ele avalia os dois lados da condição (avalia sempre os dois lados)
		// o operador || -> se a primeira condição for true ele não avalia a segunda (não avalia os dois lado)
		
		
		int idade = 18;
		boolean possuiCarteira = true;
		
		
		if (idade18() || possuiCarteira()) {
			System.out.println("Liberado para dirigir");
		}
		
		
		

	}
	
	public static boolean idade18() {
		System.out.println("Método da idade ");
		return true;
	}
	
	public static boolean possuiCarteira() {
		System.out.println("Método da possuiCarteira ");
		return true;
	}


}
