package com.senac.banco.controller;
import com.senac.banco.model.*;
import java.util.*;

public class ClienteController {
	protected Cliente Cliente;
	protected Conta conta1 = new Conta();
	protected Cliente cliente = new Cliente();
	 
	 public void criaConta()
	 {
		 Scanner teclado = new Scanner (System.in);
		 
		conta1 = new Conta();
		System.out.println(" Escolha um numero de verificação para sua conta e escolha numero para sua conta:");
		conta1.setNunVerificacao(teclado.nextInt());
		conta1.setNunConta(teclado.nextInt());
		 
	 }
	 
	 public void operacao()
	 {
		 cliente.criaCliente();
		 		 
		 
	 }
	 
	 
	

}
