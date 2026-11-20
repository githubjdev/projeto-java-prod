package m13_stream_collection;

import java.util.List;

public class Ex8 {

	public static void main(String[] args) {
		List<Double> numeros = List.of(5.0, 3.5, 8.5, 1.1, 10.1, 4.2);

		double total = 0;
		
		for (Double n : numeros) {
			total = total + n;
		}
		
		System.out.println(total); // 31
		
		double totalStream = numeros.stream().reduce(0.0, (soma, n) -> soma + n);
		System.out.println("Soma com reduce :" + totalStream); // 31
	}

}
