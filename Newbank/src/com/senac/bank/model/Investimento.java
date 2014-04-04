package com.senac.bank.model;

public class Investimento extends Conta {


	private int dataCriacao;
	
	public Investimento(double saldo, int numConta, int dataCriacao) 
	{
		super(saldo, numConta);
		this.dataCriacao = dataCriacao;
	}


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
