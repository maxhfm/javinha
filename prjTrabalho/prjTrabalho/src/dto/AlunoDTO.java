package dto;

public class AlunoDTO {
	private int codigo;
	private String nome;
	private String profissao;
	private int codigoEspecialidade;

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public AlunoDTO() {

	}

	public AlunoDTO(int codigo, String nome, String profissao, int codigoEspecialidade) {
		this.codigo = codigo;
		this.nome = nome;
		this.profissao = profissao;
		this.codigoEspecialidade = codigoEspecialidade;
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

	public int getCodigoEspecialidade() {
		return codigoEspecialidade;
	}

	public void setCodigoEspecialidade(int codigoEspecialidade) {
		this.codigoEspecialidade = codigoEspecialidade;
	}

}
