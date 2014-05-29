package com.senac.jogos.apps.Matching;


public class MatchingApp {

	private JogoController controller = new JogoController();
	
	public static void main(String[] args)
	{
		(new MatchingApp()).run();
	}
	
	public void run() {
		controller.initGame();	
		while (!controller.isGameOver()) {
			controller.playTurno();
		}
	}
}
