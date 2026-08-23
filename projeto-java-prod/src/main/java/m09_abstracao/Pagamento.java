package m09_abstracao;


/*Abstração ele pode conter métodos que pode ser reutilizados ou não
 * e  tb tem métodos que é obrigatório a sua implementação pela classe filhas*/
public abstract class Pagamento {
	
	
	protected double valor;
	
	/*Obriga o recebimento do valor ao ndar um new objeto*/
	public Pagamento(double valor) {
		this.valor = valor;
	}
	
	
	/*Método generico que pode ser usados por todas as classes filhas*/
	public void emitirComprovante() {
		System.out.println("Emitindo comprvante  de pagamento no valor de R$ " + valor);
		System.out.println("----------------------------------------------------------");
	}
	
	/*Esse abstract método obriga que a as classes filhas sobreescrevam e implementam da sua forma*/
	public abstract void realizarPagamento();
	
	
	protected void validarValor() {
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor é invalido");
		}
	}
	

}
