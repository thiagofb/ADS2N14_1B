package com.senac.banco.model;

public class Conta {

	protected double saldo=0;
	protected int numConta;
	protected int numVerificacao;
	
	
	
	public Conta()
	{
		
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
	//para criar numero da conta
    public void setNunConta(int id)
    {
    	numConta=id;
    }

	public int getNumVerificacao() {
		return numVerificacao;
	}
	
	// para criar uma senha
	public void setNunVerificacao(int key)
	{
		numVerificacao = key;
	}

		
	
}
