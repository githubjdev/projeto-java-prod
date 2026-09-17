package m12_lista_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainListaParaArray {

	public static void main(String[] args) {

		/*
		 * List<String> nomes = new ArrayList<String>(); nomes.add("Maria");
		 * nomes.add("José"); nomes.add("Alex"); nomes.add("Zilda"); nomes.add("Maria");
		 * 
		 * Collections.sort(nomes);
		 * 
		 * for (String string : nomes) { System.out.println(string); }
		 */

		List<Aluno> alunos = new ArrayList<Aluno>();

		alunos.add(new Aluno("José", 50));
		alunos.add(new Aluno("Maria", 30));
		alunos.add(new Aluno("alex", 39));
		alunos.add(new Aluno("Maria", 20));
		alunos.add(new Aluno("Zilda", 80));
		alunos.add(new Aluno("Carlos", 70));
		alunos.add(new Aluno("Marcelo", 50));
		alunos.add(new Aluno("Marcelo", 45));
		alunos.add(new Aluno("alexandre", 19));
		alunos.add(new Aluno("alexx", 22));
		alunos.add(new Aluno("Judas", 25));

		/*Dizendo com um Comparator qual o campo usar para Ordenação dos dados*/
		alunos.sort(Comparator.comparing(Aluno::getNome, 
				                String.CASE_INSENSITIVE_ORDER)
				               .thenComparing(Aluno::getIdade));

		
		for (Aluno aluno : alunos) {
			System.out.println("Nome: " + aluno.getNome());
			System.out.println("Idade: " + aluno.getIdade());
			System.out.println("--------------------------------------");
		}

	}

}
