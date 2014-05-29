package com.senac.app.estruturas;

import com.senac.app.model.Ingrediente;

public class Vetor {

	private Ingrediente[] dados;
	private int numElementos;
	
	public Vetor() {
		dados = new Ingrediente[0];
		numElementos= 0;
	}
	
	private void aumentaArmazenamento() {
		Ingrediente[] novo = new Ingrediente[dados.length + 5];
		System.arraycopy(dados, 0, novo, 0, dados.length);
		dados = novo;
	}
	
	public void add(Ingrediente ingrediente) {
		if (numElementos == dados.length) {
			aumentaArmazenamento();
		}
		dados[numElementos] = ingrediente;
		numElementos++;
	}

	public Ingrediente get(int index) {
		return dados[index];
	}

	public int size() {
		return numElementos;
	}

}





