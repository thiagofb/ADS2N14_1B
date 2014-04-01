package com.senac.banco.view;
import java.util.*;
import com.senac.banco.controller.*;
import com.senac.banco.model.*;

public class ClienteView {
	
	

	public static void main(String[] args) {
		ClienteController controle = new ClienteController();
		Scanner t = new Scanner(System.in);
	//	int op0=0; // entrar ou sair do sistema
		int op1=0; // para qem tem conta
		int op2=0; // para realizar operaçao na conta
		int op3=0; // para criar conta
        
		Cliente cliente1 = new Cliente(null, 0);
		Conta conta1 = new Conta();
		
		// AQUI devera tem uma repetição do sistema usando DO while ou while  TESTAr
	//	System.out.println("DIgite: \n 1- Entrar \n 2- Sair");
	//	op0=t.nextInt();
		
		
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
				controle.saque();
				// faz saque
				break;
			case 2: 
				// verifica saldo
				controle.showSaldo();
				break;
			case 3:
				// realiza deposito
				controle.deposito();
				break;
			case 4:
				// sai do programa
				break;
			
			}
			
			
			break;
			
			
			// segunda parte do 1º switch se cliente qer abrir uma conta
			
			
		case 2:
		
				controle.criaConta();
				break;
		}		
		
		
	 
         
}
		
		
}


