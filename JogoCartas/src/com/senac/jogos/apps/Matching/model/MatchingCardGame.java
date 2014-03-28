package com.senac.jogos.apps.Matching.model;

import com.senac.jogos.Jogador;
import com.senac.jogos.cartas.Baralho;
import com.senac.jogos.cartas.Carta;

public class MatchingCardGame {

	private Baralho baralho;
	/* criando um array(4 posições) para guardar as referencias do jogador*/
	private Jogador[] jogador = new Jogador[4];
	
	private Carta mesa;
	
	public MatchingCardGame()
	{
		baralho = new Baralho();
		//mesa = baralho.drawCarta();		
		// instanciando 4 jogadores nas suas respectivas posições
		
		for(int i=0;i<3;i++)			
		{
		jogador[i] = new Jogador();
		mesa = baralho.drawCarta();	
		}		
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
	
	public Jogador getJogador1()
	{
		
		return jogador[1];
	}
	public Jogador getJogador2()
	{
		
		return jogador[2];
	}
	public Jogador getJogador3()
	{
		
		return jogador[3];
	}
	public Jogador getJogador4()
	{
		
		return jogador[4];
	}
	/*
	public void setJogador1()
	{
		
		jogador[1] =;
	}
	public Jogador setJogador2()
	{
		
		return jogador[2];
	}
	public Jogador setJogador3()
	{
		
		return jogador[3];
	}
	public Jogador setJogador4()
	{
		
		return jogador[4];
	}
	*/
}












