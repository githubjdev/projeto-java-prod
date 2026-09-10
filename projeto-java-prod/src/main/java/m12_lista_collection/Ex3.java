package m12_lista_collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Ex3 {

	public static void main(String[] args) {

		Set<Aluno> alunos = new HashSet<Aluno>();
		
		if(alunos.isEmpty()) {
			System.out.println("Não tem aluno nesse ponto");
		}

		alunos.add(new Aluno("Paulo", 20));
		alunos.add(new Aluno("Alex", 39));
		alunos.add(new Aluno("José", 19));
		alunos.add(new Aluno("Alex", 55));

		/*for (Aluno aluno : alunos) {
			if (aluno.getNome().equals("Alex")) {
				alunos.remove(aluno);
			}
		}*/
		
		/*Iterator<Aluno> iterator = alunos.iterator();
		while (iterator.hasNext()) {
			Aluno aluno = iterator.next();
			if (aluno.getNome().equals("Alex")) {
				iterator.remove();
			}
		}*/
		
		//alunos.removeIf(a -> a.getNome().equals("Alex"));
		
		//alunos.add(2, new Aluno("Josefina", 20));/*Adicina em uma posição*/
		//alunos.set(1, new Aluno("Aluno Substitui", 50)); /*Substitui o objeto*/
		
		for (Aluno aluno : alunos) {
			System.out.println("Nome: " + aluno.getNome());
			System.out.println("Idade: " + aluno.getIdade());
			System.out.println("------------------------------------");
		}
		
		
		/*Aluno[] arrayAluno = alunos.toArray(new Aluno[alunos.size()]);
		
		for (Aluno aluno : arrayAluno) {
			System.out.println("Nome: " + aluno.getNome());
			System.out.println("Idade: " + aluno.getIdade());
			System.out.println("------------------------------------");
		}*/

	}

}
