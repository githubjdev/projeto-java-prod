package m04_estruturas_condicionais_e_tomada_de_decisao_no_java;

public class ex03 {

	public static void main(String[] args) {

		int idade = 27; /* Atribuição de valores (=) */

		if (idade == 18) { /* Comparação dfe igualdade (==) */
			System.out.println("Maior de 18 anos");
		}

		if (idade != 18) { /* Expressão de valor diferente */
			System.out.println("Pesso não tem 18 anos");
		}

		if (idade >= 18) {
			System.out.println("Pessoa maior de didade");
		} else {
			System.out.println("Pesso  menor de idade");
		}
		
		
		String senha = "sdsdsds45";
		
		if (senha != null && !senha.isEmpty()) {
			System.out.println("Processa e verificar a senha.");
		}else {
			System.out.println("Senha deve ser informada");
		}

	}

}
