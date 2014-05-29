package com.senac.jogos.apps.Matching;

import com.senac.jogos.cartas.Baralho;
import com.senac.jogos.cartas.Carta;

public class MatchingCardGame {

	private Baralho baralho;
	private Jogador[] jogador;
	private int jogadores;
	private Carta mesa;
	
	public MatchingCardGame()
	{
		baralho = null;
		jogador = new Jogador[4];
		mesa = null;
		jogadores = 0;
	}
	
	public void startGame(int jogadores) {
		this.jogadores = jogadores;
		this.baralho = new Baralho();
		this.mesa = baralho.drawCarta();
		for(int j = 0; j < jogadores; ++j)
			this.jogador[j] = new Jogador();
	}
	
	public int getQuantidadeJogadores()
	{
		return jogadores;
	}
	
	public int matchCarta(Carta carta)
	{
		int score = -1;
		
		if (carta.getNaipe() == mesa.getNaipe())
			score = 1;
		if (carta.getValor() == mesa.getValor())
			score = 4;
		
		return score;
	}
	
	public void setMesa(Carta carta)
	{
		mesa = carta;
	}
	
	public Carta getMesa()
	{
		return mesa;
	}

	
	public Carta drawCarta()
	{
		return baralho.drawCarta();
	}
	
	public Jogador getJogador(int index)
	{
		return jogador[index];
	}

	public boolean isGameOver() {
		return !baralho.hasCardsLeft();
	}
}