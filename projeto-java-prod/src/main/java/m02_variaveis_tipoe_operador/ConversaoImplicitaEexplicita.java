package m02_variaveis_tipoe_operador;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ConversaoImplicitaEexplicita {
	
	public static void main(String[] args) {
		
		// Conversão Implícita - Quando não existe risco de perda.
         int idade = 38;
         
         double valor = idade;
         System.out.println(valor);

		
		
		
		
		//Conversão Explícita Quando pode ocorrer perda de informação.
         double valor2 = 10.99;
         
         int valorInteiro = (int) valor2;
         System.out.println("Valor convertido para int: " + valorInteiro);
         
         BigDecimal real = new BigDecimal(valor2).setScale(2, RoundingMode.HALF_UP);
         System.out.println(real);
		
	}

}
