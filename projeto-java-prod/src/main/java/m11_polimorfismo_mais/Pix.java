package m11_polimorfismo_mais;

public final  class Pix implements Pagamento {
	
	private double valor;

	public Pix(double valor) {
		super();
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	@Override
	public void pagar() {
		System.out.println("Realizando pagamento de pix, valor R$: " + getValor());
	}

	@Override
	public void pagar(double valor) {
		// TODO Auto-generated method stub
		
	}

}
