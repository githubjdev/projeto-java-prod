package m11_polimorfismo_mais;

public sealed interface Pagamento permits Pix, Cartao {
	
	public void pagar(double valor);
	public void pagar();

}
