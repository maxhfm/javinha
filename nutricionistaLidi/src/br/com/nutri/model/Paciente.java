package br.com.nutri.model;

public class Paciente {
	private String nome;
	private String telefone;
	private String email;
	private String dtNascimento;
	private String objetivo;
	private String sexo;
	private int atividadeFisica;
	private float peso;
	AvaliacaoAntropometrica avaliacaoAntro;
	
	
	
	public AvaliacaoAntropometrica getAvaliacaoAntro() {
		return avaliacaoAntro;
	}
	public void setAvaliacaoAntro(AvaliacaoAntropometrica avaliacaoAntro) {
		this.avaliacaoAntro = avaliacaoAntro;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public String getObjetivo() {
		return objetivo;
	}
	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getAtividadeFisica() {
		return atividadeFisica;
	}
	public void setAtividadeFisica(int atividadeFisica) {
		this.atividadeFisica = atividadeFisica;
	}

	
}
