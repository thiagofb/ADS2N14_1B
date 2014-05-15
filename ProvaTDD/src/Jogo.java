
public class Jogo {

	
	private int status=0;
	private int tanque=0;
	private int[] tabuleiro = new int[10];
	private int posicao;
	
	

	
	public void carregar(int combustivel) throws tanqueCheioException  {
	
		if(combustivel <= 6)
		tanque += combustivel;
		else
			throw new tanqueCheioException();
	}
	

	public int getTanque() {
		return tanque;
	}


	public void iniciaPartida() {
		tanque =6;
		posicao=0;
		
	}

	public int getPosicao() {
		
		return posicao;
	}


	


	

	

}
