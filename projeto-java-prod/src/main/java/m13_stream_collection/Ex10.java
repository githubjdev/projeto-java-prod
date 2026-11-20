package m13_stream_collection;

import java.util.List;

public class Ex10 {

	public static void main(String[] args) {

		List<List<Integer>> listaDeListas =  List.of(List.of(1, 2, 3), 
										    List.of(4, 5, 6), 
										    List.of(7, 8, 9));
		
		List<Integer> listaUnica = listaDeListas.stream()
												.flatMap(interno -> interno.stream())
												.toList();
		
		System.out.println(listaUnica); // [1, 2, 3, 4, 5, 6, 7, 8, 9]
	}

}
