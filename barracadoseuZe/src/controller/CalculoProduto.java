package controller;

import java.util.ArrayList;

import barracadoseuZe.model.Constantes;
import barracadoseuZe.model.Produto;

public class CalculoProduto {

	float totalValorporProduto = 0;
	float totalGeralVenda = 0;
	ArrayList<Float> listaValorGeral = new ArrayList<>();

	public float calculaVendaporProduto(float valor, int quantidade) {
		totalValorporProduto = valor * quantidade;
		listaValorGeral.add(totalValorporProduto);
		return totalValorporProduto;
	}
    
	public float totalGeralVenda() {
		for (Float listaValores : listaValorGeral)
			totalGeralVenda = totalGeralVenda + listaValores;
		return totalGeralVenda;
	}
	
	public float totalImpostos(){
		float impostos = (float)(totalGeralVenda * Constantes.IMPOSTO);
		return impostos; 
	}
	
	public float totalComissaoVendedor(){
		float comissao = (float)(totalGeralVenda * Constantes.COMISSAO);
		return comissao;
	}

}
