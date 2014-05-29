package com.senac.examples.login.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.senac.examples.login.Account;
import com.senac.examples.login.AccountDB;
import com.senac.examples.login.AccountLockedException;
import com.senac.examples.login.AccountLoginLimitReachedException;
import com.senac.examples.login.AccountNotFoundException;
import com.senac.examples.login.LoginService;

import static org.mockito.Mockito.*;

@RunWith(JUnit4.class)
public class LoginServiceTest {

	private LoginService service;
	private Account account;
	private AccountDB accountDB;
	
	@Before
	public void setUp() {
		account = mock(Account.class);

		accountDB = mock(AccountDB.class);
		when(accountDB.find(anyString())).thenReturn(account);
		
		service = new LoginService(accountDB);
	}
	
	private void willPasswordMatch(boolean value) {
		when(account.passwordMatches(anyString())).thenReturn(value);
	}
	
	@Test
	public void testObjetoContaEstaLogadoQuandoSenhaForCorreta()
			throws AccountLoginLimitReachedException,
				AccountNotFoundException,
				AccountLockedException
	{
		// Preparação do ambiente
		willPasswordMatch(true);
		// Execução do Método
		service.login("Steve", "CorrectPassword");
		// Verificação da execução (Asserts/verify/...)
		verify(account, times(1)).setLoggedIn(true);
	}

	@Test
	public void testContaDeveSerSuspensaQuandoFalhaTresLogins()
			throws AccountLoginLimitReachedException,
				AccountNotFoundException,
				AccountLockedException
	{
		willPasswordMatch(false);
		// Execução do teste
		for (int i = 0; i < 3; ++i)
			service.login("Steve", "WrongPassword");
		// Validação do teste
		verify(account, times(1)).setLocked(true);
	}

	@Test
	public void testObjetoContaNaoEstaLogadQuandoSenhaForErrada()
			throws AccountLoginLimitReachedException,
				AccountNotFoundException,
				AccountLockedException
	{
		// Prepara ambiente
		willPasswordMatch(false);
		// Executa teste
		service.login("Steve","WrongPassword");
		// Verifica resultado
		verify(account, never()).setLoggedIn(true);
	}
	
	@Test
	public void testFalhaDeLoginsSucessoNoTerceiroLogin()
			throws AccountLoginLimitReachedException,
				AccountNotFoundException,
				AccountLockedException
	{
		// Prepara ambiente
		willPasswordMatch(false);
		when(account.passwordMatches("CorrectPassword")).thenReturn(true);
		// Executa teste
		service.login("Steve","WrongPassword");
		service.login("Steve","WrongPassword");
		service.login("Steve","CorrectPassword");
		// Verifica resultado
		verify(account, never()).setLocked(true);
	}
	
	@Test
	public void testNaoDeveBloquearSegundaContaQuandoUmaContaFalhaDuasVezesAntes()
			throws AccountLoginLimitReachedException,
				AccountNotFoundException,
				AccountLockedException
	{
		willPasswordMatch(false);
		Account second = mock(Account.class);
		when(second.passwordMatches(anyString())).thenReturn(false);
		
		when(accountDB.find("Annie")).thenReturn(second);
		// Execução Teste
		service.login("Steve", "WrongPassword");
		service.login("Steve", "WrongPassword");
		service.login("Annie", "WrongPassword");
		// Verifica execução
		verify(second, never()).setLocked(true);
	}

	@Test(expected = AccountLoginLimitReachedException.class)
	public void testNaoPodeLogarQuandoJaEstaLogado()
			throws AccountLoginLimitReachedException,
			AccountNotFoundException,
			AccountLockedException
	{
		willPasswordMatch(true);
		when(account.isLoggedIn()).thenReturn(true);
		service.login("Steve", "CorrectPassword");
	}
	
	@Test(expected = AccountNotFoundException.class)
	public void testFalhaDeLoginQuandoContaNaoExiste()
			throws AccountLoginLimitReachedException,
			AccountNotFoundException,
			AccountLockedException
	{
		when(accountDB.find("Zeus")).thenReturn(null);
		service.login("Zeus", "QualquerSenha");
	}
	
	@Test(expected = AccountLockedException.class)
	public void testUmaContaBloqueadaNaoPodeSeLogar()
				throws AccountLoginLimitReachedException,
					   AccountNotFoundException,
					   AccountLockedException
	{
		willPasswordMatch(true);
		when(account.isLocked()).thenReturn(true);
		service.login("Steve", "CorrectPassword");
	}
	
}
















