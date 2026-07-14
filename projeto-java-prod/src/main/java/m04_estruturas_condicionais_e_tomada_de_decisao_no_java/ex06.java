package m04_estruturas_condicionais_e_tomada_de_decisao_no_java;

public class ex06 {
	
	public static void main(String[] args) {
		
		Object valor = "Java"; /*Automaticamente por trás ele será uma classe String*/
		
		if(valor instanceof String) { /*Verificando se é Objeto do tipo String*/
			String texto = (String) valor; /*Conversão de Cast*/
			
			System.out.println(texto.toUpperCase());
		}
		
		
		if (valor instanceof String texto) {
			System.out.println(texto.toUpperCase());
		}
		
	}

}
