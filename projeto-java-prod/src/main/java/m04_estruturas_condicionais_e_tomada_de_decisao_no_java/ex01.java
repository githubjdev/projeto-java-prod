package m04_estruturas_condicionais_e_tomada_de_decisao_no_java;

public class ex01 {
	
	 public static void main(String[] args) {
		
		 int idade = 17;
		 
		 if (idade >= 18) { /*true ou false*/
			 /*Executar se for true*/
			 System.out.println("Maior de idade");
		 }else {
			 /*Executa se for false*/
			 System.out.println("Menor de idade");
		 }
		 
		 
		 boolean userAtivo = false;
		
		 if (userAtivo) {
			 System.out.println("Usuário é ativo");
		 }else {
			 System.out.println("Usuário não está ativo");
		 }
		 
		 
		 
		 double saldoSalario = 3499;
		 
		 if (saldoSalario >= 3500) {
			 System.out.println("Seu saldo é igual  ou acima de 3500");
		 }else {
			 System.out.println("Seu saldo é menor que 3500");
		 }
		 
	}

}
