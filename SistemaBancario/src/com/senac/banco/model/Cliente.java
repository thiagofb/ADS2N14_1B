package com.senac.banco.model;
import com.senac.banco.model.*;
public class Cliente {
	
	protected String nome;
	protected Cliente[] cliente = new Cliente[4];
	protected Conta conta = new Conta();
	protected Especial premium = new Especial();
	
	public Cliente()
	{
			
	}
	
	public void criaCliente()
	{
		for(int i=0;i<3;i++)
		{
			cliente[i]= new Cliente();
			cliente[i].setNome(nome);
			cliente[i].conta.setNunConta(i);
			cliente[i].conta.setNunVerificacao(i);
			
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	

}
