package m03_entradade_dados_memoria_debug;

public class Mutabilidade_vs_Imutabilidade {
	
	 public static void main(String[] args) {
		 
		 /*Mutabilidade >>> Objeto pode ser alterado : O SEU VALOR.*/ 
		 
		  StringBuilder stringBuilder = new StringBuilder();
		  stringBuilder.append("\nJava\n");
		  stringBuilder.append("Hibernate\n");
		  stringBuilder.append("Spring Boot\n");
		  stringBuilder.append("Spring MVC\n");
		  
		  System.out.println("Objeto Mutável: " + stringBuilder.toString());
		 
		 
		 /*Imutabilidade >>> Objeto NÃO pode ser alterado : O SEU VALOR.*/
		  String nome = "Alex fernando Egidio";
		  //nome = nome.concat("\nJava");
		  //nome = nome.concat("\nHibernate");
		  //nome = nome.concat("\nSpring boot");
		  
		  System.out.println("Obejto Imutável: "+ nome);
		
	}

}
