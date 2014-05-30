package com.senac.pilha;

public class Pilha {

	public int[] vetor;
	public int ponteiro;
	
	public Pilha(){
		this.ponteiro=-1;
		this.vetor = new int[3];
	}
	
	public boolean isEmpty(){
		if(this.ponteiro==-1)
		{
			return true;
		}
		else
			return false;
	}
	
	public int size(){
		if(this.isEmpty()){
			return 0;
		}else
		
			return this.ponteiro += 1;
			
	}
	
	public int top(){
		if(isEmpty()){
			return 0;
			}else
				return this.vetor[this.ponteiro];
	}
	
	public int pop(){
		if(isEmpty()){
			return 0;
		}else
		return this.vetor[this.ponteiro--];
	}
	
	public void push(int valor){
		if(this.ponteiro < this.vetor.length-1){
			this.vetor[++ponteiro]=valor;
		}
	}
	
	
	
	
}
