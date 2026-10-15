package m15_reflection;

public class Tarefa {

	@Executar
	public void rodar() {
		System.out.println("Executando tarefa...");
	}
	
	
	public void naoRoda() {
		System.out.println("Nao Roda tarefa...");
	}

}
