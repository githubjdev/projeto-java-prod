package m03_entradade_dados_memoria_debug;

public class Pessoa {

	public String nome;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	
	@Override
	public String toString() {
		return "Teste de debug: " + nome;
	}

}
