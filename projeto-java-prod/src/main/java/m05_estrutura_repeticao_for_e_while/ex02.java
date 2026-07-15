package m05_estrutura_repeticao_for_e_while;

public class ex02 {

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

		Produto[] produtos = { p1, p2, p3 }; /*Posição do array inicia em zero (0)*/

		System.out.println("=====================Percorrendo o array com indices=====================");
		/*
		 * Usamos o indice quando precisamos pegar a posição (Pegar na poisição que o
		 * usuário selecionou na tela)
		 */

		for (int i = 0; i < produtos.length; i++) { /*produtos.length retorna 3*/
             System.out.println("Nome: " + produtos[i].nome);
             System.out.println("Preço: " + produtos[i].preco);
             
             System.out.println("====================================");
		}

		System.out.println("=====================Percorrendo o array com For Each=====================");
		
		for (Produto produto : produtos) {
			 System.out.println("Nome: " + produto.nome);
             System.out.println("Preço: " + produto.preco);
             
             System.out.println("====================================");
		}
	}

}
