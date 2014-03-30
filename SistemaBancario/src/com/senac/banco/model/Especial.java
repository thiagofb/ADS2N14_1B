package com.senac.banco.model;

public class Especial extends Conta {
	
		
	private double limite =0;
	
	
	
	public Especial()
	{
					
	}	
	
	//limite sera o dobro do saldo
		public void verificaLimite()
	{
		limite = super.saldo*2;
	}
	
	//saque tem que ser menor que o limite
	public void saque(Double valor)
	{
		if(valor <= limite)
		{
		super.saldo-= valor;
		System.out.println("Saque realizado com sucesso!");
		}
		else
		{
			System.out.println("Saldo insuficiente para realizar esta operação!");
		}
		
	}
	


}
