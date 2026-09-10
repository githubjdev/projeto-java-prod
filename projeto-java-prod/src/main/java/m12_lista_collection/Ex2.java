package m12_lista_collection;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
	
	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		alunos.add(new Aluno("Paulo", 20));
		alunos.add(new Aluno("Alex", 39));
		alunos.add(new Aluno("José", 19));
		alunos.add(new Aluno("Alex", 55));
		
		
		for (Aluno aluno : alunos) {
			System.out.println("Nome: " + aluno.getNome());
			System.out.println("Idade: " + aluno.getIdade());
			System.out.println("------------------------------------");
		}
		
		
		Aluno compare = new Aluno("Alex", 10);
		if (alunos.contains(compare)) {
			System.out.println("Alex encontrado");
		}
		
	}

}
