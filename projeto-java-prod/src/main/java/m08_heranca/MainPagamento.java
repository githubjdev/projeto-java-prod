package m08_heranca;

public class MainPagamento {

	public static void main(String[] args) {

		Pix pix = new Pix(100.0, "123456789");
		pix.pagar();
		pix.imprimirRecibo();

		Boleto boleto = new Boleto(200.0, "12345678901234567890");
		boleto.pagar();
		boleto.imprimirRecibo();

		Cartao cartao = new Cartao(300.0, "1234 5678 9012 3456");
		cartao.pagar();
		cartao.imprimirRecibo();

	}

}
