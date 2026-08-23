package m10_interface;

public class Pix implements Pagamento {
	
	
	private double valor = 0.0;

	@Override
	public void realizarPagamento(double valor) {
		System.out.println("Realizando pagamento de pix no valor de R$: " + valor);
		this.valor = valor;
	}

	@Override
	public void emitirComprovante() {
		System.out.println("Emissão de comprovante de PIX");
	}

	@Override
	public void validarValor(double valor) {
		if (valor <= 5) {
			throw new IllegalArgumentException("Valor é invalido para pix");
		}
	}

	@Override
	public void validarCPF(String cpf) {
		System.out.println("Validando cpf: " + cpf);
	}

}
