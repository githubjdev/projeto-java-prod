package m13_stream_collection;

import java.util.List;

public class Ex6 {

	public static void main(String[] args) {
		List<Integer> numeros = List.of(5, 3, 8, 1, 10, 4);

		boolean temMaiorQue9 = numeros.stream().anyMatch(n -> n > 9);
		System.out.println("Tem algum número maior que 9? " + temMaiorQue9);
		
		
		boolean todosPositivos = numeros.stream().allMatch(n -> n > 0);
		System.out.println("Todos os números são positivos? " + todosPositivos);
		
		
		boolean nenhumNegativo = numeros.stream().noneMatch(n -> n < 0);
		System.out.println("Não tem nenhum número negativo? " + nenhumNegativo);
	}

}
