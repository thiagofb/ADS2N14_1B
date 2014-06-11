import java.util.*;

import java.io.*;
public class Test {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		String n;
		
		System.out.println("Digite um numero:");
				
		FileWriter arq = new FileWriter("d:\\test.txt");
		PrintWriter gravarArq = new PrintWriter(arq);
		
		for(int i=0;i<=5;i++){
			
		gravarArq.println(n = t.nextInt()+"\n");
		
		System.out.println("arquivo gravado");
		
	}//fim do for
		arq.close();
	
	}

}
