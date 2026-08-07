package m08_heranca;

/*Cada calsse filha vira uma tabela*/
public class Gerente extends Pessoa {

	public Gerente(String nome, String cpf) {
		super(nome, cpf);
	}

	private String setor;
	private String cargo;
	private double salario;
	private String senha;
	private int numeroDeFuncionariosGerenciados;
	private String nivelDeAcesso;

	void gerenciar() {
		System.out.println("Eu estou gerenciando: " + this.getNome());
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}

	public String getNivelDeAcesso() {
		return nivelDeAcesso;
	}

	public void setNivelDeAcesso(String nivelDeAcesso) {
		this.nivelDeAcesso = nivelDeAcesso;
	}

}
