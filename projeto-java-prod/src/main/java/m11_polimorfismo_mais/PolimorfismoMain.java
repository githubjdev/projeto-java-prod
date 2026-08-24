package m11_polimorfismo_mais;

import java.util.ArrayList;
import java.util.List;

import m10_interface.Boleto;

public class PolimorfismoMain {
	
	public static void main(String[] args) {
		
		//Pagamento pagamento = new Pix();
		//pagamento.pagar(50);
		
		//pagamento = new Cartao();
		//pagamento.pagar(80);
		
		
		List<Pagamento> listPag = new ArrayList<Pagamento>();
		listPag.add(new Pix(50));
		listPag.add(new Cartao(90));
		
		SistameBancario sistameBancario = new SistameBancario();
		for (Pagamento pag : listPag) {
			sistameBancario.executarPagamento(pag);
		}
		
		
	}

}
