package m14_exceções_exception;

public class Ex3 {

	public static void main(String[] args) {

		try {
			int numero = Integer.parseInt("10");
			int resultado = 10 / 0;
		} catch (NumberFormatException e) {
			System.out.println("Erro de conversão: não é possível converter a string para número.: " + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("Erro de divisão: não é possível dividir por zero.: " + e.getMessage());
		}

	}

}
