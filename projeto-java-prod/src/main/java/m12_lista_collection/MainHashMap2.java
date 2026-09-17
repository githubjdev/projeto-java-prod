package m12_lista_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainHashMap2 {
	
	public static void main(String[] args) {
		
		/*Nos pessoa temoos CPF*/
		/*Em um restaurando ID do pedido.. temos a comanda e etc*/
		
		/*Exemplo do MacDonalt*/
		
		/*ID pedido -> Nome */
		/*ID 45454 -> Alex */
		
		/*ID Matricula -> Nome Aluno*/
		
		Map<String, Aluno> alunos = new HashMap<String, Aluno>();
		alunos.put("4544", new Aluno("Jose", 50));
		alunos.put("855", new Aluno("Alex", 60));
		alunos.put("545", new Aluno("Mario", 70));
		alunos.put("888", new Aluno("Paulo", 90));
		
		
		for (String key : alunos.keySet()) {
			System.out.println("Pedido: " + key + " Nome: " + alunos.get(key).getNome());
		}
		
		
		
		
	}

}
