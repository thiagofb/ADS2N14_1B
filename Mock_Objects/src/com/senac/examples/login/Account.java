package com.senac.examples.login;

public interface Account {
	public boolean passwordMatches(String candidate);
	public void setLocked(boolean state);
	public boolean isLocked();
	public void setLoggedIn(boolean state);
	public boolean isLoggedIn();
}
