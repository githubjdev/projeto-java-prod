package m08_heranca;

/*Classe PAI ou Superclasse (Atributos e métodos comum a todos)*/
public class Pessoa {

	private String nome;
	private String cpf;
	private String rg;
	private String dataNascimento;
	private int idade;
	private String sexo;
	private String estadoCivil;

	public Pessoa(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	public void falar() {
		System.out.println("Olá, eu sou uma pessoa: " + this.nome);
	}

	public void andar() {
		System.out.println("Eu estou andando: " + this.nome);
	}

	void dormir() {
		System.out.println("Eu estou dormindo: " + this.nome);
	}

	public String getNome() {
		return nome;
	}


	public String getCpf() {
		return cpf;
	}


	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

}
