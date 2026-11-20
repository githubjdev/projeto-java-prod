package m13_stream_collection;

import java.util.List;

public class Ex7 {

	public static void main(String[] args) {
		List<Double> numeros = List.of(5.0, 3.5, 8.5, 1.1, 10.1, 4.2);
		
		int retorno = numeros.stream().mapToInt(n -> n.intValue()).sum();
		System.out.println("Soma dos números: " + retorno);
		
		retorno = numeros.stream().mapToInt(n -> n.intValue()).max().orElse(0);
		System.out.println("Maior número: " + retorno);
		
		retorno = numeros.stream().mapToInt(n -> n.intValue()).min().orElse(0);
		System.out.println("Menor número: " + retorno);
		
		double retornoD = numeros.stream().mapToInt(n -> n.intValue()).average().orElse(0.0);
		System.out.println("Média dos números: " + retornoD);
	}

}
