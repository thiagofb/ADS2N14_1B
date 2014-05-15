
public class Jogo {

	
	private int status=0;
	private int tanque=0;
	private int[] tabuleiro = new int[10];
	private int posicao;
	
	
	// getters
	public int getPosicao() 
	{
		return posicao;
	}
	public int getTanque() 
	{
		return tanque;
	}

	public int getTabuleiro(int local) {
	
	return tabuleiro[local];
	}

	
	//metodos
	
	public void iniciaPartida() 
	{
		tanque =6;
		posicao=0;
	}
	
		
	public void avancar() throws SemCombustivelException
	{
		if(tanque > 0){
			tanque--;
			posicao++;}
		 else
			  throw new SemCombustivelException();
	}
	
	public void voltar() throws SemCombustivelException
	{
		if(tanque >0){
			tanque--;
			posicao--;}
		else
			throw new SemCombustivelException();
		
	}
	
	public void carregar() throws tanqueCheioException  
	{	
		if(tanque == 6)	{
			throw new tanqueCheioException();
		}			
		else
			if(tabuleiro[posicao]> 0  || posicao ==0)// caso na posiçao do tabu exista combustivel ele pode pegar ou no tabu 0 que tem infinito
				tanque++;
		     tabuleiro[posicao]--;// caso na posiçao exista combustivel ele pega 1
		
			
	}


	public void descarregar() throws SemCombustivelException {
		if(tanque > 0){
			tanque--;
		 	tabuleiro[posicao]++;
		}
		else
			throw new SemCombustivelException();
	}
	
	


	


	


	

	

}
