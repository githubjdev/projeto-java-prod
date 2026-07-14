package m04_estruturas_condicionais_e_tomada_de_decisao_no_java;

public class ex05 {
	
	
	public static void main(String[] args) {
		
		StatusPedido statusPedido = StatusPedido.ESTORNADO;
		
		String retorno = switch (statusPedido) {
		       case NOVO -> "Seu pedido foi criado";
		       case CANCELADO -> "Seu pedido acaba de ser cancelado";
		       case PAGO -> "Recebemos o pagamento do seu pedido";
		       case ENVIADO -> "Seu pedido acaba de ser enviado para a transportadora";
		       case ESTORNADO -> "Seu pedido foi estornado";
		    default -> "Inválido";   
		};
		
		
		System.out.println("Status do pedido: " + retorno);
		
	}

}
