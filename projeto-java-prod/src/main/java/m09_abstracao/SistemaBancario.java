package m09_abstracao;

public class SistemaBancario {

	public void executarPagamento(Pagamento pagamento) {
		pagamento.validarValor();
		pagamento.realizarPagamento();
		pagamento.emitirComprovante();
	}

}
