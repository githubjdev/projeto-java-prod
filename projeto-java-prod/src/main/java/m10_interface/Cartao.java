package m10_interface;

public class Cartao implements Pagamento {
	
	private double valor = 0.0;

	@Override
	public void realizarPagamento(double valor) {
		System.out.println("Realizando pagamento de cartao no valor de R$: " + valor);
		this.valor = valor;
	}

	@Override
	public void validarValor(double valor) {
		if (valor <= 10) {
			throw new IllegalArgumentException("Valor é invalido");
		}
	}

	@Override
	public void emitirComprovante() {
		System.out.println("Emissão de comprovante de Cartão");
	}

	@Override
	public void validarCPF(String cpf) {
		System.out.println("Validando cpf: " + cpf);
	}

}
