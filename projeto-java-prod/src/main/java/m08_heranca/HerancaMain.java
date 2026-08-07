package m08_heranca;

public class HerancaMain {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("Alex", "123456789");
		aluno.setIdade(10);
		aluno.setRg("123456789");
		aluno.setDataNascimento("01/01/2000");
		aluno.setSexo("Masculino");
		aluno.setEstadoCivil("Solteiro");
		aluno.andar();
		aluno.falar();
		aluno.dormir();

		aluno.setCurso("Engenharia de Software");
		aluno.setMatricula("2023001");
		aluno.setTurno("Noturno");
		aluno.estudar();

		
		System.out.println("------------------------------------------------------");
		
		Funcionario funcionario = new Funcionario("Maria", "987654321");
		funcionario.setIdade(10);
		funcionario.setRg("123456789");
		funcionario.setDataNascimento("01/01/2000");
		funcionario.setSexo("Masculino");
		funcionario.setEstadoCivil("Solteiro");
		funcionario.andar();
		funcionario.falar();
		funcionario.dormir();
		
		funcionario.setCargo("Analista de Sistemas");
		funcionario.setSetor("TI");
		funcionario.setSalario(5000.00);
		funcionario.trabalhar();
		
		System.out.println("------------------------------------------------------");
		
		Gerente gerente = new Gerente("João", "456789123");
		gerente.setIdade(10);
		gerente.setRg("123456789");
		gerente.setDataNascimento("01/01/2000");
		gerente.setSexo("Masculino");
		gerente.setEstadoCivil("Solteiro");
		gerente.andar();
		gerente.falar();
		gerente.dormir();
		
		gerente.setCargo("Gerente de TI");
		gerente.setSetor("TI");
		gerente.setSalario(10000.00);
		gerente.setSenha("123456");
		gerente.setNumeroDeFuncionariosGerenciados(10);
		gerente.setNivelDeAcesso("Administrador");
		gerente.gerenciar();
		
		
		System.out.println("------------------------------------------------------");
		

	}

}
