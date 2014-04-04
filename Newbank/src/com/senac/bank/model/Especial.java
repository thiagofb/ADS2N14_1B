package com.senac.bank.model;



public class Especial extends Conta {
		
		private double limite =0;

		
		public Especial(double saldo, int numConta,double limite) 
		{
		super(saldo, numConta);
		this.limite = limite;
		}

		
		//limite sera o dobro do saldo
			public void verificaLimite()
		{
			limite = super.saldo*2;
		}
		
		//saque tem que ser menor que o limite
		public void sacar(Double valor)
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
