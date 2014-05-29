package com.senac.examples.login;

public class AccountLoginLimitReachedException extends Exception {
	public AccountLoginLimitReachedException() {
		super("Maximum number of logins reached.");
	}
}
