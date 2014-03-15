import java.util.*;
public class TestePessoa {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		
		Pessoa p1;
		p1 = new Pessoa();
		System.out.println("digte seu nome, idade, altura e peso: ");
		p1.setNome(t.next());
		p1.setIdade(t.nextInt());
		p1.setAltura(t.nextDouble());
		p1.setPeso(t.nextDouble());
		
		
		Pessoa p2 = new Pessoa("Joao", 18, 1.70,75 );

		
		System.out.println(p1.toString()); 
		System.out.println("\n");
		System.out.println(p2.toString()); 
	}

}
