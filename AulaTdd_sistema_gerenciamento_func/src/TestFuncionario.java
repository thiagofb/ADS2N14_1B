import static org.junit.Assert.*;

import org.junit.Test;


public class TestFuncionario {
	
	
	
	@Test
	public void testMatriculaPossuiNumeroInteiroPositivo(){
		Funcionario f1 = new Funcionario();
			
		assertTrue(f1.getMatricula() > 0);
		
	}
	@Test 
	public void testCargoPrecisaSerUmCargoValido(){
		Funcionario f1 = new Funcionario();
		
		f1.ClassificaCargo();
		
		assertTrue(f1.getCargo() == f1.ClassificaCargo());
		
	}
	
	
}
