
public class Jogo {

	
	private int status=0;
	private int tanque=0;
	
	

	
	public void carregar(int combustivel) {
	
		if(combustivel <= 6)
		tanque += combustivel;
		else
			System.out.println("exception");
	}
	

	public int getTanque() {
		return tanque;
	}


	

	

}
