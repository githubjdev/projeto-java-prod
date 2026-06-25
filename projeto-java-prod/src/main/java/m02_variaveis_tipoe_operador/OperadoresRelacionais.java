package m02_variaveis_tipoe_operador;

public class OperadoresRelacionais {
	
	 public static void main(String[] args) {
		 
		 
		 double num1 = 10;
		 double num2 = 5;
		 
		 if (num1 <= num2) {
			 System.out.println("TRUE: -> Método a ser executado porque deu true na condição");
		 }else {
			 System.out.println("FALSE: -> Método executado caso a condição acima seja false");
		 }
		 
		 
		 int idade = 18;
		 
		 if(idade >= 18) {
			 System.out.println("Pode fazer carteira motorista");
		 }else {
			 System.out.println("Não pode ter CNH");
		 }
		 
	}

}
