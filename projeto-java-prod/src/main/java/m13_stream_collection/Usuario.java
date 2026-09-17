package m13_stream_collection;

public class Usuario {

	private String nome;
	private boolean ativo;
	private double salario;
	private String depatamento;

	public Usuario(String nome, boolean ativo, double salario) {
		super();
		this.nome = nome;
		this.ativo = ativo;
		this.salario = salario;
	}
	
	public Usuario(String nome, boolean ativo, double salario, String depatamento) {
		super();
		this.nome = nome;
		this.ativo = ativo;
		this.salario = salario;
		this.depatamento = depatamento;
	}
	
	
	public void setDepatamento(String depatamento) {
		this.depatamento = depatamento;
	}
	
	public String getDepatamento() {
		return depatamento;
	}
	

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

}
