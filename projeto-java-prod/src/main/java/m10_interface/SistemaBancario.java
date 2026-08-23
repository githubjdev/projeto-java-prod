package m10_interface;

public class SistemaBancario {

	
	public void executarPagamento(Pagamento pagamento, double valor, String cpf) {
		
		pagamento.validarValor(valor);
		pagamento.validarCPF(cpf);
		pagamento.realizarPagamento(valor);
		pagamento.emitirComprovante();
		
	}
}
