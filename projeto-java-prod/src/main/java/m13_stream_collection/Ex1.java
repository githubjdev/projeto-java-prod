package m13_stream_collection;

import java.util.List;

public class Ex1 {

	public static void main(String[] args) {
		List<String> nomes = List.of("Ana", "Bruno", "Carla", "Daniel", "Eduarda");
		
		List<Integer> numeros = List.of(5, 3, 8, 1, 10, 4);
		
		List<Produto> produtos = List.of(
				new Produto("Notebook", "Informática", 4500.0, 10),
				new Produto("Mouse", "Informática", 80.0, 150),
				new Produto("Teclado", "Informática", 250.0, 0),
				new Produto("Cadeira", "Móveis", 1200.0, 5),
				new Produto("Mesa", "Móveis", 900.0, 8),
				new Produto("Livro Java", "Livros", 120.0, 0)
				);
		
		
		/*Exemplo de filter*/
		
		List<Integer> maiorQue4 = numeros.stream()
										 .filter(n -> n >= 4)
										 .toList();
		
		for (Integer integer : maiorQue4) {
			System.out.println(integer);
		}
		
		
		/*Filtrando nomes que iniciam com C ou D*/
		List<String> nomesFIltro = nomes.stream()
										.filter(nome -> nome.startsWith("C") || nome.startsWith("D"))
										.toList();
		for (String nome : nomesFIltro) {
			System.out.println(nome);
		}
		
		/*Produtos em estoque*/
		List<Produto> emEstoque = produtos.stream()
										 .filter(p -> p.getQuantidade() > 0)
										 .toList();
		
		for (Produto produto : emEstoque) {
			System.out.println(produto.getNome() + " - " + produto.getQuantidade());
		}

	}

}
