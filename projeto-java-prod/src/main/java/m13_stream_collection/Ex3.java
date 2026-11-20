package m13_stream_collection;

import java.util.Comparator;
import java.util.List;

public class Ex3 {

	
	
	public static void main(String[] args) {
		
		List<Integer> numeros = List.of(5, 3, 8, 1, 10, 4);
		
		List<Integer> crescente = numeros.stream()
										.sorted()
										.toList();
		
		
		System.out.println("Números em ordem crescente:");
		for (Integer numero : crescente) {
			System.out.println(numero);
		}
		
		System.out.println("Números em ordem decrescente:");
		
		List<Integer> decrescente = numeros.stream()
									.sorted(Comparator.reverseOrder())
									.toList();
		
		for (Integer numero : decrescente) {
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
		
		System.out.println("Produtos em ordem crescente de preço:");
		List<Produto> porPreco = produtos.stream()
								.sorted(Comparator.comparing(Produto::getPreco))
								.toList();
		
		for (Produto produto : porPreco) {
			System.out.println(produto.getNome() + " - " + produto.getPreco());
		}
	}
}
