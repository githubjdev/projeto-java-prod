package m13_stream_collection;

import java.util.List;

public class Ex2 {
	
	public static void main(String[] args) {
		
		List<Integer> numeros = List.of(5, 3, 8, 1, 10, 4);
		
		
		List<Integer> dobrados = numeros.stream()
										.filter(n -> n > 4)
										.map(n -> n * 2)
										.toList();
		
		for (Integer numero : dobrados) {
			
			System.out.println(numero);
		}
		
		
		
		List<Produto> produtos = List.of(
				new Produto("Notebook", "Informática", 4500.0, 10),
				new Produto("Mouse", "Informática", 80.0, 150),
				new Produto("Teclado", "Informática", 250.0, 0),
				new Produto("Cadeira", "Móveis", 1200.0, 5),
				new Produto("Mesa", "Móveis", 900.0, 8),
				new Produto("Livro Java", "Livros", 120.0, 0)
				);
		
		
		List<String> nomesProdutos = produtos.stream()
											.map(p -> p.getNome())
											.toList();
		
		for (String nome : nomesProdutos) {
			System.out.println(nome);
		}
		
	}

}
