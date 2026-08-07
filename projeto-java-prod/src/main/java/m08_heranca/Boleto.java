package m08_heranca;

public class Boleto extends Pagamento {

	private String codigoBarras;

	public Boleto(double valor) {
		super(valor);
	}

	public Boleto(double valor, String codigoBarras) {
		super(valor);
		this.codigoBarras = codigoBarras;
	}
	
	
	@Override
	void pagar() {
	 System.out.println("Processando Pagamento via Boleto de R$ " + getValor() + " com código de barras: " + codigoBarras);
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

}
