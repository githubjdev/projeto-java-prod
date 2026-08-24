package m11_polimorfismo_mais;

public class MainRecord {
	
	public static void main(String[] args) {
		
		UsuarioRecord usuarioRecord = new UsuarioRecord("alex", 38);
		
		System.out.println("nome : " + usuarioRecord.nome());
		System.out.println("idade : " + usuarioRecord.idade());
		
	}

}
