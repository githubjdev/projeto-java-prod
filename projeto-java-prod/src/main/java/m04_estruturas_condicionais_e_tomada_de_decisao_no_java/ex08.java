package m04_estruturas_condicionais_e_tomada_de_decisao_no_java;

public class ex08 {

	public static void main(String[] args) {

		String nome = "Alex";
		int idade = 18;
		double salario = 1500;

		/*
		 * Para um cadatro correto, o nome deve ser informado, a idade deve ser maior
		 * que 18 e salário maior ou igual a 1500
		 */

		/*if (nome != null && !nome.isBlank()) {

			if (idade >= 18) {

				if (salario >= 1500) {
					salvar();
				} else {
					throw new IllegalArgumentException("Salário não pode ser menor que 1500");
				}

			} else {
				throw new IllegalArgumentException("Idade deve er maior que 18");
			}

		} else {
			throw new IllegalArgumentException("Nome deve er informado");
		}*/
		
		
		
		if (nome == null || nome.isBlank()) {
			throw new IllegalArgumentException("Nome deve er informado");
		}
		
		if (idade < 18 ) {
			throw new IllegalArgumentException("Idade deve ser maior que 18");
		}
		
		if (salario < 1500) {
			throw new IllegalArgumentException("Salário não pode ser menor que 1500");
		}
		
		salvar();
		

	}

	public static void salvar() {
		System.out.println("Salvando dados");
	}

}
