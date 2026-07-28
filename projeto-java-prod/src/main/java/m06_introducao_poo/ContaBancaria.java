package m06_introducao_poo;

import java.util.Date;

public class ContaBancaria {

	/* atributos carregam informação */
	private String numero;
	private String agencia;
	private String dv;
	private double valor;
	private final String pessoa; /*final estabelece que não pode mudar o nome da pessoa*/
	private double limite;
	private String tipo;
	private Date dataAbertura;
	
	public ContaBancaria(String pessoa) {
		this.pessoa = pessoa;
	}
	

	public void setNumero(String numero) { /* Setar, adicionar valor no obejto */
		this.numero = numero;
	}

	public String getNumero() { /* Recuperar o valor de dentro do obejeto */
		return numero;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getAgencia() {
		return agencia;
	}

	public String getDv() {
		return dv;
	}

	public void setDv(String dv) {
		this.dv = dv;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {

		if (valor <= 0) {
			return;
		}

		this.valor = valor;
	}

	public String getPessoa() {
		return pessoa;
	}


	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	/* Executam uma ação */
	public double sacar(double valor) {

		if (valor <= 0) {
			return this.valor;
		}

		this.valor = this.valor - valor;
		return this.valor;
	}

	public double depositar(double valor) {

		if (valor <= 0) {
			return this.valor;
		}

		this.valor = this.valor + valor;
		return this.valor;
	}

	public double transferencia(String pix, double valor) {
		
		if (pix == null) {
			return this.valor;
		}

		if (valor <= 0) {
			return this.valor;
		}

		this.valor = this.valor - valor;
		return this.valor;
	}

}
