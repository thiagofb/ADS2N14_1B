package com.senac.banco.model;

public class Especial extends Conta {
	
	private double limite;
	
	//limite sera o dobro do saldo
	public void verificaLimite()
	{
		//falta testar se for negativo(para nao gerar valor dobrado negativo)
		limite = 2 * super.saldo;
	}
	public void saque(Double saque)
	{
		super.saldo -= saque;
				
	}
	
	

}
