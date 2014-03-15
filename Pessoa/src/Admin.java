import java.util.*;
public class Admin {

	
	public static void main(String[] args) {
	Scanner t = new Scanner(System.in);

	Pessoa p1;
	p1= new Pessoa();
	
	System.out.println("Digite seu nome, altura, idade, peso : ");
	p1.setNome(t.next());
	p1.setAltura(t.nextDouble());
	p1.setIdade(t.nextInt());
	p1.setPeso(t.nextDouble());
	
	Pessoa p2 = new Pessoa("joao",18,1.70,70);
	

	
	}

}
