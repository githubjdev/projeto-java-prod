package m08_heranca;

public class Pix extends Pagamento {

	private String chavePix;

	public Pix(double valor) {
		super(valor);
	}

	public Pix(double valor, String chavePix) {
		super(valor);
		this.chavePix = chavePix;
	}
	
	/*Simulando um processamento difernte para o PIX*/
	@Override
	void pagar() {
		System.out.println("Processando Pagamento via Pix de R$ " + getValor() + " com chave: " + chavePix);
	}

	public String getChavePix() {
		return chavePix;
	}

	public void setChavePix(String chavePix) {
		this.chavePix = chavePix;
	}

}
