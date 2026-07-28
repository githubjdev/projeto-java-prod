package m06_introducao_poo;

public class ex01 {
	
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa(); /*Criando um objeto/instancia*/ 
		pessoa.nome = "joão";
		pessoa.idade = 28;
		
		pessoa.falar();
		pessoa.comer();
		
	}

}
