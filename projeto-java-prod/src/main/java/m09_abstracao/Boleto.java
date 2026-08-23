package m09_abstracao;

public class Boleto extends Pagamento {

	public Boleto(double valor) {
		super(valor);
	}

	@Override
	public void realizarPagamento() {
		System.out.println("Pagamento de boleto sendo realizado.");
	}

}
