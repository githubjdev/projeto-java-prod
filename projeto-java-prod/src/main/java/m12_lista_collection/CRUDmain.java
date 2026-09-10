package m12_lista_collection;

public class CRUDmain {

	
	
	public static void main(String[] args) {
		
		AlunoCRUD alunoCRUD = new AlunoCRUD();
		ProdutoCRUD produtoCRUD = new ProdutoCRUD();

		alunoCRUD.salve(new Aluno("João", 20, 1), 1);
		produtoCRUD.salve(new Produto( 2, "Notebook"), 2);
		
		Produto produto = produtoCRUD.buscarPorId(2);
		Aluno aluno = alunoCRUD.buscarPorId(1);

		System.out.println("Aluno: " + aluno.getNome() + " - Idade: " + aluno.getIdade());
		System.out.println("Produto: " + produto.getNome() + " - Id: " + produto.getId());
		
		alunoCRUD.delete(1);
		produtoCRUD.delete(2);
		
	}
}
