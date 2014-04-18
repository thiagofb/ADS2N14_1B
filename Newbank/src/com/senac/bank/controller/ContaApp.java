package com.senac.bank.controller;

import com.senac.bank.model.*;
import com.senac.bank.view.*;

public class ContaApp {
	BankView view = new BankView();
	Cliente[] cliente = new Cliente[3];
	Conta conta = new Conta();
	Cliente c1 = new Cliente();
	
	public void criaConta()
	{
		int cont=0;
		cliente[cont];
		conta.setNumConta(1);
		
		
		view.showMessage("Digite tipo de conta \n 1- Conta \n 2- Especial \n 3- Investimento"+ cliente.getTipoConta());
	}


	public int tipoConta()
	{
		Cliente cliente = new Cliente();
		return cliente.setTipoConta();
		 
	}
	
	
}