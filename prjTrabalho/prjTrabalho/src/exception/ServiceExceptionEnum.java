package exception;

public enum ServiceExceptionEnum {

	ESPECIALIDADE_CODIGO_INVALIDO("c�digo de especialidade inv�lido."), 
	ESPECIALIDADE_NOME_INVALIDO("Nome de especialidade inv�lido"),
	ALUNO_CODIGO_INVALIDO("c�digo de aluno inv�lido."), 
	ALUNO_NOME_INVALIDO("Nome de aluno inv�lido");

	
	private ServiceExceptionEnum() {
		// TODO Auto-generated constructor stub
	}

	private ServiceExceptionEnum(String valor) {
		// TODO Auto-generated constructor stub
	}

}
