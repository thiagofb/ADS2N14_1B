package com.senac.banco.controller;
import com.senac.banco.model.*;

public class ClienteController {
	
	private Conta conta = new Conta();
	private Cliente cliente = new CLiente();
	 
	 public void criaCliente()
	 {
		 cliente = new Cliente();
		 conta = new Conta();
	 }
	 
	 public void operacao()
	 {
		 cliente.criaCliente();
		 
		 
		 
	 }
	 
	 
	

}
