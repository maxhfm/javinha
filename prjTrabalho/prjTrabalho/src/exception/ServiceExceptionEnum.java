package exception;

public enum ServiceExceptionEnum {

	ESPECIALIDADE_CODIGO_INVALIDO("código de especialidade inválido."), 
	ESPECIALIDADE_NOME_INVALIDO("Nome de especialidade inválido"),
	ALUNO_CODIGO_INVALIDO("código de aluno inválido."), 
	ALUNO_NOME_INVALIDO("Nome de aluno inválido");

	
	private ServiceExceptionEnum() {
		// TODO Auto-generated constructor stub
	}

	private ServiceExceptionEnum(String valor) {
		// TODO Auto-generated constructor stub
	}

}
