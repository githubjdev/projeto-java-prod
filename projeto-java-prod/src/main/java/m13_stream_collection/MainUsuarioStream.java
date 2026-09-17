package m13_stream_collection;

import java.util.List;

public class MainUsuarioStream {

	public static void main(String[] args) {

		List<Usuario> usuarios = List.of(new Usuario("Alex", true, 5000), 
								new Usuario("Maria", false, 6000),
								new Usuario("João", true, 8000));
		
	  /*Filtrar usuários ativos*/
	  //List<Usuario> ativos = usuarios.stream().filter(Usuario::getAtivo).toList();
	  //ativos.forEach(u -> System.out.println(u.getNome()));
	  
	  
	  
	  /*Extrair apenas os nome dos usuários*/
	  List<String> nomes = usuarios.stream()
			  					   .map(Usuario::getNome)
			  					   .toList();
	  
	  nomes.forEach(System.out::println);
	  
	  
	  /*Somar o total dos salários dos usuários*/
	   double totalSalario = usuarios.stream()
			                        .mapToDouble(Usuario::getSalario)
			                        .sum();
	   
	   System.out.println("Total : R$ " + totalSalario);

	}

}
