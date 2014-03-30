package com.senac.banco.view;
import java.util.*;
import com.senac.banco.model.Cliente;

public class ClienteView {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int op1=0; // para qem tem conta
		int op2=0; // para realizar operaçao na conta
		int op3=0; // para criar conta

		
		// AQUI devera tem uma repetição do sistema usando DO while ou while  TESTAr
		
		
		System.out.println("BEM VINDO AO SISTEMA BANCARIO XXX");
		System.out.println("Voce já e nosso Cliente: \n 1- Sim \n 2- Não, mas quero abrir uma conta");
		op1= t.nextInt();
			
		
		
		switch(op1){
		case 1:
			// Primeira parte do switch user ja tem conta e deseja fazer operação
			
			System.out.println("Digite numero da sua conta e sua senha");
			// compara a conta e a senha se validar abre as operações se nao pede novamente senha
			System.out.println("Bem vindo Sr(a) \n Digite: \n 1- Sacar \n 2- Ver saldo \n 3- Depositar \n 4- SAIR");
			// realiza as operações conforme opçao
			op2 = t.nextInt();
			switch(op2){
			case 1: 
				//realiza saque
				break;
			case 2: 
				// verifica saldo
				break;
			case 3:
				// realiza deposito
				break;
			case 4:
				// sai do programa
				break;
			
			}
			
			
			break;
			
			
			// segunda parte do 1º switch se cliente qer abrir uma conta
			
			
		case 2:
			System.out.println("Que tipo de conta deseja abrir: \n 1- Comum \n 2- Especial \n 3- Investimento \n 4- SAIR");
			// chama as aberturas de conta
			op3= t.nextInt();
			
			switch(op3){
			
			case 1:
				// cria conta comum
				break;
			case 2:
				//cria conta Especial
				break;
			case 3: 
				//cria conta de investimento
				break;
			case 4:
				// SAIR do programa
				break;
			}
			
			break;
		default:
			System.out.println("Operação invalida!");
			break;
		
		
		}
		
	
        
         
	}

		
		
		

}


