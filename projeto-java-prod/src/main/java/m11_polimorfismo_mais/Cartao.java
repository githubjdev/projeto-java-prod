package m11_polimorfismo_mais;

public final class Cartao implements Pagamento {

	private double valor;

	public Cartao(double valor) {
		super();
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	@Override
	public void pagar() {
		System.out.println("Realizando pagamento de cartao, valor R$: " + valor);

	}

	@Override
	public void pagar(double valor) {
		// TODO Auto-generated method stub
		
	}

}
