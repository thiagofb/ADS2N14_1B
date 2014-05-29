package com.senac.SistemaBancario.model;

public class SaldoInsuficienteException extends Exception {
	// Gerado pelo Java para serializacao.
	private static final long serialVersionUID = 5647854973590513072L;

	public SaldoInsuficienteException() {
		super("Nao ha saldo suficiente para sacar.");
	}
}
