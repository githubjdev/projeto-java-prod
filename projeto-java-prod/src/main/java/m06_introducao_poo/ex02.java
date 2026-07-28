package m06_introducao_poo;

import java.util.Calendar;

public class ex02 {
	
	public static void main(String[] args) {
		/*Cria a instancia*/
		ContaBancaria  bancaria = new ContaBancaria("Alex fernando egidio");
		
		/*Passa os as informacoes para os atributos*/
		bancaria.setNumero("465465465");
		bancaria.setAgencia("0001");
		bancaria.setDv("1");
		bancaria.setValor(10000);
		bancaria.setLimite(500);
		bancaria.setTipo("CORRENTE");
		bancaria.setDataAbertura(Calendar.getInstance().getTime());
		
		/*Chama de métodos que realizam ação*/
		System.out.println("SAQUE Saldo: " + bancaria.sacar(75));
		
		System.out.println("DEPOSITO Saldo: " + bancaria.depositar(95));
		
		System.out.println("TRANSFERENCIA Saldo: " + bancaria.transferencia("45755445", 450));
		
		System.out.println("Data de abertura: " + DateUtil.formatarData(bancaria.getDataAbertura()));
		
	}

}
