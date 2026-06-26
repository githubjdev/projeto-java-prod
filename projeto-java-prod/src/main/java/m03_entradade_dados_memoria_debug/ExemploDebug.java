package m03_entradade_dados_memoria_debug;

public class ExemploDebug {

	public static void main(String[] args) {

		/* F5 entra no método */
		/* F6 pula de linha em linha */
		/* F7 pula o método */
		/* F8 continua até o próximo ponto de parada ou executa tudo */
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Alex");
		
		System.out.println("No da pessoa sendo retornada no getNome(): " + pessoa.getNome());
		
		System.out.println("Método toString sendo chamado para teste de debug: " + pessoa.toString());

	}

}
