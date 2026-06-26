package m03_entradade_dados_memoria_debug;

import java.util.Scanner;

public class ExemploScanner {

	public static void main(String[] args) {
				
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o seu nome?");
		String nome = scanner.nextLine();
		
		System.out.println("Informe o sua idade");
		Integer idade = scanner.nextInt();
		
		System.out.println("Informe o salário");
		Double salario = scanner.nextDouble();
		
		System.out.println("Nome: " + nome + ", idade: " + idade + ", salario: " +  salario);

		scanner.close();
		
	}

}
