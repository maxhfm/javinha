package model;

import java.util.Scanner;

public class Aula01 {
	public static void main(String[] args) {
				
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = read.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idade = read.nextInt();
		
		System.out.println("Digite seu salario: ");
		float salario = read.nextFloat();
		
		System.out.println("Seu nome é:" + nome + 
				"Seu salario é: " + salario + 
				"Sua idade é: " + idade);
		
		
		
	}

}
