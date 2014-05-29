package com.senac.jogos.apps.Matching;

public class Jogador {
	
	private int pontos;
	private boolean played;
	
	public Jogador()
	{
		this.pontos = 0;
		this.played = true;
	}
	
	public int getPontos()
	{
		return pontos;
	}

	public void addPontos(int amount)
	{
		pontos += amount;
	}
	
	public void subtractPontos(int amount)
	{
		pontos -= amount;
	}

	public void setPlayed(boolean played) {
		this.played = played;
	}

	public boolean hasPlayed() {
		return played;
	}
}










