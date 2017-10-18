package barracadoseuZe.model;

import java.util.ArrayList;

public class Produto {
	
	private int codigo;
	private String nome;
	private String descricao;
	private float valor;
	ArrayList<String> listaProduto = new ArrayList<>();
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public ArrayList<String> getListaProduto() {
		return listaProduto;
	}
	public void setListaProduto(String string) {
		this.listaProduto.add(string);
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	
	

	
	
	
	


	
	
}
