package m12_lista_collection;

import java.util.ArrayList;
import java.util.List;

public class MainListAluno {

	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<Aluno>();

		alunos.add(new Aluno("alex", 39));
		alunos.add(new Aluno("José", 50));
		alunos.add(new Aluno("Maria", 20));
		alunos.add(new Aluno("Maria", 20));

		/*For-each*/
		for (Aluno aluno : alunos) {
			System.out.println("Nome: " + aluno.getNome());
			System.out.println("Idade: " + aluno.getIdade());
			System.out.println("--------------------------------------");
		}
		
		/*indice é para quando precisamos remover, ou identificar um elemento da tela ou algo parecido*/
		for (int i = 0; i < alunos.size(); i++) {
			
			System.out.println("Nome: " + alunos.get(i).getNome());
			System.out.println("Idade: " + alunos.get(i).getIdade());
			System.out.println("--------------------------------------");
			
		}
		
		
		Aluno busca = new Aluno("Maria", 80);
		
		/*Verificar se contem objetos dentro da lista*/
		if (alunos.contains(busca)) {
			System.out.println("Maria encontrada");
		}
		
		
		for (Aluno aluno : alunos) {
			if (aluno.equals(busca)) {
				System.out.println("Objeto maria encontrado.");
			}
		}

	}

}
