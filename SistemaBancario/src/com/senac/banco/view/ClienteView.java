package com.senac.banco.view;
import java.text.Format;
import java.util.*;
import com.senac.banco.controller.*;
import com.senac.banco.model.*;

@SuppressWarnings("unused")
public class ClienteView {
	
	

	public static void main(String[] args) {
	
		ClienteController controle = new ClienteController();
		@SuppressWarnings("resource")
		Scanner t = new Scanner(System.in);
		//int op0=0; // entrar ou sair do sistema
		int op1=0; // para qem tem conta
		int op2=0; // para realizar operaçao na conta
		
    
	System.out.println("DIgite: \n 1- Entrar \n 2- Sair");
	int op0=t.nextInt();
	while(op0 != 2){
		
		
		System.out.println("BEM VINDO AO SISTEMA BANCARIO XXX");
		System.out.println("Voce já e nosso Cliente: \n 1- Sim \n 2- Não, mas quero abrir uma conta");
		op1= t.nextInt();
			
		
		
		switch(op1){
		
		case 1:
			// Primeira parte do switch user ja tem conta e deseja fazer operação
	
			System.out.println("Bem vindo Sr(a) \n Digite: \n 1- Sacar \n 2- Ver saldo \n 3- Depositar \n 4- SAIR");
			
			// realiza as operações conforme opçao
			
			op2 = t.nextInt();
			
			switch(op2){
			
			case 1: 
				System.out.println("Tipo da conta: ");
				int tipo = t.nextInt();
				System.out.println("Digite numero da conta:");
				int nconta = t.nextInt();
				System.out.println("Digite o valor do saque:");
				double valor = t.nextDouble();
				
				
				controle.saque(tipo, nconta, valor);
				
				// faz saque
				break;
				
			case 2: 
				System.out.println("Digite tipo de conta 1-normal 2-especial 3-investimento");
				int type = t.nextInt();
				System.out.println("Digite numero da sua conta para consultar saldo: ");
				int nconta1 = t.nextInt();
				
				controle.showSaldo(type, nconta1);
				// verifica saldo
				
				break;
				
			case 3:
				System.out.println("Digite tipo de conta 1-normal 2-especial 3-investimento");
				int type1 = t.nextInt();
				System.out.println("Digite numero da sua conta: ");
				int nconta2 = t.nextInt();
				System.out.println("Digite valor do deposito: ");
				double depo = t.nextDouble();
				
				controle.deposito(nconta2,depo,type1);
				// realiza deposito
				break;
			case 4:
				// sai do programa
				break;
			
			}			
			
			
			// segunda parte do 1º switch se cliente qer abrir uma conta
			
			
		case 2:
			System.out.println("Digite seu nome: ");
			String nome = t.next();
			System.out.println("Escolha tipo de conta: 1-Normal 2-Especial 3-Investimento");
			int tipo = t.nextInt();
			System.out.println("Digite numero da conta");
			int nconta = t.nextInt();
		controle.criaConta(nome, tipo, nconta);
			
		
				break;
		}		// final do OP1 - switch de ja tem user ou nao
		
	}// fim do OP0 a repetição do programa
	
	}
	public void showMsg(String msg)
	{
	System.out.println(msg);
	}
		
	 
		
}


