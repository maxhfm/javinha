package entity;

public class Livro {
	private int codigo;
	private String nome;
	private Editora editora;
	private String autor;
	private String edicao;
	private String volume;
	
	public Livro() {

	}
	
	public Livro(int codigo, String nome, Editora editora, String autor,
			String edicao, String volume) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.editora = editora;
		this.autor = autor;
		this.edicao = edicao;
		this.volume = volume;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
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

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

}
