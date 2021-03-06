package com.senac.jogos.apps.Matching.controller;

import com.senac.jogos.apps.Matching.model.MatchingCardGame;
import com.senac.jogos.cartas.Carta;

public class JogoController {

	private MatchingCardGame jogo;
	private Carta cartaJogador;
	
	public JogoController()
	{
		jogo = new MatchingCardGame();
		cartaJogador = null;
	}
	
	public void playTurno()
	{
		int pontos = jogo.matchCarta(cartaJogador);
		
		// falta vincular os pontos ao jogador
		jogo.getJogador1().addPontos(pontos);
		jogo.getJogador2().addPontos(pontos);
		jogo.getJogador3().addPontos(pontos);
		jogo.getJogador4().addPontos(pontos);
		// descartar carta
		jogo.setMesa(cartaJogador);
		cartaJogador = null;
	}
	
	public String showJogador()
	{
		return String.format("Pontos: %d", jogo.getJogador1().getPontos());
	}
	
	private String showCarta(Carta carta)
	{
		return String.format("%d%c",
						     carta.getValor(),
						     carta.getNaipe());
	}

	public String showMesa()
	{
		return showCarta(jogo.getMesa());
	}
	
	public String showCartaJogador()
	{
		if (cartaJogador == null)
			cartaJogador = jogo.drawCarta();
		return showCarta(cartaJogador);
	}
}
