package com.senac.banco.controller;
import com.senac.banco.model.*;
import com.senac.banco.view.*;
import java.util.*;

@SuppressWarnings("unused")
public class ClienteController {
	Scanner teclado = new Scanner(System.in);

	protected Conta[] conta1 = new Conta[3];
	protected Cliente[] cliente1 = new Cliente[3];
	protected Especial[] clienteEspecial = new Especial[3];
	protected Investimento[] investe = new Investimento[3];

	ClienteView view = new ClienteView();

	public void criaConta(String nome, int tipo, int nconta)
	{

		int i=0;		
			cliente1[i] = new Cliente();
			cliente1[i].setTipoConta(tipo);
            cliente1[i].setNome(nome);
            //normal
            if(tipo ==1)
			conta1[i] = new Conta();
			conta1[i].setNunConta(nconta);
			//Especial
			if(tipo==2)
		    clienteEspecial[i].setNunConta(nconta);
			//Investimento
			if(tipo == 3)
			investe[i].setNunConta(nconta);
		i++;

	}

	public void saque(int tipo, int nconta ,double valor)
	{
       if(tipo ==1)
       {
    	   
    	   for(int j=0;j<2;j++)
   			{
    		   if(conta1[j].getNumConta() == nconta)
   				{
   				
   					conta1[j].sacar(valor);
   				view.showMsg("Operaçao concluida!");
   				}
   				else

   					view.showMsg("saldo insuficiente");
   				
   			}
    	   
       }
       if(tipo ==2)
       {
    	   for(int j=0;j<2;j++)
   			{
   				if(clienteEspecial[j].getNumConta() == nconta)
   				{
   				
   					clienteEspecial[j].sacar(valor);
   					view.showMsg("Operaçao concluida!");
   				}
   				else


   					view.showMsg("saldo insuficiente!");
   			}
       }
       if(tipo ==3)
       {
    	   for(int j=0;j<2;j++)
   			{
   				if(investe[j].getNumConta() == nconta)
   				{
   				
   					investe[j].sacar(valor);
   					view.showMsg("Operaçao concluida!");
   				}
   				else


   					view.showMsg("saldo insuficiente!");
   			}
       }
       
		

	} 

	public void showSaldo(int type, int nconta)
	{
		if(type==1)
		{
			for(int j=0;j<2;j++)
			{
				if(conta1[j].getNumConta() == nconta)
				{
					conta1[j].getSaldo();
					view.showMsg("Seu saldo é" + conta1[j].getSaldo());				
				}
				else
					view.showMsg("error");
			}
		}
		if(type==2)
		{
			for(int j=0;j<2;j++)
			{
				if(clienteEspecial[j].getNumConta() == nconta)
				{
					clienteEspecial[j].getSaldo();
					view.showMsg("Seu saldo é" + clienteEspecial[j].getSaldo());				
				}
				else
					view.showMsg("Erro");
			}
		}
		if(type==3)
		{
			for(int j=0;j<2;j++)
			{
				if(investe[j].getNumConta() == nconta)
				{
					investe[j].getSaldo();
					view.showMsg("Seu saldo é" + investe[j].getSaldo());				
				}
				else
					view.showMsg("Erro");
			}
		}
	
	
	}
/*
	public void investimento(int tipo, int nconta, double valor)
	{
		
		if(tipo ==1)
		{
			
			for(int j=0;j<2;j++)
			{
				if(conta1[j].getNumConta() == nconta)
				{
		
					investe[j].dividendos(valor);
				}//fim if
			else{
				view.showMsg("error");
			    }
			}//fim for
		}
	}
	*/

	public void deposito(int nconta, double valor,int type)
	{
       if(type ==1)
       {      
    	   for(int j=0;j<2;j++)
    		   if(conta1[j].getNumConta() == nconta)
    		   {	
				conta1[j].depositar(valor);
    		   }
    		   else
				view.showMsg("Error");
       }
       if(type ==2)
       {      
    	   for(int j=0;j<2;j++)
    		   if(clienteEspecial[j].getNumConta() == nconta)
    		   {	
    			   clienteEspecial[j].depositar(valor);
    		   }
    		   else
				view.showMsg("Error");
       }
       if(type ==3)
       {      
    	   for(int j=0;j<2;j++)
    		   if(investe[j].getNumConta() == nconta)
    		   {	
    			   investe[j].depositar(valor);
    		   }
    		   else
				view.showMsg("Error");
       }

	
	}
}
