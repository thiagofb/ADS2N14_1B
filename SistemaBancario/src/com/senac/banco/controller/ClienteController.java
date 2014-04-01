package com.senac.banco.controller;
import com.senac.banco.model.*;
import com.senac.banco.view.*;
import java.util.*;

public class ClienteController {
	Scanner teclado = new Scanner(System.in);
	protected Conta[] conta1 = new Conta[3];
	protected Cliente[] cliente1 = new Cliente[3];
	protected Especial[] clienteEspecial = new Especial[3];
	protected Investimento[] investe = new Investimento[3];
	 int digitaconta = teclado.nextInt();
	 int digitasenha = teclado.nextInt();

	 public void criaConta()
	 {
		 
for (int i=0;i<2;i++)
			{	 		 
		cliente1[i] = new Cliente();
		System.out.println("Digite seu nome e tipo de conta( 1- Comum, 2- Especial e 3- Investimento):");
		cliente1[i].setNome(teclado.next());
		cliente1[i].setTipoConta(teclado.nextInt());
	
		 conta1[i] = new Conta();
		 System.out.println(" Escolha um numero de verificação para sua conta e escolha numero para sua conta:");
		 conta1[i].setNunVerificacao(teclado.nextInt());
		 conta1[i].setNunConta(teclado.nextInt());
				    
				System.out.println("Operaçao concluida!");
	}
			
		}
	 
	 public void saque()
	 {
	
		 System.out.println("Digite numero da sua conta e senha: ");
	
		
		 for(int j=0;j<2;j++)
			 if(conta1[j].getNumConta() == digitaconta){
				 if(conta1[j].getNumVerificacao() == digitasenha)
					 conta1[j].sacar(teclado.nextDouble());
				 	System.out.println("Operaçao concluida!");
			 }
			 else
				 
	
		  System.out.println("saldo insuficiente!");
		 
			 
	} 
			
		public void showSaldo()
		{
			System.out.println("Digite numero da sua conta e a senha: ");
			for(int j=0;j<2;j++){
				 if(conta1[j].getNumConta() == digitaconta)
				 {
					 if(conta1[j].getNumVerificacao() == digitasenha)
					 {
					 conta1[j].getSaldo();
			
			System.out.println("Seu saldo é" + conta1[j].getSaldo());
					 }
				 }
		}
		}
		
		public void investimento()
		{
			 System.out.println("Digite numero da sua conta e a senha: ");
				for(int j=0;j<2;j++){
					 if(conta1[j].getNumConta() == digitaconta){
						 if(conta1[j].getNumVerificacao() == digitasenha)
				        	investe[j].dividendos(teclado.nextDouble());
					 }//fim if
					 else{
						 System.out.println("error");
					 }
				}//fim for
		}
		
		public void deposito()
		{
			
			 System.out.println("Digite numero da sua conta e a senha: ");
			for(int j=0;j<2;j++)
				 if(conta1[j].getNumConta() == digitaconta){
					 if(conta1[j].getNumVerificacao() == digitasenha)
			            System.out.println("DIgite valor do deposito");
					    double valordepo=0;
						 conta1[j].depositar(valordepo);
			
		}
			
		
		 
	
		 
	 
	 
	
	 
		}

}
