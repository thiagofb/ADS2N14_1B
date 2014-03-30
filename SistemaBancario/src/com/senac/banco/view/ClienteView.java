package com.senac.banco.view;
import java.util.*;
import com.senac.banco.model.*;

public class ClienteView {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		
		int op=0;

		System.out.println("BEM VINDO AO SISTEMA BANCARIO XXX");
		
		System.out.println("Digite a opção desejada: \n1- Criar conta \n2- Realizar Saque \n3- Realizar investimentos");


		op = t.nextInt();
         switch (op) {
		case 1:
               System.out.println("Digite seu nome:");
               setNome(t.nextLine());
			break;
			
		case 2:
			
			break;
		
		case 3:
			
			break;

		default:
			System.out.println("Operação invalida!");
			break;
		}
	}

		
		
		

}


