package m08_heranca;

/*Cada calsse filha vira uma tabela*/
/*Classe filha  ou no SubClasse*/
public class Funcionario extends Pessoa {

	public Funcionario(String nome, String cpf) {
		super(nome, cpf);
	}

	private String setor;
	private String cargo;
	private double salario;

	void trabalhar() {
		System.out.println("Eu estou trabalhando: "+ this.getNome());
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

}
