package m08_heranca;

/*Cada calsse filha vira uma tabela*/
public class Aluno extends Pessoa {

	public Aluno(String nome, String cpf) {
		super(nome, cpf);
	}

	private String matricula;
	private String curso;
	private String turno;

	void estudar() {
		System.out.println("Eu estou estudando: " + this.getNome());
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	
}
