package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Aula10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Aluno aluno = new Aluno();
		Aluno nota = new Aluno();
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Digite o nome :");
			aluno.setNome(scan.next());
			
			System.out.println("Digite o nota :");
			nota.setNota(scan.nextInt());
		}
		System.out.println(aluno.getNome() + nota.getNota());
		
		
		int soma = 0;
		for(int j = 0; j < aluno.getNota(); j++) {
			soma = soma + aluno.getNota();
		}
			System.out.println("Soma: " + soma);
		
			/*
		int notamaior = 0;
		for(int i = 0; i < listanota.size(); i++){
				if((int)listanota.get(i) > notamaior)
				notamaior = (int) listanota.get(i);
		}		
				System.out.println("Nota maior: " + notamaior);
*/		
		
	}

}
