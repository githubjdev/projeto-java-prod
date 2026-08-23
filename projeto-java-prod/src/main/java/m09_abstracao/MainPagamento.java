package m09_abstracao;

public class MainPagamento {

	public static void main(String[] args) {

		
		SistemaBancario sistemaBancario = new SistemaBancario();
		sistemaBancario.executarPagamento(new Pix(50));
		sistemaBancario.executarPagamento(new Boleto(60));
		sistemaBancario.executarPagamento(new Cartao(70));

	}

}
