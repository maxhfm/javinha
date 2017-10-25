package exception;

public enum ServiceExceptionEnum {

	EDITORA_CODIGO_INVALIDO("código de editora inválido."), 
	EDITORA_NOME_INVALIDO("Nome de editora inválido"),
	EDITORA_CNPJ_INVALIDO("Cnpj da editora inválido"),
	LIVRO_CODIGO_INVALIDO("código de editora inválido."), 
	LIVRO_NOME_INVALIDO("Nome de editora inválido");
	

	
	private ServiceExceptionEnum() {
		// TODO Auto-generated constructor stub
	}

	private ServiceExceptionEnum(String valor) {
		// TODO Auto-generated constructor stub
	}

}
