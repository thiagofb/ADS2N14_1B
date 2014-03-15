
public class Pessoa {
	
	int idade;
	double peso,altura;
	String nome;
	
	public Pessoa(){
		
	}
	
	public Pessoa(String nome, int idade, double altura, double peso)
	{
		this.idade=idade;
		this.peso=peso;
		this.altura=altura;
		this.nome=nome;
	}

	
	public void setIdade(int idade)
	{
		this.idade=idade;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	
	public String toString() {
		return "Pessoa [idade=" + idade + ", peso=" + peso + ", altura="
				+ altura + ", nome=" + nome + "]";
	}
	
	
}
