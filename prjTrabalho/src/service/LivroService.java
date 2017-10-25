package service;

import java.util.Collection;

import dao.LivroDAO;
import dto.EditoraDTO;
import dto.LivroDTO;
import entity.Livro;
import exception.DaoException;
import exception.ServiceException;
import exception.ServiceExceptionEnum;

public class LivroService {
	private LivroDAO dao;
	private EditoraService editoraService = new EditoraService();

	public LivroService() {
		this.dao = LivroDAO.getInstance();
	}

	public LivroDTO buscarLivro(int codigo) throws DaoException {
		try{
			LivroDTO livroDTO = new LivroDTO(dao.getLivro(codigo).getCodigo(), dao
					.getLivro(codigo).getNome(),dao.getLivro(codigo).getEditora().getCodigo(), dao.getLivro(codigo).getAutor(), dao.getLivro(codigo).getEdicao(), dao.getLivro(codigo).getVolume());
			return livroDTO;
		}
		catch(DaoException e)
		{
			throw new DaoException("A livro informada não existe");
		}
	}
	
	public EditoraDTO buscarEditora(int codigo) throws DaoException {
		try{
			return editoraService.buscarEditora(codigo);
		}
		catch(DaoException e)
		{
			throw new DaoException("A livro informada não existe");
		}
	}	

	public void cadastrarLivro(LivroDTO livroDTO) throws ServiceException,
			DaoException {
		if ((livroDTO.getCodigo() < 1) || (livroDTO.getCodigo() > 99)) {
			throw new ServiceException(
					ServiceExceptionEnum.LIVRO_CODIGO_INVALIDO);
		}
		if ((livroDTO.getNome().length() < 1)
				|| (livroDTO.getNome().length() > 20)) {
			throw new ServiceException(ServiceExceptionEnum.LIVRO_NOME_INVALIDO);
		}
		if ((livroDTO.getCodigoEditora() < 1) || (livroDTO.getCodigoEditora() > 99)) {
			throw new ServiceException(
					ServiceExceptionEnum.EDITORA_CODIGO_INVALIDO);
		}
		EditoraDTO editoraDTO = this.buscarEditora(livroDTO.getCodigoEditora());
		Livro livro = new Livro(livroDTO.getCodigo(), livroDTO.getNome(), editoraService.getEditoraDAO().getEditora(editoraDTO.getCodigo()), livroDTO.getAutor(), livroDTO.getEdicao(), livroDTO.getVolume());

		try {
			dao.addLivro(livro);
		} catch (DaoException e) {
			throw new DaoException("Erro no banco de dados");
		}
	}

	public void alterarLivro(LivroDTO livroDTO) throws ServiceException,
			DaoException {
		if ((livroDTO.getCodigo() < 1) || (livroDTO.getCodigo() > 99)) {
			throw new ServiceException(
					ServiceExceptionEnum.LIVRO_CODIGO_INVALIDO);
		}
		if ((livroDTO.getNome().length() < 1)
				|| (livroDTO.getNome().length() > 20)) {
			throw new ServiceException(ServiceExceptionEnum.LIVRO_NOME_INVALIDO);
		}
		if ((livroDTO.getCodigoEditora() < 1) || (livroDTO.getCodigoEditora() > 99)) {
			throw new ServiceException(
					ServiceExceptionEnum.EDITORA_CODIGO_INVALIDO);
		}
		Livro livro = new Livro(livroDTO.getCodigo(), livroDTO.getNome(), editoraService.getEditora(), livroDTO.getAutor(), livroDTO.getEdicao(), livroDTO.getVolume());

		try {
			dao.updateLivro(livro);
		} catch (DaoException e) {
			throw new DaoException("Erro no banco de dados");
		}
	}

	public void removerLivro(int codigo) throws DaoException {
		try {
			dao.removeLivro(codigo);
		}
		catch(DaoException e)
		{
			throw new DaoException("O livro informada não existe");
		}
	}
}
