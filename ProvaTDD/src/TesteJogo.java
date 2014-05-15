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
		 assertEquals(j1.getTanque(),6);
	 }
	 
    @Test
	public void DeviariaTerAbastecido() throws Exception { 
	{
		
		System.out.println("digite quantidade de combustivel abastecido:");
		int combustivel = t.nextInt();
	
		
		j1.carregar(combustivel);
		
		
		assertEquals(6, j1.getTanque()); 
	}
	}
	
    
	
}
