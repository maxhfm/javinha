package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Aula10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList listanome = new ArrayList();
		ArrayList listanota = new ArrayList();
		
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Digite o nome :");
			listanome.add(scan.next());
			
			System.out.println("Digite o nota :");
			listanota.add(scan.nextInt());
		}
		
		int soma = 0;
		for(int j = 0; j < listanota.size(); j++) {
			soma = soma + (int) listanota.get(j);
		}
			System.out.println("Soma: " + soma);
		

		int notamaior = 0;
		for(int i = 0; i < listanota.size(); i++){
				if((int)listanota.get(i) > notamaior)
				notamaior = (int) listanota.get(i);
		}		
				System.out.println("Nota maior: " + notamaior);
		
		
	}

}
