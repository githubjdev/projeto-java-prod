package m09_abstracao;

public class Pix extends Pagamento {

	public Pix(double valor) {
		super(valor);
	}

	@Override
	public void realizarPagamento() {
		System.out.println("Pagamento de pix sendo realizado.");
	}
	
	
	@Override
	public void emitirComprovante() {
		
		System.out.println("Emissão de comprovante para o PIX (customizado) R$ " + valor);
		System.out.println("----------------------------------------------------------");
	}
	

}
