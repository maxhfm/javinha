package service;

import java.util.Collection;

import dao.EspecialidadeDAO;
import dto.EspecialidadeDTO;
import entity.Especialidade;
import exception.DaoException;
import exception.ServiceException;
import exception.ServiceExceptionEnum;

public class EspecialidadeService {
	private EspecialidadeDAO dao;

	public EspecialidadeService() {
		this.dao = EspecialidadeDAO.getInstance();
	}

	public EspecialidadeDTO buscarEspecialidade(int codigo) throws DaoException {
		try{
			EspecialidadeDTO especDTO = new EspecialidadeDTO(dao.getEspecialidade(codigo).getCodigo(), dao
					.getEspecialidade(codigo).getNome());
			return especDTO;
		}
		catch(DaoException e)
		{
			throw new DaoException("A especialidade informada não existe");
		}
	}

	public void cadastrarEspecialidade(EspecialidadeDTO especDTO) throws ServiceException,
			DaoException {
		if ((especDTO.getCodigo() < 1) || (especDTO.getCodigo() > 99)) {
			throw new ServiceException(
					ServiceExceptionEnum.ESPECIALIDADE_CODIGO_INVALIDO);
		}
		if ((especDTO.getNome().length() < 1)
				|| (especDTO.getNome().length() > 20)) {
			throw new ServiceException(ServiceExceptionEnum.ESPECIALIDADE_NOME_INVALIDO);
		}

		Especialidade espec = new Especialidade(especDTO.getCodigo(), especDTO.getNome());

		try {
			dao.addEspecialidade(espec);
		} catch (DaoException e) {
			throw new DaoException("Erro no banco de dados");
		}
	}

	public void alterarEspecialidade(EspecialidadeDTO especialidadeDTO) throws ServiceException,
			DaoException {
		if ((especialidadeDTO.getCodigo() < 1) || (especialidadeDTO.getCodigo() > 99)) {
			throw new ServiceException(
					ServiceExceptionEnum.ESPECIALIDADE_CODIGO_INVALIDO);
		}
		if ((especialidadeDTO.getNome().length() < 1)
				|| (especialidadeDTO.getNome().length() > 20)) {
			throw new ServiceException(ServiceExceptionEnum.ESPECIALIDADE_NOME_INVALIDO);
		}

		Especialidade especialidade = new Especialidade(especialidadeDTO.getCodigo(), especialidadeDTO.getNome());

		try {
			dao.updateEspecialidade(especialidade);
		} catch (DaoException e) {
			throw new DaoException("Erro no banco de dados");
		}
	}

	public void removerEspecialidade(int codigo) throws DaoException {
		try {
			dao.removeEspecialidade(codigo);
		}
		catch(DaoException e)
		{
			throw new DaoException("A especialidade informada não existe");
		}
	}
}
