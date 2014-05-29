package com.senac.views;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.*;

public class ConsoleView {

	private static Scanner teclado = new Scanner(System.in);

	public void showMessage(String msg)
	{
		out.println(msg);
	}

	public String readLine()
	{
		return teclado.nextLine();
	}

	public String readString(String prompt)
	{
		showPrompt(prompt);
		return readString();
	}
	public String readString()
	{
		return teclado.next();
	}

	public int readInteger(String prompt)
	{
		showPrompt(prompt);
		return readInteger();
	}

	public int readInteger()
	{
		return teclado.nextInt();
	}

	public void showPrompt(String prompt)
	{
		out.print(prompt + ": ");
	}
	
}
