package m05_estrutura_repeticao_for_e_while;

import java.util.ArrayList;
import java.util.List;

public class ex03 {

	public static void main(String[] args) {
		Produto p1 = new Produto(); /* Estams criando um objeto de Produto */
		p1.nome = "Notebook";
		p1.preco = 3500;

		Produto p2 = new Produto();
		p2.nome = "Mouse";
		p2.preco = 80;

		Produto p3 = new Produto();
		p3.nome = "Teclado";
		p3.preco = 120;

		List<Produto> produtos = new ArrayList<Produto>();
		produtos.add(p1); /* adiciona na lista com ADD */
		produtos.add(p2);
		produtos.add(p3);

		System.out.println("=====================Percorrendo a lista com o indixe=========================");
		for (int i = 0; i < produtos.size(); i++) {
			Produto produto = produtos.get(i);
			System.out.println("Nome: " + produto.nome);
			System.out.println("Preço: " + produto.preco);
			System.out.println("=============================");
		}
		
		
		System.out.println("=====================Percorrendo a lista com o For Each=========================");
		
		for (Produto produto : produtos) {
			System.out.println("Nome: " + produto.nome);
			System.out.println("Preço: " + produto.preco);
			System.out.println("=============================");
		}

	}

}
