package m13_stream_collection;

import java.util.List;

public class MainUsuarioStream3 {

	public static void main(String[] args) {
		
		/**Quem tem salário de mais de 6mil reais**/
		List<Usuario> usuarios = List.of(new Usuario("Alex", true, 5000, "GERENCIA"), 
				new Usuario("Maria", false, 6000, "SUPORTE"),
				new Usuario("João", true, 8000, "GERENCIA"));
		
		
		List<Usuario> filtro = usuarios.stream().filter(u -> u.getSalario() > 5000).toList();
		
		 filtro.forEach(u -> System.out.println(u.getNome()));
		 
		 
		 boolean existe = usuarios.stream().anyMatch(u -> u.getSalario() >= 8000);
		 
		 System.out.println("Tem salário de  8.000? " + (existe ? "Sim" : "Nao"));
	}

}
