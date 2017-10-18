package barracadoseuZe.model;

import java.util.ArrayList;
import java.util.HashMap;

public class Cliente {
	
	private String nome;
	private String cpf;
	private ArrayList<String> telefones = new ArrayList<>();
	private HashMap<String, String> enderecos = new HashMap<>();
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public ArrayList<String> getTelefones() {
		return telefones;
	}
	public void setTelefones(ArrayList<String> telefones) {
		this.telefones = telefones;
	}
	public HashMap<String, String> getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(HashMap<String, String> enderecos) {
		this.enderecos = enderecos;
	}
	public void addTelefones(String telefone){
		this.telefones.add(telefone);
	}
	public void addEnderecos(String tipo, String endereco){
		this.enderecos.put(tipo, endereco);
	}
	
	
	

}
