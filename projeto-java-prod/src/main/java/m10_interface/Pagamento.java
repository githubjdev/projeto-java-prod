package m10_interface;

/*Interface apena tem os métodos declarado, não tem corpo, não construtor, não tem atributo*/
/*É um contrato que deve ser seguido e executado pelas classes filhas*/
public interface Pagamento {
	
	public void realizarPagamento(double valor);
	
	public void validarValor(double valor);
	
	public void emitirComprovante();
	
	public void validarCPF(String cpf);

}
