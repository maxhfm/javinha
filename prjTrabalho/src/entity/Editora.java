package entity;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import exception.DaoException;

public class Editora {
	private int codigo;
	private String nome;
	private String cnpj;
	private Map<Integer, Livro> livros;
	
	public Editora() {
		
	}

	public Editora(int codigo, String nome, String cnpj, String endereco) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.livros = new HashMap<Integer, Livro>();
	}

	private String endereco;
	

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

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
	
	public void setLivros(Map<Integer, Livro> livros) {
		this.livros = livros;
	}

	public Map getLivros() {
		return livros;
	}		

	public void addLivro(Livro c) throws DaoException {
		livros.put(c.getCodigo(), c);
	}	

	public void removeLivro(int codLivro) throws DaoException {

		if (livros.get(codLivro) == null) {
			throw new DaoException("");
		}
		livros.remove(codLivro);
	}	
	
	public Livro getLivro(int codLivro) throws DaoException {
		if (livros.get(codLivro) == null) {
			throw new DaoException("");
		}
		Livro livro = livros.get(codLivro);
		return livro;

	}

	
}
