package model;

import java.util.Scanner;

public class Aula02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1;
		int num2;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		num1 = read.nextInt();
		System.out.println("Digite o segundo numero: ");
		num2 = read.nextInt();
		System.out.println("Digite 1 para somar; 2 para subtrair");
		int op = read.nextInt();
		
		//adicionado comentario
		switch (op) {
		case 1:
			int total = num1 + num2;
			System.out.println(total);
			break;
		case 2:
			int total1 = num1 - num2;
			System.out.println(total1);
			break;
		default:
			break;
		}
		
		
		
		
		
	}

}
