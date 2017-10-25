package main;

import java.util.Map;
import java.util.Scanner;


import service.EditoraService;
import dto.EditoraDTO;
import service.LivroService;
import dto.LivroDTO;
import entity.Livro;
import exception.DaoException;
import exception.ServiceException;

public class Programa {
	private static Scanner teclado = new Scanner(System.in);
	private static EditoraService editoraService = new EditoraService();
	private static LivroService livroService = new LivroService();

	public static void main(String[] args) throws DaoException {
		int op = 0;
		boolean sair = false;
		boolean sair2 = false;
		
		do {
			
			//
			separador();
			System.out.println("Escolha a operação desejada:");
			separador();
			System.out.println("1 - Manter Editora");
			System.out.println("2 - Manter Livro");
			System.out.println("3 - Sair");
			//
			op = teclado.nextInt();
			//
			if(op == 1)
			{
				do {
					sair2 = false;
					separador();
					System.out.println("Editora");
					separador();
					System.out.println("1 - Cadastrar editora");
					System.out.println("2 - Buscar editora");
					System.out.println("3 - Alterar editora");
					System.out.println("4 - Remover editora");
					System.out.println("5 - Voltar");
					System.out.println("");
		
					op = teclado.nextInt();
		
					if (op == 1) {
						System.out.println("Informe o código da editora: ");
						int codigo = teclado.nextInt();
						System.out.println("Informe o nome da editora: ");
						String nome = teclado.next();
						System.out.println("Informe o CNPJ da editora: ");
						String cnpj = teclado.next();
						System.out.println("Informe o endereco da editora: ");
						String endereco = teclado.next();
						criarEditora(codigo, nome, cnpj, endereco);
					} else if (op == 2) {
						System.out.println("Informe o código da editora: ");
						int codigo = teclado.nextInt();
						separador();
						System.out.println(buscarEditora(codigo));
						separador();
						System.out.println("1 = Voltar");
						op = teclado.nextInt();						
					} else if (op == 3) {
						System.out.println("Informe o código da editora: ");
						int codigo = teclado.nextInt();
						System.out.println("Informe o nome do editora: ");
						String nome = teclado.next();
						System.out.println("Informe o CNPJ da editora: ");
						String cnpj = teclado.next();
						System.out.println("Informe o endereco do editora: ");
						String endereco = teclado.next();
						alterarEditora(codigo, nome, cnpj, endereco);
					} else if (op == 4) {
						System.out.println("Informe o código do editora: ");
						int codigo = teclado.nextInt();
						removerEditora(codigo);
					} else if (op == 5) {
						sair2 = true;
					} else {
						System.out.println("Digite um código válido");
					}				
				
				} while (!sair2);			
			}else if(op == 2){
				do {
					sair2 = false;
					separador();
					System.out.println("Livro");
					separador();
					System.out.println("1 - Cadastrar livro");
					System.out.println("2 - Buscar livro");
					System.out.println("3 - Alterar livro");
					System.out.println("4 - Remover livro");
					System.out.println("5 - Voltar");
					System.out.println("");
		
					op = teclado.nextInt();
		
					if (op == 1) {
						System.out.println("Informe o código do livro: ");
						int codigo = teclado.nextInt();
						System.out.println("Informe o nome do livro: ");
						String nome = teclado.next();
						System.out.println("Informe o código da editora: ");
						int codigoEditora = teclado.nextInt();	
						System.out.println("Informe o autor do livro: ");
						String autor = teclado.next();
						System.out.println("Informe a edicao do livro: ");
						String edicao = teclado.next();
						System.out.println("Informe o volume do livro: ");
						String volume = teclado.next();
						criarLivro(codigo, nome, codigoEditora, autor, edicao, volume);
					} else if (op == 2) {
						System.out.println("Informe o código do livro: ");
						int codigo = teclado.nextInt();
						separador();
						System.out.println(buscarLivro(codigo));
						separador();
						System.out.println("1 = Voltar");
						op = teclado.nextInt();						
					} else if (op == 3) {
						System.out.println("Informe o código do livro: ");
						int codigo = teclado.nextInt();
						System.out.println("Informe o nome do livro: ");
						String nome = teclado.next();
						System.out.println("Informe o código da editora: ");
						int codigoEditora = teclado.nextInt();	
						System.out.println("Informe o autor do livro: ");
						String autor = teclado.next();
						System.out.println("Informe a edicao do livro: ");
						String edicao = teclado.next();
						System.out.println("Informe o volume do livro: ");
						String volume = teclado.next();							
						alterarLivro(codigo, nome, codigoEditora, autor, edicao, volume);
					} else if (op == 4) {
						System.out.println("Informe o código do livro: ");
						int codigo = teclado.nextInt();
						removerLivro(codigo);
					} else if (op == 5) {
						sair2 = true;
					} else {
						System.out.println("Digite um código válido");
					}				
				
				} while (!sair2);				
			}else{
				sair = true;
				System.out.println("Aplicação encerrada!");
			}
		} while (!sair);
		
	}

	public static void criarEditora(int codigo, String nome, String cnpj, String endereco) {
		EditoraDTO editoraDTO = new EditoraDTO(codigo, nome, cnpj, endereco);
		try {
			editoraService.cadastrarEditora(editoraDTO);
			separador();
			System.out.println("Editora cadastrada com sucesso.");
			separador();
			
		} catch (ServiceException e) {
			System.out.println(e.getTipo());
		} catch (DaoException e) {
			System.out.println(e.getMessage());
		}
	}

	public static String buscarEditora(int codigo) {

		try {
			EditoraDTO editora = editoraService.buscarEditora(codigo);
			String texto = " Código: " + editora.getCodigo() + " \n Nome: "
			+ editora.getNome() + " \n CNPJ: " + editora.getCnpj() + " \n Endereço: " + editora.getEndereco() + "\n\nLivros vinculados:\n\n";
			//
			Map livros = editoraService.getLivros();
			Livro livro;
			//
	        for (Object o : livros.keySet()) {
	        	livro = (Livro) livros.get(o);
	        	texto = texto + " codigo: " + livro.getCodigo() + " nome: " + livro.getNome() + "\n";	            
	        }		
			//
			return texto;
		} catch (DaoException e) {
			System.out.println(e.getMessage());
			return "";
		}
	}

	public static void alterarEditora(int codigo, String nome, String cnpj, String endereco) {
		EditoraDTO editoraDTO = new EditoraDTO(codigo, nome, cnpj, endereco);
		try {
			editoraService.alterarEditora(editoraDTO);
			System.out.println("Editora alterado com sucesso.");
		} catch (ServiceException e) {
			System.out.println(e.getTipo());
		} catch (DaoException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void removerEditora(int codigo) throws DaoException {
		Scanner teclado2 = new Scanner(System.in);
		int op2 = 0;
		System.out.println(" Código: " + editoraService.buscarEditora(codigo).getCodigo() + " \n Nome: "
				+ editoraService.buscarEditora(codigo).getNome() + " \n CNPJ: " + editoraService.buscarEditora(codigo).getCnpj() + " \n Edenreço: " + editoraService.buscarEditora(codigo).getEndereco());
	do {
		separador();
		System.out.println("1 - Confirmar exclusão!");
		System.out.println("2 - Cancelar exclusão!");
		separador();
		op2 = teclado2.nextInt();

		if (op2 == 1) {

		try {
			editoraService.removerEditora(codigo);
			separador();
			System.out.println("Editora removida com sucesso.");
			separador();
		} catch (DaoException e) {
			System.out.println(e.getMessage());
		}
	}}	while ((op2 != 1) && (op2 != 2));
	}

	public static void criarLivro(int codigo, String nome, int codigoEditora, String autor, String edicao, String volume) {
		//
		LivroDTO livroDTO = new LivroDTO(codigo, nome, codigoEditora, autor, edicao, volume);
		try {
			livroService.cadastrarLivro(livroDTO);
			separador();
			System.out.println("Livro cadastrado com sucesso.");
			separador();
			
		} catch (ServiceException e) {
			System.out.println(e.getTipo());
		} catch (DaoException e) {
			System.out.println(e.getMessage());
		}				

	}

	public static String buscarLivro(int codigo) {

		try {
			LivroDTO livro = livroService.buscarLivro(codigo);
			EditoraDTO editora = editoraService.buscarEditora(livro.getCodigoEditora());
			//
			return " Código: " + livro.getCodigo() + " \n Nome: "
					+ livro.getNome() + " \n Editora: "+ editora.getNome() +" \n Autor: "+ livro.getAutor() + " \n Edicao: " + livro.getEdicao() + " \n Volume: "
					 + livro.getVolume();
		} catch (DaoException e) {
			System.out.println(e.getMessage());
			return "";
		}
	}

	public static void alterarLivro(int codigo, String nome, int codigoEditora, String autor, String edicao, String volume) {
		LivroDTO livroDTO = new LivroDTO(codigo, nome, codigoEditora, autor, edicao, volume);
		try {
			livroService.alterarLivro(livroDTO);
			System.out.println("Livro alterado com sucesso.");
		} catch (ServiceException e) {
			System.out.println(e.getTipo());
		} catch (DaoException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void removerLivro(int codigo) throws DaoException {
		Scanner teclado2 = new Scanner(System.in);
		int op2 = 0;
		System.out.println(" Código: " + livroService.buscarLivro(codigo).getCodigo() + " - Nome: "
				+ livroService.buscarLivro(codigo).getNome() + " \n Autor: " + livroService.buscarLivro(codigo).getAutor()
				 + " \n Edicao: " + livroService.buscarLivro(codigo).getEdicao() + " \n Volume: " + livroService.buscarLivro(codigo).getVolume());
	do {
		separador();
		System.out.println("1 - Confirmar exclusão!");
		System.out.println("2 - Cancelar exclusão!");
		separador();
		op2 = teclado2.nextInt();

		if (op2 == 1) {

		try {
			livroService.removerLivro(codigo);
			separador();
			System.out.println("Livro removida com sucesso.");
			separador();
		} catch (DaoException e) {
			System.out.println(e.getMessage());
		}
	}}	while ((op2 != 1) && (op2 != 2));
	}	
	
	public static void separador()
	{
		System.out.println("===============================");
	}
}
