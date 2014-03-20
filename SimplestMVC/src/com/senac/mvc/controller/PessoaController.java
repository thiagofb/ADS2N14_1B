package com.senac.mvc.controller;

import com.senac.mvc.model.Pessoa;
import com.senac.mvc.view.ContatoView;

public class PessoaController {
	
    private String[] nome = new String[10];
    private String[] sobrenome = new String[10];
    private String[] tel = new String[5];
    private String[] tel2 = new String[5];
    private String[] ddd = new String[3];
	private Pessoa[] contato = new Pessoa[50];
    private int varNome,varSobre;

	
	
	
	public void criarContato()
	{		
		
		nome[0] = "João";
		nome[1] = "Maria";
		nome[2] = "Pedro";
		nome[3] = "Joaquina";
		nome[4] = "Felizberto";
		nome[5] = "Sofia";
		nome[6] = "Mateus";
		nome[7] = "Josefina";
		nome[8] = "Mario";
		nome[9] = "Creusa";
				
		sobrenome[0] = "Pedrosa";
		sobrenome[1] = "Caetano";
		sobrenome[2] = "Bondoso";
		sobrenome[3] = "Malvadao";
		sobrenome[4] = "Perfeito";
		sobrenome[5] = "Malvadao";
		sobrenome[6] = "Cruel";
		sobrenome[7] = "Violento";
		sobrenome[8] = "Malvadao";
		sobrenome[9] = "terranova";
		
		tel[0] = "1111";
		tel[1] = "2222";
		tel[2] = "3333";
		tel[3] = "4444";
		tel[4] = "5555";
	    
		tel2[0] = "999";
		tel2[1] = "888";
		tel2[2] = "777";
		tel2[3] = "666";
		tel2[4] = "555";
		
		ddd[0] = "051";
		ddd[1] = "052";
		ddd[2] = "053";
		
				
				
	
		for(int i =0;i<50;i++)
			
		{
		varNome = (int) (Math.random()*10);
		varSobre = (int) (Math.random()*10);
		int varTel = (int) (Math.random()*5);
		int varTel2 = (int) (Math.random()*5);
		int varDdd = (int) (Math.random()*3);
		
	//System.out.println("Nome :"+ nome[varNome]+" "+ sobrenome[varSobre] );
		
	//System.out.println(" Rua Dr(a):"+ nome[varNome]+"de  "+ sobrenome[varSobre] );
		
		contato[i] = new Pessoa();
		contato[i].setNome(nome[varNome]+" "+ sobrenome[varSobre]);
	//	contato[i].setNome(sobrenome[varSobre]);
		contato[i].setTelefone(ddd[varDdd]+" "+tel2[varTel2]+" "+tel[varTel]);
		contato[i].setEndereco(nome[varNome]+" de "+ sobrenome[varSobre]);
	
		
		
		
		}
		
		
				
 	
		
		
	}
	
	public void exibirContato( ContatoView view )
	{
		for(int j=0; j<50;j++)
			
		view.printContato(contato[j].getNome(), contato[j].getTelefone(), contato[j].getEndereco());
		
		
	}
	
}
