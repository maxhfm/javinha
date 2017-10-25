package main;

import java.util.Scanner;

import service.EspecialidadeService;
import dto.EspecialidadeDTO;
import service.AlunoService;
import dto.AlunoDTO;
import exception.DaoException;
import exception.ServiceException;

public class Programa {
	private static Scanner teclado = new Scanner(System.in);
	private static EspecialidadeService especialidadeService = new EspecialidadeService();
	private static AlunoService alunoService = new AlunoService();

	public static void main(String[] args) throws DaoException {
		int op = 0;
		boolean sair = false;
		boolean sair2 = false;
		
		do {
			
			//
			System.out.println("PROGRAMA ACADEMIA SPORTFUTURE");
			System.out.println("Escolha a operação desejada:");
			System.out.println("\n");
			System.out.println("1 - Controle de Especialidade");
			System.out.println("2 - Controle de Aluno");
			System.out.println("3 - Sair");
			//
			op = teclado.nextInt();
			//
			if(op == 1)
			{
				do {
					sair2 = false;
					System.out.println("PROGRAMA ACADEMIA SPORTFUTURE");
					System.out.println("Controle Especialidade");
					System.out.println("\n");
					System.out.println("1 - Cadastrar especialidade");
					System.out.println("2 - Pesquisar especialidade");
					System.out.println("3 - Alterar especialidade");
					System.out.println("4 - Remover especialidade");
					System.out.println("5 - Voltar");
					System.out.println("");
		
					op = teclado.nextInt();
		
					if (op == 1) {
						System.out.println("Informe o código da especialidade: ");
						int codigo = teclado.nextInt();
						System.out.println("Informe o nome da especialidade: ");
						String nome = teclado.next();
						criarEspecialidade(codigo, nome);
					} else if (op == 2) {
						System.out.println("Informe o código da especialidade: ");
						int codigo = teclado.nextInt();
						System.out.println("\n");
						System.out.println(buscarEspecialidade(codigo));
						System.out.println("\n");
						System.out.println("1 = Voltar");
						op = teclado.nextInt();						
					} else if (op == 3) {
						System.out.println("Informe o código da especialidade: ");
						int codigo = teclado.nextInt();
						System.out.println("Informe o nome do especialidade: ");
						String nome = teclado.next();
						alterarEspecialidade(codigo, nome);
					} else if (op == 4) {
						System.out.println("Informe o código do especialidade: ");
						int codigo = teclado.nextInt();
						removerEspecialidade(codigo);
					} else if (op == 5) {
						sair2 = true;
					} else {
						System.out.println("Digite um código válido");
					}				
				
				} while (!sair2);			
			}else if(op == 2){
				do {
					sair2 = false;
					System.out.println("PROGRAMA ACADEMIA SPORTFUTURE");
					System.out.println("Controle Aluno");
					System.out.println("\n");
					System.out.println("1 - Cadastrar aluno");
					System.out.println("2 - Buscar aluno");
					System.out.println("3 - Alterar aluno");
					System.out.println("4 - Remover aluno");
					System.out.println("5 - Voltar");
					System.out.println("");
		
					op = teclado.nextInt();
		
					if (op == 1) {
						System.out.println("Informe o código do aluno: ");
						int codigo = teclado.nextInt();
						
						System.out.println("Informe o nome do aluno: ");
						String nome = teclado.next();
						
						System.out.println("Informe a profissao: ");
						String profissao = teclado.next();
						
						System.out.println("Informe o código da especialidade: ");
						int codigoEspecialidade = teclado.nextInt();
						
						criarAluno(codigo, nome, profissao, codigoEspecialidade);
					} else if (op == 2) {
						System.out.println("Informe o código do aluno: ");
						int codigo = teclado.nextInt();
						System.out.println("\n");
						System.out.println(buscarAluno(codigo));
						System.out.println("\n");
						System.out.println("1 = Voltar");
						op = teclado.nextInt();						
					} else if (op == 3) {
						System.out.println("Informe o código do aluno: ");
						int codigo = teclado.nextInt();
						
						System.out.println("Informe o nome do aluno: ");
						String nome = teclado.next();
						
						System.out.println("Informe a profissao: ");
						String profissao = teclado.next();
												
						System.out.println("Informe o código da especialidade: ");
						int codigoEspecialidade = teclado.nextInt();							
						
						alterarAluno(codigo, nome, profissao, codigoEspecialidade);
					} else if (op == 4) {
						System.out.println("Informe o código do aluno: ");
						int codigo = teclado.nextInt();
						removerAluno(codigo);
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

	public static void criarEspecialidade(int codigo, String nome) {
		EspecialidadeDTO especialidadeDTO = new EspecialidadeDTO(codigo, nome);
		try {
			especialidadeService.cadastrarEspecialidade(especialidadeDTO);
			System.out.println("\n");
			System.out.println("Especialidade cadastrada com sucesso.");
			System.out.println("\n");
			
		} catch (ServiceException e) {
			System.out.println(e.getTipo());
		} catch (DaoException e) {
			System.out.println(e.getMessage());
		}
	}

	public static String buscarEspecialidade(int codigo) {

		try {
			EspecialidadeDTO especialidade = especialidadeService.buscarEspecialidade(codigo);
			return "Código: " + especialidade.getCodigo() + " - Nome: "
					+ especialidade.getNome();
		} catch (DaoException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	public static void alterarEspecialidade(int codigo, String nome) {
		EspecialidadeDTO especialidadeDTO = new EspecialidadeDTO(codigo, nome);
		try {
			especialidadeService.alterarEspecialidade(especialidadeDTO);
			System.out.println("Especialidade alterado com sucesso.");
		} catch (ServiceException e) {
			System.out.println(e.getTipo());
		} catch (DaoException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void removerEspecialidade(int codigo) throws DaoException {
		Scanner teclado2 = new Scanner(System.in);
		int op2 = 0;
		System.out.println("Código da Especialidade: " + especialidadeService.buscarEspecialidade(codigo).getCodigo() + " - Nome: "
				+ especialidadeService.buscarEspecialidade(codigo).getNome());
	do {
		System.out.println("\n");
		System.out.println("1 - Confirmar exclusão!");
		System.out.println("2 - Cancelar exclusão!");
		System.out.println("\n");
		op2 = teclado2.nextInt();

		if (op2 == 1) {

		try {
			especialidadeService.removerEspecialidade(codigo);
			System.out.println("\n");
			System.out.println("Especialidade removida com sucesso.");
			System.out.println("\n");
		} catch (DaoException e) {
			System.out.println(e.getMessage());
		}
	}}	while ((op2 != 1) && (op2 != 2));
	}

	public static void criarAluno(int codigo, String nome, String profissao, int codigoEspecialidade) {
		try {
			EspecialidadeDTO especialidade = especialidadeService.buscarEspecialidade(codigoEspecialidade);
			//
			AlunoDTO alunoDTO = new AlunoDTO(codigo, nome, profissao, codigoEspecialidade);
			try {
				alunoService.cadastrarAluno(alunoDTO);
				System.out.println("\n");
				System.out.println("Aluno cadastrado com sucesso.");
				System.out.println("\n");
				
			} catch (ServiceException e) {
				System.out.println(e.getTipo());
			} catch (DaoException e) {
				System.out.println(e.getMessage());
			}			

		} catch (DaoException e) {
			System.out.println(e.getMessage());
		}		

	}

	public static String buscarAluno(int codigo) {

		try {
			AlunoDTO aluno = alunoService.buscarAluno(codigo);
			EspecialidadeDTO especialidade = especialidadeService.buscarEspecialidade(aluno.getCodigoEspecialidade());
			//
			return "Código: " + aluno.getCodigo() + " - Nome: "
					+ aluno.getNome() + " - Especialidade: "+ especialidade.getNome();
		} catch (DaoException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	public static void alterarAluno(int codigo, String nome, String profissao, int codigoEspecialidade) {
		AlunoDTO alunoDTO = new AlunoDTO(codigo, nome, profissao, codigoEspecialidade);
		try {
			alunoService.alterarAluno(alunoDTO);
			System.out.println("Aluno alterado com sucesso.");
		} catch (ServiceException e) {
			System.out.println(e.getTipo());
		} catch (DaoException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void removerAluno(int codigo) throws DaoException {
		Scanner teclado2 = new Scanner(System.in);
		int op2 = 0;
		System.out.println("Código da Aluno: " + alunoService.buscarAluno(codigo).getCodigo() + " - Nome: "
				+ alunoService.buscarAluno(codigo).getNome());
	do {
		System.out.println("\n");
		System.out.println("1 - Confirmar exclusão!");
		System.out.println("2 - Cancelar exclusão!");
		System.out.println("\n");
		op2 = teclado2.nextInt();

		if (op2 == 1) {

		try {
			alunoService.removerAluno(codigo);
			System.out.println("\n");
			System.out.println("Aluno removida com sucesso.");
			System.out.println("\n");
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
