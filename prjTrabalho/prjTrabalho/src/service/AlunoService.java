package service;

import java.util.Collection;

import dao.AlunoDAO;
import dto.AlunoDTO;
import entity.Aluno;
import exception.DaoException;
import exception.ServiceException;
import exception.ServiceExceptionEnum;

public class AlunoService {
	private AlunoDAO dao;

	public AlunoService() {
		this.dao = AlunoDAO.getInstance();
	}

	public AlunoDTO buscarAluno(int codigo) throws DaoException {
		try{
			AlunoDTO alunoDTO = new AlunoDTO(dao.getAluno(codigo).getCodigo(), dao.getAluno(codigo).getNome(),dao.getAluno(codigo).getProfissao(),dao.getAluno(codigo).getCodigoEspecialidade());
			return alunoDTO;
		}
		catch(DaoException e)
		{
			throw new DaoException("A livro informada não existe");
		}
	}

	public void cadastrarAluno(AlunoDTO alunoDTO) throws ServiceException,
			DaoException {
		if ((alunoDTO.getCodigo() < 1) || (alunoDTO.getCodigo() > 99)) {
			throw new ServiceException(
					ServiceExceptionEnum.ALUNO_CODIGO_INVALIDO);
		}
		
		if ((alunoDTO.getNome().length() < 1) || (alunoDTO.getNome().length() > 20)) {
			throw new ServiceException(ServiceExceptionEnum.ALUNO_NOME_INVALIDO);
		}
		
		if ((alunoDTO.getCodigoEspecialidade() < 1) || (alunoDTO.getCodigoEspecialidade() > 99)) {
			throw new ServiceException(
					ServiceExceptionEnum.ESPECIALIDADE_CODIGO_INVALIDO);
		}
		
		Aluno aluno = new Aluno(alunoDTO.getCodigo(), alunoDTO.getNome(), alunoDTO.getProfissao(), alunoDTO.getCodigoEspecialidade());

		try {
			dao.addAluno(aluno);
		} catch (DaoException e) {
			throw new DaoException("Erro no banco de dados");
		}
	}

	public void alterarAluno(AlunoDTO alunoDTO) throws ServiceException,
			DaoException {
		if ((alunoDTO.getCodigo() < 1) || (alunoDTO.getCodigo() > 99)) {
			throw new ServiceException(
					ServiceExceptionEnum.ALUNO_CODIGO_INVALIDO);
		}
		if ((alunoDTO.getNome().length() < 1)
				|| (alunoDTO.getNome().length() > 20)) {
			throw new ServiceException(ServiceExceptionEnum.ALUNO_NOME_INVALIDO);
		}
		if ((alunoDTO.getCodigoEspecialidade() < 1) || (alunoDTO.getCodigoEspecialidade() > 99)) {
			throw new ServiceException(
					ServiceExceptionEnum.ESPECIALIDADE_CODIGO_INVALIDO);
		}
		Aluno livro = new Aluno(alunoDTO.getCodigo(), alunoDTO.getNome(), alunoDTO.getProfissao(), alunoDTO.getCodigoEspecialidade());

		try {
			dao.updateAluno(livro);
		} catch (DaoException e) {
			throw new DaoException("Erro no banco de dados");
		}
	}

	public void removerAluno(int codigo) throws DaoException {
		try {
			dao.removeAluno(codigo);
		}
		catch(DaoException e)
		{
			throw new DaoException("O livro informada não existe");
		}
	}
}
