package dto;

public class EspecialidadeDTO {
	private int codigo;
	private String nome;

	public EspecialidadeDTO() {

	}

	public EspecialidadeDTO(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
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

}
