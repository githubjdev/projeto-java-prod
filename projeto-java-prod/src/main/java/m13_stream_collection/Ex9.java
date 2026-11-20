package m13_stream_collection;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex9 {

	
	public static void main(String[] args) {
		
		List<Produto> produtos = List.of(
				new Produto("Notebook", "Informática", 4500.0, 10),
				new Produto("Mouse", "Informática", 80.0, 150),
				new Produto("Teclado", "Informática", 250.0, 0),
				new Produto("Cadeira", "Móveis", 1200.0, 5),
				new Produto("Mesa", "Móveis", 900.0, 8),
				new Produto("Livro Java", "Livros", 120.0, 0)
				);
		
		Map<String, List<Produto>> porCategoria = produtos
												.stream()
												.collect(Collectors.groupingBy(p -> p.getCategoria()));
		
		for (String categoria : porCategoria.keySet()) {
			System.out.println("==================================");
			System.out.println("Categoria: " + categoria);
			
			List<Produto> produtosCategoria = porCategoria.get(categoria);
			
			for (Produto produto : produtosCategoria) {
				System.out.println(produto.getNome() + " - " + produto.getPreco());
			}
		}
		
		
	}
}
