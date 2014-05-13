import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class TesteJogo {


	Scanner t = new Scanner(System.in);
	 
    @Test
	public void DeviariaTerAbastecido() throws Exception { 
	{
		System.out.println("digite quantidade de combustivel abastecido:");
		int combustivel = t.nextInt();
	
		Jogo j1 = new Jogo();
		j1.carregar(combustivel);
		
		
		assertEquals(6, j1.getTanque()); 
	}
	}
	
	
}
