package com.senac.jogos.apps.Matching;

import com.senac.jogos.cartas.Carta;
import com.senac.views.ConsoleView;

public class JogoController {

	private MatchingCardGame jogo;
	private Carta cartaJogador;
	private ConsoleView view;
	private int jogador;
	
	public JogoController()
	{
		jogo = new MatchingCardGame();
		view = new ConsoleView();
		cartaJogador = null;
		jogador = -1;
	}
	
	public String getCommand(String msg)
	{
		view.showPrompt(msg);		
		return view.readString().toLowerCase();
	}
	
	public void pulaJogada()
	{
		jogo.getJogador(jogador).setPlayed(false);
	}
	
	public void fazJogada() {
		Jogador player = jogo.getJogador(jogador);
		
		cartaJogador = jogo.drawCarta();
		showCarta("Jogador", cartaJogador);

		int pontos = jogo.matchCarta(cartaJogador);
		player.addPontos(pontos);
		
		// descartar carta
		jogo.setMesa(cartaJogador);
		cartaJogador = null;
		
		player.setPlayed(true);
	}
	
	public void playTurno()
	{
		showCarta("Mesa", jogo.getMesa());
		showPontosJogador();

		String comando = "jogar";
		
		if (jogo.getJogador(jogador).hasPlayed())
			comando = getCommand("Digite 'jogar' para jogar, 'pular' para passar a vez");
		else
			view.showMessage(
					String.format("Jogador %dpassou œltima jogada. Obrigado jogar nesta rodada.",
							jogador));
		
		if (comando.equals("jogar")) {
			fazJogada();
		} else {
			pulaJogada();
		}
		
		showPontosJogador();
		proximoJogador();
	}

	public void proximoJogador() {
		jogador++;
		jogador %= jogo.getQuantidadeJogadores();
	}
	
	public void showPontosJogador()
	{
		view.showMessage(
				String.format("Pontos Jogador %d: %d",
						      jogador + 1,
						      jogo.getJogador(jogador).getPontos()
						     )
			);
	}
	
	private void showCarta(String fonte, Carta carta)
	{
		view.showPrompt(fonte);
		view.showMessage(
			String.format("%d%c",
					      carta.getValor(),
					      carta.getNaipe()
				         )
		);
	}

	public boolean isGameOver() {
		return this.jogo.isGameOver();
	}

	public void initGame() {
		int players = 0;
		do {
			view.showMessage("M‡ximo de Jogadores: 4");
			players = view.readInteger("Quantos Jogadores?");
		} while (players <=0 || players > 4);
		
		jogo.startGame(players);
	}

}
