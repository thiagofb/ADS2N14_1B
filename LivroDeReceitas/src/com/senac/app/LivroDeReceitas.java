package com.senac.app;

import com.senac.app.model.Ingrediente;
import com.senac.app.model.Passo;
import com.senac.app.model.UnidadeMedida;
import com.senac.app.view.ConsoleView;

public class LivroDeReceitas {

	private ConsoleView view = new ConsoleView();
	
	public static void main(String[] args) {
		(new LivroDeReceitas()).run();
	}
	
	public void imprime(Ingrediente ingrediente) {
		view.showMessage(
				String.format("%.0f%s %s",
						ingrediente.getQuantidade(),
						ingrediente.getMedida().getUnidade(),
						ingrediente.getNome())
			);
	}
	
	public void imprime(Passo passo) {
		String listaIngredientes = "";
		for (int i = 0; i < passo.countIngredientes() - 1; i++)
			listaIngredientes += passo.getIngrediente(i).getNome() + ", ";
		listaIngredientes += passo.getIngrediente(passo.countIngredientes() - 1).getNome();
		view.showMessage(
					String.format(
						"%s %s",
						passo.getDescricao(),
						listaIngredientes
					)
				);
	}

	private void run() {
		UnidadeMedida gramas = new UnidadeMedida();
		gramas.setGrandeza("massa");
		gramas.setNome("gramas");
		gramas.setUnidade("g");

		UnidadeMedida litro = new UnidadeMedida();
		gramas.setGrandeza("volume");
		gramas.setNome("litro");
		gramas.setUnidade("l");
		
		Ingrediente farinha = new Ingrediente();
		farinha.setNome("Farinha de Trigo");
		farinha.setQuantidade(500);
		farinha.setMedida(gramas);
		
		Ingrediente leite = new Ingrediente();
		leite.setNome("Leite");
		leite.setQuantidade(1);
		leite.setMedida(litro);

		Passo misturar = new Passo();
		misturar.addIngrediente(farinha);
		misturar.addIngrediente(leite);
		misturar.setDescricao("Misturar os ingredientes:q");
		
		imprime(misturar);
	}

}









