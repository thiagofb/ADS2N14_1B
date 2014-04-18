package com.senac.bank.model;

public class Conta {

	protected double saldo;
	private int numConta;
	
	public Conta(double saldo, int numConta)
	{
		this.saldo = saldo;
		this.numConta = numConta;
	}
	

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}


	public Conta() {
		// TODO Auto-generated constructor stub
	}


	public void depositar(double valor)
	{
		saldo+=valor;
	}
	
	public void sacar(double valor)
	{
		if(valor <= saldo)
		{
			saldo-=valor;
			System.out.println("Saque efetuado com sucesso!");
		}
		else
		{
			System.out.println("Saldo insuficiente para realizar esta operação!");
		}
		
	}

	public double getSaldo() {
		return saldo;
	}


	public int getNumConta() {
		return numConta;
	}
	

	
		
	
}
