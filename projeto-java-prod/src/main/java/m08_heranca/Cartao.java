package m08_heranca;

public class Cartao extends Pagamento {

	private String numeroCartao;

	public Cartao(double valor) {
		super(valor);
	}

	public Cartao(double valor, String numeroCartao) {
		super(valor);
		this.numeroCartao = numeroCartao;
	}
	
	@Override
	void pagar() {
		System.out.println("Processando: Processando Pagamento via Cartão de R$ " + getValor() + " com número: " + numeroCartao);
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

}
