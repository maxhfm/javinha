package model;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o produto: ");
		String nomeProduto = ler.nextLine();
		
		System.out.println("Digite o valor de compra: ");
		float valorCompra = Float.parseFloat(ler.nextLine());
		
		System.out.println("Digite o valor de venda: ");
		float valorVenda = Float.parseFloat(ler.nextLine());
		
		System.out.println("Digite a quantidade em estoque: ");
		int qtdEstoque = ler.nextInt();
		
		
		System.out.println("Custo total da sua compra " + custoTotal(valorCompra, qtdEstoque));
		System.out.println("Arrecadacao total: " + arrecadacaoTotal(valorVenda, qtdEstoque));
		System.out.println("Total do lucro " + totalLucro(custoTotal(valorCompra, qtdEstoque), arrecadacaoTotal(valorVenda, qtdEstoque)));
		
		
	}
	
	
	public static float custoTotal(float valorCompra, int qtdEstoque){
		float resultado = valorCompra * qtdEstoque; 
		return resultado;
	}
	
	public static float arrecadacaoTotal(float valorVenda, int qtdEstoque){
		float resultado = valorVenda * qtdEstoque; 
		return resultado;
	}
	
	public static float totalLucro(float custoTotal, float arrecadacaoTotal){
		float resultado = arrecadacaoTotal - custoTotal; 
		return resultado;
	}
	

}
