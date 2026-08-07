package m08_heranca;

public class Pagamento {

	private double valor;

	public Pagamento(double valor) {
		this.valor = valor;
	}

	void pagar() {
		System.out.println("Pagamento de R$ " + valor);
	}

	void imprimirRecibo() {
		System.out.println("Imprimindo recibo de Pagamento de R$ " + valor);
	}

	public double getValor() {
		return valor;
	}

}
