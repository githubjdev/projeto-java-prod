package m03_entradade_dados_memoria_debug;

public class Exceptions_e_Tratamento_de_Erros {

	public static void main(String[] args) throws Exception {

		/* o que é Exception = Erros do sistema */

		//int x = 10 / 1; /* O zero vai da tela, integração, banco de dados, de arquivo xml */

		//System.out.println("Total: " + x);
		
		
		
		//Pessoa pessoa = new Pessoa();
		//pessoa.nome = " Alex";
		
		//System.out.println("Nome: " + pessoa.nome);
		
		
		// O array o final dele é sempre o total - 1 ( pq inicia com zero);
		int numero[] = new int[5];
		numero[0] = 10; //1
		numero[1] = 20; //2
		numero[2] = 30; //3 
		numero[3] = 40; //4
		numero[4] = 50; //5
		
		System.out.println("Valor: " + numero[4]);
		
		
		System.out.println("Converter numero: " + Double.parseDouble("2000"));
		

	}

}
