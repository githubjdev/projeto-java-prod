package variaveistipoeoperador;

public class OperadorAtribuicao {
	
	public static void main(String[] args) {
		
		int valor = 20;
		
		valor +=  10;
		
		System.out.println("Soma: " + valor);
		
		valor -= 10;
		System.out.println("Subtração: " + valor);
		
		valor *= 2;
		System.out.println("Multiplicação: " + valor);
		
		valor /= 4;
		System.out.println("Divisão: " + valor);
		
		
		valor %= 3;
		System.out.println("Resto: " + valor);
		
	}

}
