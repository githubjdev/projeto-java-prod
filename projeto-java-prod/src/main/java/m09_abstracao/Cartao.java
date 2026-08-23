package m09_abstracao;

public class Cartao extends Pagamento {

	public Cartao(double valor) {
		super(valor);
	}

	@Override
	public void realizarPagamento() {
		System.out.println("Pagamento de cartão sendo realizado.");
	}

}
