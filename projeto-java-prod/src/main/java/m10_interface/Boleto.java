package m10_interface;

public class Boleto implements Pagamento {
	
	private double valor = 0.0;

	@Override
	public void realizarPagamento(double valor) {
		System.out.println("Realizando pagamento de boleto no valor de R$: " + valor);
		this.valor = valor;
	}

	@Override
	public void validarValor(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor é invalido para boleto");
		}
	}

	@Override
	public void emitirComprovante() {
		System.out.println("Emissão de comprovante de Boleto");
	}

	@Override
	public void validarCPF(String cpf) {
		System.out.println("Validando cpf: " + cpf);
	}

}
