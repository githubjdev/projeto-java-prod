package m03_entradade_dados_memoria_debug;

public class GarbageCollector {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.nome = "Alex";
		
		/*Processa e salva;*/
		
		 /*Garbage COllection  irá identificar que está null e irá colocar no lixo o obj pessoa*/
		pessoa = null;
		
		/*Chamando Garbage Collection manualmente*/
		System.gc();
		
		//ou
		Runtime.getRuntime().gc();
		
		
		int contador = 0;
		
		/*Processar certificado em PDF para 1000*/
		for (int i = 0; i < 1000; i++) {
			
			Pessoa pessoa2 = new Pessoa();
			// salva, gera PDF algo do tipo
			
			if (contador == 100) { /*Chama GC coleta de lixo a cada 100 execusoes*/
				System.gc();
				contador = 0;
			}
			
			contador ++;
		}
		

	}
}
