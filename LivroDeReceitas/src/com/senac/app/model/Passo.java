package com.senac.app.model;

import com.senac.app.estruturas.Vetor;

public class Passo {
	private String descricao;
	private Vetor ingredientes;
	
	public Passo() {
		this.descricao = "";
		this.ingredientes = new Vetor();
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void addIngrediente(Ingrediente ingrediente) {
		ingredientes.add(ingrediente);
	}
	
	public Ingrediente getIngrediente(int index) {
		return ingredientes.get(index);
	}
	
	public int countIngredientes() {
		return ingredientes.size();
	}
}
