package m10_interface;

public class MainPagamento {

	public static void main(String[] args) {
		
		
		SistemaBancario sistemaBancario = new SistemaBancario();
		sistemaBancario.executarPagamento(new Pix(), 50, "56565565665");
		sistemaBancario.executarPagamento(new Boleto(), 60, "545454554");
		sistemaBancario.executarPagamento(new Cartao(), 70, "55455");

	}
}
