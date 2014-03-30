package com.senac.banco.model;

public class Cliente {
	
	protected String nome;
	protected Cliente[] cliente = new Cliente[4];
	
	public Cliente()
	{
		
		
	}
	public void criaCliente()
	{
		for(int i=0;i<=3;i++)
		{
			cliente[i] = new Cliente();
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	

}
