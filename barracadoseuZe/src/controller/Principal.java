package controller;

import java.text.DecimalFormat;
import java.util.Scanner;

import barracadoseuZe.model.Cliente;
import barracadoseuZe.model.LimpaTela;
import barracadoseuZe.model.Produto;
import barracadoseuZe.model.Vendedor;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Cliente cliente = new Cliente();
		Vendedor vendedor = null;
		int quantidade = 0;
		CalculoProduto calculo = new CalculoProduto();
		DecimalFormat df = new DecimalFormat("0.00");
		LimpaTela limpaTela = new LimpaTela();
		
		//qual é a diferenca de instanciar produto e criar atributo produto
		Produto produto = new Produto();
		
				
		// Inicializacao do Sistema
		
		System.out.println("Digite o cliente: ");
		cliente.setNome(scan.nextLine());
		System.out.println("Digite o CPF do cliente: ");
		cliente.setCpf(scan.nextLine());
				
		// Entrando com o produto
		
		 
		String resposta;
		do {
			limpaTela.limpatela();
			System.out.println("Hora das compras");
			System.out.println("Digite o nome do produto");
			produto.setNome(scan.nextLine());
			produto.setListaProduto(produto.getNome());
		
			System.out.println("Digite o valor do produto: ");
			produto.setValor(Float.parseFloat(scan.nextLine()));
			System.out.println("Digite a quantidade: ");
			quantidade = Integer.parseInt(scan.nextLine());
			calculo.calculaVendaporProduto(produto.getValor(), quantidade);
			
			System.out.println("Fim da venda (s/n): ");
			resposta = scan.nextLine();
			
						
		}while(resposta.equals("n"));
		
		System.out.println("-------------------------------------");
		System.out.println("Cliente: " + cliente.getNome());
		System.out.println("CPF do Cliente: " + cliente.getCpf());
		System.out.println(" ");
		System.out.println("----------CUPOM FISCAL---------------");
		System.out.println("Lista de todos os produtos: ");
		for (String listaProdutos : produto.getListaProduto()) {
			System.out.println(listaProdutos);
		}
		
		System.out.println("Valor total da Venda: " + df.format(calculo.totalGeralVenda()));
		System.out.println("Valor total impostos: " + df.format(calculo.totalImpostos()));
		System.out.println("Valor total comissao: " + df.format(calculo.totalComissaoVendedor()));
		System.out.println("-------------------------------------");
		

	}

}
