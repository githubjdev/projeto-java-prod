package m12_lista_collection;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>();

		nomes.add("Alex");
		nomes.add("Paulo");
		nomes.add("João");
		nomes.add("João");

		/*
		 * for (String nome : nomes) { System.out.println(nome); }
		 */

		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
		
		if (nomes.contains("Alex")) {
			System.out.println("Alex foi encontrado");
		}

	}
}
