package com.senac.banco.controller;
import com.senac.banco.model.*;
import com.senac.banco.view.*;
import java.util.*;

public class ClienteController {
	Scanner teclado = new Scanner(System.in);
	protected Conta conta1 = new Conta();
	protected Cliente cliente1 = new Cliente();
	protected Especial clienteEspecial = new Especial();
	protected Investimento investe = new Investimento();

	 public void criaConta()
	 {
		 
				 		 
		cliente1 = new Cliente();
		System.out.println("Digite seu nome e tipo de conta( 1- Comum, 2- Especial e 3- Investimento):");
		cliente1.setNome(teclado.next());
		cliente1.setTipoConta(teclado.nextInt());
	
		 conta1 = new Conta();
		 System.out.println(" Escolha um numero de verificação para sua conta e escolha numero para sua conta:");
		 conta1.setNunVerificacao(teclado.nextInt());
		 conta1.setNunConta(teclado.nextInt());
				    
				System.out.println("Operaçao concluida!");
		
			
		}
	 
	 public void saque()
	 {
		 System.out.println("Digite o valor para saque: ");
		 if(cliente1.getTipoConta() == 1){
			 conta1.sacar(teclado.nextDouble());
			 System.out.println("Operaçao concluida!");
		 }else
		 	{
			 
			 System.out.println("Saldo insuficiente!");
		 	}
	
		 if(	 cliente1.getTipoConta() == 2)
		 {
			 clienteEspecial.sacar(teclado.nextDouble());
		
		 }else
		 {
		  System.out.println("saldo insuficiente!");
		 }
			 
	} 
			
		public void showSaldo()
		{
			System.out.println();
		}
		
		public void investimento()
		{
			investe.dividendos(taxa);
			
		}
		
		public void deposito(Double valordepo)
		{
			conta1.depositar(valordepo);
			
		}
			
		
		 
	
		 
	 
	 
	
	 
	

}
