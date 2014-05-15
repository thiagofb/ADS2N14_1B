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
    public void avancarUmaCasa() throws SemCombustivelException{
    	
    	j1.iniciaPartida();
    	
    	int local = j1.getPosicao();
    	int comb = j1.getTanque();
    	
    	j1.avancar();
    	// andar recebe posiçao 0 do getPosicao entao anda 1 casa ( ja tanque e inverso)
    	assertEquals(local+1,j1.getPosicao());
    	assertEquals(comb-1,j1.getTanque());
    	
    }
     
    @Test
    public void voltarUmaCasa() throws SemCombustivelException
    {
    	j1.iniciaPartida();
    	j1.avancar(); //para ir para casa 1 e voltar para a 0
    	int local = j1.getPosicao();
    	int comb = j1.getTanque();
    	
    	j1.voltar();
    	
    	assertEquals(local-1, j1.getPosicao());
    	assertEquals(comb-1,j1.getTanque());
    	
    	
    }
    
    @Test
   	public void Abastecer() throws tanqueCheioException, SemCombustivelException { 
   	{
   		j1.iniciaPartida();
   		j1.avancar();
   		j1.voltar();
   		int comb = j1.getTanque();
   				
   		j1.carregar();
   		
   		
   		assertEquals(comb+1, j1.getTanque()); 
   	}
   	}
    
   @Test
   public void DescarregaCombustivel(){
	   j1.iniciaPartida();
	   j1.avancar();
	   
	   int local = j1.getPosicao();
	   int comb = j1.getTanque();
	   
	   j1.descarregar();
	   
	   assertEquals(1,j1.getTabuleiro(local));
	   assertEquals(comb-1, j1.getTanque());
	   
	   
		   
	   }
	   
	   
	   
   }
 
    
    
    
	
    
	
}
