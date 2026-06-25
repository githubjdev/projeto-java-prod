package m02_variaveis_tipoe_operador;

public class OperadoresAritimeticos {
	
	public static void main(String[] args) {
		
		double num1 = 10;
		double num2 = 5;
		
		
		System.out.println("Soma: " + (num1 + num2));
		System.out.println("Subtração: " + (num1 - num2));
		System.out.println("Multi: " + (num1 * num2));
		System.out.println("Divisão: " + (num1 / num2));
		
		// 10 % 5 = 2 e sobrou (Zero)
		System.out.println("Resto: " + (num1 % num2));
		
		num1++;
		num1++;
		System.out.println("Incremento: " + (num1));
		
		num2--;
		num2--;
		System.out.println("Decremento: " + (num2));
		
	}

}
