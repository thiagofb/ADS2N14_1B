package com.senac.examples.login;


public class LoginService {
	
	private AccountDB accountDB;
	private int failedAttempts;
	private Account previousAccount;
	
	public LoginService(AccountDB accountDB) {
		this.accountDB = accountDB;
	}

	public void login(String username, String password)
					throws AccountLoginLimitReachedException,
					       AccountNotFoundException,
					       AccountLockedException
	{
		Account account = accountDB.find(username);
		if (account == null)
			throw new AccountNotFoundException();
		if (account.isLoggedIn())
			throw new AccountLoginLimitReachedException();
		if (account.isLocked())
			throw new AccountLockedException();
		if (account.passwordMatches(password))
			account.setLoggedIn(true);
		else {
			if (account.equals(previousAccount)) {
				failedAttempts++;
			} else {
				failedAttempts = 1;
				previousAccount = account;
			}
		}
		if (failedAttempts == 3)
			account.setLocked(true);
	}

}









