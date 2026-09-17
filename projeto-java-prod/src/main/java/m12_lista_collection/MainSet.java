package m12_lista_collection;

import java.util.HashSet;
import java.util.Set;

public class MainSet {

	
	public static void main(String[] args) {
		
		/*Usamos o Set quando não queremos valores repetidos*/
		Set<Aluno> alunos = new HashSet<Aluno>();

		alunos.add(new Aluno("José", 50));
		alunos.add(new Aluno("Maria", 30));
		alunos.add(new Aluno("alex", 39));
		alunos.add(new Aluno("Maria", 30));
		alunos.add(new Aluno("alex", 80));
		
		for (Aluno aluno : alunos) {
			System.out.println(aluno.getNome());
		}
		
	}
	
}
