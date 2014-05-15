import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class TesteJogo {


	Scanner t = new Scanner(System.in);
	 Jogo j1 = new Jogo();
	 
	 
	 @Test
	 public void iniciandoJogo(){
		 j1.iniciaPartida();
		 assertEquals(j1.getPosicao(),0);
		 assertEquals(j1.getTanque(), 6);
	 }
	 
    @Test
	public void DeviariaTerAbastecido() throws tanqueCheioException { 
	{
		
		System.out.println("digite quantidade de combustivel abastecido:");
		int combustivel = t.nextInt();
	
		
		j1.carregar(combustivel);
		
		
		assertEquals(6, j1.getTanque()); 
	}
	}
    
    @Test
    public void avancarUmaCasa() throws SemCombustivelException{
    	
    	j1.iniciaPartida();
    	
    	int andar = j1.getPosicao();
    	int comb = j1.getTanque();
    	
    	j1.avancar();
    	// andar recebe posiçao 0 do getPosicao entao anda 1 casa ( ja tanque e inverso)
    	assertEquals(andar+1,j1.getPosicao());
    	assertEquals(comb-1,j1.getTanque());
    	
    }
     
    @Test
    public void voltarUmaCasa() throws SemCombustivelException
    {
    	j1.iniciaPartida();
    	j1.avancar(); //para ir para casa 1 e voltar para a 0
    	int andar = j1.getPosicao();
    	int comb = j1.getTanque();
    	
    	j1.voltar();
    	
    	assertEquals(andar-1, j1.getPosicao());
    	assertEquals(comb-1,j1.getTanque());
    	
    	
    }
    
    
    
	
    
	
}
