package m03_entradade_dados_memoria_debug;

public class Valor_vs_Referencia {
	
	 public static void main(String[] args) {
		 
		 
		 /*Passagem de valor*/
		 int x = 10;
		 int y = x;
		 
		 y = 20;
		 
		 System.out.println(x + " ---  " + y);
		 
		 
		 /*Passagem por referencia*/
		 
		 Pessoa p1 = new Pessoa();
		 p1.nome = "Alex Fernando Egidio";
		 
		 /*PASSAGEM DA REFERENCIA*/
		 Pessoa p2 = p1;
		 
		 System.out.println("P1 : " + p1.nome);
		 System.out.println("P2 : " + p2.nome);
		 
		 p2.nome= "Maria jose";
		 
		 System.out.println("Valor p2: " + p2.nome);
		 System.out.println("Valor p1: " + p1.nome);
		 
		 p1.nome= "Antonio";
		 
		 System.out.println("Valor p2: " + p2.nome);
		 System.out.println("Valor p1: " + p1.nome);
		
		 
		 Pessoa p3 = new Pessoa();
		 p3.nome = "Zeus";
		 
		 Pessoa p4 = new Pessoa();
		 p4.nome = "Brasilia";
		 
		 
		 System.out.println("Valor p3: " + p3.nome);
		 System.out.println("Valor p4: " + p4.nome);
		 
		
	}

}
