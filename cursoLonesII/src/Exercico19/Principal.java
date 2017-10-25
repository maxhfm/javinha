package Exercico19;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Nadador nadador = new Nadador();
		
		
		boolean condition = true;
		
		do {
			System.out.println("Digite a idade do nadador: ");
			nadador.Idade = scan.nextInt(); 
			System.out.println("Categoria do atleta: " + nadador.categoria(nadador.Idade));
			
			System.out.println("Fica ou nao: (s)");
			
		} while (condition);
		
		 


	}

}
