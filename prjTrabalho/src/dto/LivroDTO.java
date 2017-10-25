package dto;

public class LivroDTO {
	private int codigo;
	private String nome;
	private int codigoEditora;
	private String autor;
	private String edicao;
	private String volume;
	
	public LivroDTO() {

	}
	
	public LivroDTO(int codigo, String nome, int codigoEditora, String autor,
			String edicao, String volume) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.codigoEditora = codigoEditora;
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

	public int getCodigoEditora() {
		return codigoEditora;
	}

	public void setCodigoEditora(int codigoEditora) {
		this.codigoEditora = codigoEditora;
	}

}
