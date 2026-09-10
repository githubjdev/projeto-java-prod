package m12_lista_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainListAluno2 {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();
		
		
		if (alunos.isEmpty()) {
			System.out.println("não tem alunos");
		}

		alunos.add(new Aluno("alex", 39));
		alunos.add(new Aluno("José", 50));
		alunos.add(new Aluno("Maria", 20));/*2*/
		alunos.add(new Aluno("Maria", 20));/*3*/
		
		
		/*for (Aluno aluno : alunos) {
			if (aluno.getNome().equals("Maria")) {
				alunos.remove(aluno);
			}
		}*/
		
		/*Iterator<Aluno> iterator = alunos.iterator();
		
		while(iterator.hasNext()) {
			Aluno aluno = iterator.next();
			if (aluno.getNome().equals("Maria")) {
				iterator.remove();
			}
		}*/
		
		/*for (int i = 0; i < alunos.size(); i++) {
			Aluno aluno = alunos.get(i);
			if (aluno.getNome().equals("Maria")) {
				alunos.remove(i);
				i--;
			}
		}*/
		
		alunos.removeIf(aluno -> aluno.getNome().equals("Maria"));
		
		
		Aluno trocar = new Aluno("Marcelo", 50);
		//alunos.add(1, trocar);/*adicina na lista e move os objetos para frente*/
		alunos.set(1, trocar);/*substitui na lista o elemento do indice*/

		alunos.clear();

		for (Aluno aluno : alunos) {
			System.out.println("Nome: " + aluno.getNome());
			System.out.println("Idade: " + aluno.getIdade());
			System.out.println("--------------------------------------");
		}
		
		
		
		Aluno[] arrayAluno = alunos.toArray(new Aluno[alunos.size()]);
		
		for (Aluno aluno : arrayAluno) {
			System.out.println("Nome: " + aluno.getNome());
			System.out.println("Idade: " + aluno.getIdade());
			System.out.println("--------------------------------------");
		}
		
	}

}
