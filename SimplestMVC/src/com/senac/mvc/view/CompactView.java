package com.senac.mvc.view;

import static java.lang.System.*;

public class CompactView extends ContatoView {

	@Override
	public void printContato(String nome, String telefone, String endereco) {
		out.println(String.format("Contato: %s - %s - %s", nome, telefone, endereco));
	}

}
