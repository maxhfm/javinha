package exception;

public enum ServiceExceptionEnum {

	EDITORA_CODIGO_INVALIDO("c�digo de editora inv�lido."), 
	EDITORA_NOME_INVALIDO("Nome de editora inv�lido"),
	EDITORA_CNPJ_INVALIDO("Cnpj da editora inv�lido"),
	LIVRO_CODIGO_INVALIDO("c�digo de editora inv�lido."), 
	LIVRO_NOME_INVALIDO("Nome de editora inv�lido");
	

	
	private ServiceExceptionEnum() {
		// TODO Auto-generated constructor stub
	}

	private ServiceExceptionEnum(String valor) {
		// TODO Auto-generated constructor stub
	}

}
