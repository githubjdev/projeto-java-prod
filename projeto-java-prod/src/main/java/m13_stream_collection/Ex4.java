package m13_stream_collection;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex4 {
	
	public static void main(String[] args) {
		
		List<Produto> produtos = List.of(
					new Produto("Notebook", "Informática", 4500.0, 10),
					new Produto("Mouse", "Informática", 80.0, 150),
					new Produto("Teclado", "Informática", 250.0, 0),
					new Produto("Cadeira", "Móveis", 1200.0, 5),
					new Produto("Mesa", "Móveis", 900.0, 8),
					new Produto("Livro Java", "Livros", 120.0, 0)
		);
		
		
		List<String> lista = produtos.stream().
				map(p -> p.getNome())
				.collect(Collectors.toList());
		
		System.out.println("=========== Lista de produtos:");
		for (String nome : lista) {
			System.out.println(nome);
		}
		
		
		System.out.println("=========== Lista de categorias sem repetir:");
		/*COloca em um Set as categorias sem repetição*/
		Set<String> categorias = produtos.stream().
				map(p -> p.getCategoria())
				.collect(Collectors.toSet());
		
		for (String categoria : categorias) {
			System.out.println(categoria);
		}
		
		System.out.println("=========== Juntar textos:");
		String nomePrduos = lista.stream().collect(Collectors.joining(", "));
		System.out.println(nomePrduos);
	}

}
