package model;

import java.util.Scanner;

import javax.swing.text.html.HTMLEditorKit.Parser;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("DIgite o numero 1 = ");
		float numero1 = scan.nextFloat();
		System.out.println("DIgite o numero 2 = ");
		float numero2 = scan.nextFloat();
		
		
		System.out.println(soma(numero1, numero2));
		System.out.println(subtracao(numero1, numero2));
		System.out.println(multiplicacao(numero1, numero2));
		System.out.println(divisao(numero1, numero2));
		System.out.println("Antecessor do primeiro numero:  " + antecessor(numero1) + " e do segundo numero: " + antecessor(numero2));
		System.out.println("Sucessor do primeiro numero: " + sucessor(numero1) + " e do segundo numero: " + sucessor(numero2));
		System.out.println("É a soma dos numeros é par? " + ehPar(soma(numero1, numero2)));
		
	}
	
	
	public static float soma(float num1, float num2){
		float resultado = num1 + num2;
		return resultado;
	}
	
	public static float subtracao(float num1, float num2){
		float resultado = num1 - num2;
		return resultado;
	}
	
	public static float multiplicacao(float num1, float num2){
		float resultado = num1 * num2;
		return resultado;
	}
	
	public static float divisao(float num1, float num2){
		float resultado = num1 / num2;
		return resultado;
	}
	
	private static float antecessor(float num) {
		float antecessor = num -1;
		return antecessor;
	}
	
	private static float sucessor(float num) {
		float sucessor = num +1;
		return sucessor;
	}
	
	private static boolean ehPar(float num){
		return num %2 == 0;
	}
	

}
