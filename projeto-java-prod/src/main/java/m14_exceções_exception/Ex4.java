package m14_exceções_exception;

public class Ex4 {
	
	public static void main(String[] args) throws SaldoInsuficienteException {
		
		double saldo = 1000.0;
		
		if (saldo < 2000) {
			throw new SaldoInsuficienteException("Saldo insuficiente para realizar a operação.");
		}
		
	}

}
