package m13_stream_collection;

import java.util.List;
import java.util.Optional;

public class Ex5 {
	
	public static void main(String[] args) {
		
		
		List<String> nomes = List.of("Ana", "Carlos", "Carla", "Daniel", "Eduarda");
		
		Optional<String> encontrado = nomes.stream()
									.filter(nome -> nome.startsWith("C"))
									.findFirst();
		
		System.out.println(encontrado.get());
		
		
		Optional<String> naoencontrado = nomes.stream()
				.filter(nome -> nome.startsWith("Z"))
				.findFirst();
		
		
		System.out.println(naoencontrado.isPresent());
		
		/*valor padrão com orElse*/
		String nomeBusca = nomes.stream()
				.filter(nome -> nome.startsWith("A"))
				.findFirst()
				.orElse("Não encontrado");
		
		System.out.println(nomeBusca);
		
		
		
		List<Produto> produtos = List.of(
				new Produto("Notebook", "Informática", 4500.0, 10),
				new Produto("Mouse", "Informática", 80.0, 150),
				new Produto("Teclado", "Informática", 250.0, 0),
				new Produto("Cadeira", "Móveis", 1200.0, 5),
				new Produto("Mesa", "Móveis", 900.0, 8),
				new Produto("Livro Java", "Livros", 120.0, 0)
				);
		
		
		/*encontre o primeiro produto que custa menos de 100 e mostre o nome. Se não
			existir, mostre "Nenhum".
		 */
		
		String produtoBarato = produtos.stream()
				.filter(p -> p.getPreco() < 100) /*Filra pelos menores precos abaixo de 100*/
				.map(p -> p.getNome()) /*Converte para String com nomes*/
				.findFirst()  /*Pega apenas o primeiro*/
				.orElse("Nenhum");
		
		System.out.println(produtoBarato);
		
	}

}
