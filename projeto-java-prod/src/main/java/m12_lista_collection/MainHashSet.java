package m12_lista_collection;

import java.util.HashSet;
import java.util.Set;

public class MainHashSet {
	
	public static void main(String[] args) {
		
		/*Set<String> nomes = new HashSet<String>();
		
		nomes.add("Alex");
		nomes.add("João");
		nomes.add("Paulo");
		nomes.add("Alex");
		nomes.add("Marco");
		
		for (String nome : nomes) {
			System.out.println(nome);
		}*/
		
		
		Set<Aluno> alunos = new HashSet<Aluno>();
		alunos.add(new Aluno("Alex", 20));
		alunos.add(new Aluno("João", 65));
		alunos.add(new Aluno("Paulo", 77));
		alunos.add(new Aluno("Alex", 10));
		alunos.add(new Aluno("Marco", 6));
		
		for (Aluno aluno : alunos) {
			System.out.println(aluno.getNome() + " - " + aluno.getIdade());
		}
		
	}

}
