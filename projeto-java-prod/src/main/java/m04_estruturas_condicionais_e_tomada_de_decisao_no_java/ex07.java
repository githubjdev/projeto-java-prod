package m04_estruturas_condicionais_e_tomada_de_decisao_no_java;

public class ex07 {

	public static void main(String[] args) {

		String nome = "alex ferndo";
		int idade = 40;

		if (nome == null || nome.isBlank() || nome.equals("-")) {
			throw new IllegalArgumentException("Nome obrigatório");
		}

		System.out.println("Meu nome é: " + nome);

		if (idade <= 0) {
			throw new IllegalArgumentException("Idade deve ser informada");
		}
		
		System.out.println("Minha Idade é: " + idade);

	}

}
