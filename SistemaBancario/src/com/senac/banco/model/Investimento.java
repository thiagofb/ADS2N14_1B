package com.senac.banco.model;

public class Investimento extends Conta{
	
	protected int dataCriacao;
	
	
	public void dividendos(Double taxa)
	{
		taxa=0.41;
		super.saldo = super.saldo * (super.saldo*taxa);
	}
	
	
	public int getDataCricao()
	{
		return dataCriacao;
	}
	

}
