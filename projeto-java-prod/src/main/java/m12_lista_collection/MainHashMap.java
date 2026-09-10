package m12_lista_collection;

import java.util.HashMap;
import java.util.Map;

public class MainHashMap {

	public static void main(String[] args) {
		
		
		Map<String, Aluno> alunos = new HashMap<String, Aluno>();
		
		
		alunos.put("56564564654", new Aluno("Alex", 20));
		alunos.put("789562141555", new Aluno("João", 80));
		alunos.put("754254545", new Aluno("Paulo", 30));
		
		for (String key : alunos.keySet()) {
			System.out.println("CPF: " + key);
			System.out.println("Cliente: " + alunos.get(key).getNome());
			System.out.println("Idade: " + alunos.get(key).getIdade());
			System.out.println("------------------------------------");
		}
		
		/*Map<String, String> clientes = new HashMap<String, String>();
		
		clientes.put("1", "Alex");
		clientes.put("2", "João");
		clientes.put("3", "Paulo");*/
		
		//System.out.println("Pedido pronto: " + clientes.get("2"));
		
		
		/*for (String key : clientes.keySet()) {
			System.out.println("Pedido: " + key);
			System.out.println("Cliente: " + clientes.get(key));
			System.out.println("------------------------------------");
		}*/
		
		
		

	}

}
