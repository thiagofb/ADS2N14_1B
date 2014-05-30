package com.senac.pilha;

public class TestPilha {

	
	public static void main(String[] args) {

		Pilha p = new Pilha();
		
		p.push(1);
		p.push(2);
		p.push(3);
		
		
		while(p.isEmpty() == false){
			System.out.println(p.pop());
		}
		
		
		
	}

}
