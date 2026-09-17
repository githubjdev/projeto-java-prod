package m13_stream_collection;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainUsuarioStream2 {
	
	public static void main(String[] args) {
		

		/*Agrupando por departamento.*/
		List<Usuario> usuarios = List.of(new Usuario("Alex", true, 5000, "GERENCIA"), 
								new Usuario("Maria", false, 6000, "SUPORTE"),
								new Usuario("João", true, 8000, "GERENCIA"));
		
		
		Map<String, List<Usuario>> agrupado = usuarios.stream()
													 .collect(Collectors.groupingBy(Usuario::getDepatamento));
		
		for (String chave : agrupado.keySet()) {
			List<Usuario> users = agrupado.get(chave);
			System.out.println("Departamento: " + chave);
			
			users.forEach(u -> System.out.println(u.getNome()));
			
			System.out.println("--------------------------------------");
		}
		
	}

}
