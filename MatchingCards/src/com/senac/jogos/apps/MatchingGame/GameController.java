package com.senac.jogos.apps.MatchingGame;

import com.senac.jogos.Jogador;
import com.senac.jogos.cartas.Baralho;
import com.senac.jogos.cartas.Carta;
import com.senac.jogos.rules.MatchingGame;

public class GameController {

	private MatchingGame game1,game2,game3,game4;
	private Baralho baralho;
	private Jogador jogador1,jogador2,jogador3,jogador4;
	
	private GameView view;
	
	public GameController() {
		
		jogador1 = new Jogador();
		jogador2 = new Jogador();
		jogador3 = new Jogador();
		jogador4 = new Jogador();
		baralho = new Baralho();
		game1 = new MatchingGame(baralho.drawCarta());
		game2 = new MatchingGame(baralho.drawCarta());
		game3 = new MatchingGame(baralho.drawCarta());
		game4 = new MatchingGame(baralho.drawCarta());
		view = new GameView();
	}
	
	public void realizaJogada() {
		
		if (view.getUserInput().equalsIgnoreCase("jogar")) {
			
			Carta comprada = baralho.drawCarta();
			view.mostraCarta(comprada);
			int score = game1.matchCards(comprada);
			jogador1.addPontos(score);
			game1.setMesa(comprada);
		} 
		
		
			if (view.getUserInput().equalsIgnoreCase("jogar")) {
				
				Carta comprada = baralho.drawCarta();
				view.mostraCarta(comprada);
				int score = game2.matchCards(comprada);
				jogador2.addPontos(score);
				game2.setMesa(comprada);
			}
			else
				System.out.println("Digite jogar para continuar: ");
				if (view.getUserInput().equalsIgnoreCase("jogar")) {
					Carta comprada = baralho.drawCarta();
					view.mostraCarta(comprada);
					int score = game3.matchCards(comprada);
					jogador3.addPontos(score);
					game3.setMesa(comprada);}
				else
					
					if (view.getUserInput().equalsIgnoreCase("jogar")) {
						Carta comprada = baralho.drawCarta();
						view.mostraCarta(comprada);
						int score = game4.matchCards(comprada);
						jogador4.addPontos(score);
						game4.setMesa(comprada);}
				
				
	}

	public boolean isOver() {
		return baralho.isEmpty();
	}

	public void showStatus() {
		view.mostraJogador(jogador1);
		view.mostraCarta(game1.getMesa());
		view.mostraJogador(jogador2);
		view.mostraCarta(game2.getMesa());
		view.mostraJogador(jogador3);
		view.mostraCarta(game3.getMesa());
		view.mostraJogador(jogador4);
		view.mostraCarta(game4.getMesa());
	}

	
	
	public Jogador getJogador1()
	{
		return jogador1;
	}

	
	public Jogador getJogador2()
	{
		
		return jogador2;
	}
	public Jogador getJogador3()
	{
		
		return jogador3;
	}
	public Jogador getJogador4()
	{
		
		return jogador4;
	}
	
	
}





