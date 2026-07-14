package m04_estruturas_condicionais_e_tomada_de_decisao_no_java;

public class ex04 {

	public static void main(String[] args) {

		/* User IF e ELSE ou até ELSE IF quando existem muitas condições */

		String opcao = "U";

		if (opcao.equals("A")) {
			System.out.println("Administrador");
		} else if (opcao.equals("U")) {
			System.out.println("Usuário");
		} else {
			System.out.println("Inválida");
		}

		/* ========================= Usando switch case ============================= */
		/* Use Swich Case quando prcisa comparar valores ou letras */

		switch (opcao) {
		case "A":
			System.out.println("Administrado"); /* Executa um método, algo como gerar um PDF, salva no banco e etc */
			break;
		case "U":
			System.out.println("Usuário");
			break;
		default:
			System.out.println("Invalido");
		}

		/* Verifica e retora um valor */
		String retorno = switch (opcao) {
		case "A" -> "Administrador";
		case "U" -> "Usuário";
		default -> "Invalido";
		};

		System.out.println("Valor do retorno: " + retorno);

		/* Verificar o valor, processa um método e retornar uma string */
		retorno = switch (opcao) {
			case "A" -> {
				System.out.println("Admnistrado");
				yield "Admintrador";
			}
			case "U" -> {
				System.out.println("Usuário");
				yield "Usuário";
			}

		default -> "Inválido";
		};
		
		System.out.println("Valor do retorno 2: " + retorno);

	}

}
